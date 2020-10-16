package com.gmail.markorovi24.Carros;

public class Director {
    public void createBarato(IBuilder builder){
        builder.reset();
        builder.setMarca("Hyundai");
        builder.setPasajeros(4);
        builder.setCombustible("Regular");
        builder.setPrecio(4000);
        builder.setPuertas(4);
        builder.setTipo("Automovil");
    }

    public void createMicroBus(IBuilder builder){
        builder.reset();
        builder.setMarca("Suzuki");
        builder.setPasajeros(12);
        builder.setCombustible("Super");
        builder.setPrecio(6000);
        builder.setPuertas(3);
        builder.setTipo("MicroBus");
    }

    public void createCamion(IBuilder builder){
        builder.reset();
        builder.setMarca("Jac");
        builder.setPasajeros(4);
        builder.setCombustible("Diesel");
        builder.setPrecio(7000);
        builder.setPuertas(2);
        builder.setTipo("Camión");
    }

    public void createMoto(IBuilder builder){
        builder.reset();
        builder.setMarca("Yamaha");
        builder.setPasajeros(2);
        builder.setCombustible("Regular");
        builder.setPrecio(2000);
        builder.setPuertas(0);
        builder.setTipo("Motocicleta");
    }

    public void createCuadra(IBuilder builder){
        builder.reset();
        builder.setMarca("Honda");
        builder.setPasajeros(2);
        builder.setCombustible("Mezcla");
        builder.setPrecio(3000);
        builder.setPuertas(0);
        builder.setTipo("Cuadraciclo");
    }

    public void createPickUp(IBuilder builder){
        builder.reset();
        builder.setMarca("Mitsubishi");
        builder.setPasajeros(4);
        builder.setCombustible("Diesel");
        builder.setPrecio(6000);
        builder.setPuertas(2);
        builder.setTipo("Pick Up");
    }

    public void createScooter(IBuilder builder){
        builder.reset();
        builder.setMarca("Toyasdfasdfota");
        builder.setPasajeros(4);
        builder.setCombustible("Dieseasdghrefgghjertyjl");
        builder.setPrecio(4000);
        builder.setPuertas(2);
        builder.setTipo("Automovil");
    }

    public void createLambo(IBuilder builder){
        builder.reset();
        builder.setMarca("Toyasdfasdfota");
        builder.setPasajeros(4);
        builder.setCombustible("Dieseasdghrefgghjertyjl");
        builder.setPrecio(4000);
        builder.setPuertas(2);
        builder.setTipo("Automovil");
    }

    public void createZSMieo(IBuilder builder){
        builder.reset();
        builder.setMarca("Toyasdfasdfota");
        builder.setPasajeros(4);
        builder.setCombustible("Dieseasdghrefgghjertyjl");
        builder.setPrecio(4000);
        builder.setPuertas(2);
        builder.setTipo("Automovil");
    }
}
