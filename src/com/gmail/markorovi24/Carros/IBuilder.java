package com.gmail.markorovi24.Carros;

public interface IBuilder {
    void setMarca(String marca);
    void setPasajeros(int pasajeros);
    void setCombustible(String combustible);
    void setPrecio(int precio);
    void setPuertas(int puertas);
    void setTipo(String tipo);
    String getMarca();
    int getPasajeros();
    String getCombustible();
    int getPrecio();
    int getPuertas();
    String getTipo();
}
