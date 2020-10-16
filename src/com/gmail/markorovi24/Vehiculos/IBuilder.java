package com.gmail.markorovi24.Vehiculos;

public interface IBuilder {
    void reset();
    void setMarca(String marca);
    void setPasajeros(int pasajeros);
    void setCombustible(String combustible);
    void setPrecio(int precio);
    void setPuertas(int puertas);
    void setTipo(String tipo);
    Vehiculo getCarro();
}
