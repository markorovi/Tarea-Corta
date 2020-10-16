package com.gmail.markorovi24.main;

import com.gmail.markorovi24.Vehiculos.Vehiculo;
import com.gmail.markorovi24.Vehiculos.VehiculoBuilder;
import com.gmail.markorovi24.Vehiculos.Director;

public class main {
    public static void main(String[] args){
        Director director = new Director();
        Vehiculo constructor = new VehiculoBuilder();

        director.createBarato(constructor);
        Vehiculo c1 = constructor.getVehiculo();

    }
}
