package com.gmail.markorovi24.Usuarios;

import java.text.DateFormat;

public class UsuarioBuilder extends Usuario implements IBuilder{


    @Override
    public void setPerfilFacebook(String perfilFacebook) {
        this.perfilFacebook = perfilFacebook;
    }

    @Override
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public void setTelefono(int telefono) {
        this.numeroTelefono = telefono;
    }

    @Override
    public void setVencimiento(String fecha) {
        this.fechaVencimiento = fecha;
    }

    @Override
    public void setResidencia(String residencia) {
        this.direccionResidencia = residencia;
    }

    @Override
    public void setFotos(String link) {
        this.linkFotos = link;
    }

    @Override
    public void setDeBaja(boolean valor) {
        this.deBaja = valor;
    }

    @Override
    public String getPerfilFacebook() {
        return this.perfilFacebook;
    }

    @Override
    public int getCedula() {
        return this.cedula;
    }

    @Override
    public int getTelefono() {
        return this.numeroTelefono;
    }

    @Override
    public DateFormat getVencimiento() {
        return this.fechaVencimiento;
    }

    @Override
    public String getResidencia() {
        return this.direccionResidencia;
    }

    @Override
    public String getFotos() {
        return this.linkFotos;
    }

    @Override
    public boolean getDeBaja() {
        return this.deBaja;
    }
}
