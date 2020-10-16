package com.gmail.markorovi24.Vehiculos;


public class VehiculoBuilder extends Vehiculo implements IBuilder {

    private Object vehiculo;

    public void reset() {
        this.vehiculo = new Vehiculo();
    }

    @Override
    public void setMarca(String marca) {

        this.marca = marca;
    }

    @Override
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Vehiculo getVehiculo(){
        return (Vehiculo) vehiculo;
    }

}
