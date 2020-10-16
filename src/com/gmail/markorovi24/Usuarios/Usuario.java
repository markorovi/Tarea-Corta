package com.gmail.markorovi24.Usuarios;

import java.text.DateFormat;

public class Usuario {
    protected String perfilFacebook;
    protected int cedula;
    protected int numeroTelefono;
    protected DateFormat fechaVencimiento;
    protected String direccionResidencia;
    protected String linkFotos;
    protected boolean deBaja;

    public Usuario(String perfilFacebook, int cedula, int telefono, DateFormat fecha, String direccion, String link, boolean baja){
        this.perfilFacebook = perfilFacebook;
        this.cedula = cedula;
        this.numeroTelefono = telefono;
        this.fechaVencimiento = fecha;
        this.direccionResidencia = direccion;
        this.linkFotos = link;
        this.deBaja = baja;
    }

    public void setPerfilFacebook(String perfilFacebook) {
        this.perfilFacebook = perfilFacebook;
    }


    public String getPerfilFacebook() {
        return this.perfilFacebook;
    }
}
