package com.gmail.markorovi24.main;

import com.gmail.markorovi24.Usuarios.Usuario;
import com.gmail.markorovi24.Vehiculos.Vehiculo;
import com.gmail.markorovi24.Vehiculos.VehiculoBuilder;
import com.gmail.markorovi24.Vehiculos.Director;
import com.gmail.markorovi24.Facebook.SingletonFacebook;

import java.text.SimpleDateFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        Director director = new Director();
        VehiculoBuilder constructor = new VehiculoBuilder();

        SingletonFacebook facebook = SingletonFacebook.getInstance();

        Random ran = new Random();

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





        Usuario u1 = new Usuario(facebook.GetNombre(ran.nextInt()), 208330897, 54921987, new SimpleDateFormat("11/12/2015"), "Alajuela, San Carlos, Monterrey", "google.com/fotos", true);
        Usuario u2 = new Usuario(facebook.GetNombre(ran.nextInt()), 308330897, 85394739, new SimpleDateFormat("08/11/2016"), "Puntarenas, Veracruz, San Juan", "google.com/fotos", false);
        Usuario u3 = new Usuario(facebook.GetNombre(ran.nextInt()), 108330897, 16841357, new SimpleDateFormat("23/03/2014"), "San José, Alajuelita, Alajuelita", "google.com/fotos", true);
        Usuario u4 = new Usuario(facebook.GetNombre(ran.nextInt()), 608330897, 98468763, new SimpleDateFormat("31/01/2013"), "Heredia, Heredia, Santa Lucía", "google.com/fotos", false);


    }
}
