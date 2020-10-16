package com.gmail.markorovi24.Usuarios;

import java.text.DateFormat;

public interface IBuilder {
    void setPerfilFacebook(String perfilFacebook);
    void setCedula(int cedula);
    void setTelefono(int telefono);
    void setVencimiento(DateFormat fecha);
    void setResidencia(String residencia);
    void setFotos(String link);
    void setDeBaja(boolean valor);
    String getPerfilFacebook();
    int getCedula();
    int getTelefono();
    DateFormat getVencimiento();
    String getResidencia();
    String getFotos();
    boolean getDeBaja();
}
