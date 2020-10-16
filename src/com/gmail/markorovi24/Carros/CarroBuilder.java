package com.gmail.markorovi24.Carros;

public class CarroBuilder extends Carro implements IBuilder{

    private Object Carro;

    public void reset() {
        this.Carro = new Carro();
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
    public Carro getCarro(){
        System.out.println(this.combustible);
        return (Carro) Carro;
    }

}
