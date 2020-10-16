package com.gmail.markorovi24.main;

import com.gmail.markorovi24.Carros.Carro;
import com.gmail.markorovi24.Carros.CarroBuilder;
import com.gmail.markorovi24.Carros.Director;

public class main {
    public static void main(String[] args){
        Director director = new Director();
        CarroBuilder constructor = new CarroBuilder();

        director.createBarato(constructor);
        Carro c1 = constructor.getCarro();

    }
}
