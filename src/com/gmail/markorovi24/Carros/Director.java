package com.gmail.markorovi24.Carros;

public class Director {
    public void createPrueba(IBuilder builder){
        builder.reset();
        builder.setMarca("Toyota");
        builder.setPasajeros(4);
        builder.setCombustible("Diesel");
        builder.setPrecio(4000);
        builder.setPuertas(2);
        builder.setTipo("Automovil");
        builder.getCarro();
    }
}
