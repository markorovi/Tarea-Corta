package com.gmail.markorovi24.Usuarios;

public interface IBuilder {
    void setPerfilFacebook(String perfilFacebook);
    void setCedula(int cedula);
    void setTelefono(int telefono);
    void setVencimiento(String fecha);
    void setResidencia(String residencia);
    void setFotos(String link);
    void setDeBaja(boolean valor);
    String getPerfilFacebook();
    int getCedula();
    int getTelefono();
    String getVencimiento();
    String getResidencia();
    String getFotos();
    boolean getDeBaja();
}
