package com.gmail.markorovi24.main;

import com.gmail.markorovi24.Usuarios.Usuario;
import com.gmail.markorovi24.Vehiculos.Vehiculo;
import com.gmail.markorovi24.Vehiculos.VehiculoBuilder;
import com.gmail.markorovi24.Vehiculos.Director;
import com.gmail.markorovi24.Facebook.SingletonFacebook;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){
        Director director = new Director();
        VehiculoBuilder constructor = new VehiculoBuilder();

        director.createMicroBus(constructor);
        Vehiculo v1 = constructor.getVehiculo();

        director.createCamion(constructor);
        Vehiculo v2 = constructor.getVehiculo();

        director.createMoto(constructor);
        Vehiculo v3 = constructor.getVehiculo();

        director.createCuadra(constructor);
        Vehiculo v4 = constructor.getVehiculo();

        director.createPickUp(constructor);
        Vehiculo v5 = constructor.getVehiculo();

        director.createScooter(constructor);
        Vehiculo v6 = constructor.getVehiculo();

        director.createLambo(constructor);
        Vehiculo v7 = constructor.getVehiculo();

        director.createZSMieo(constructor);
        Vehiculo v8 = constructor.getVehiculo();

        director.createBarato(constructor);
        Vehiculo v9 = constructor.getVehiculo();





        // Usuario u1 = new Usuario(208330897, 85394739, new SimpleDateFormat("11/12/2015"), "Alajuela, San Carlos, Monterrey", "google.com/fotos", true);

        System.out.println(SingletonFacebook.getInstance().GetNombre());
    }
}
