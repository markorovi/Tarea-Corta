package com.gmail.markorovi24.Facebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class SingletonFacebook {
    
    private static SingletonFacebook facebook;
    private Map<Integer, String> nombres;
    private Random ran;

    private SingletonFacebook() {
        System.out.println("Solicitando nombre a Facebook.com");

        try{
            Thread.sleep(400);
            System.out.print(".");

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        this.ran = new Random();

        try{
            Thread.sleep(400);
            System.out.print(".");

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        nombres = new HashMap<>();

        try{
            Thread.sleep(400);
            System.out.print(".");

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        this.nombres.put(1, "Pedro Juárez");
        this.nombres.put(2, "Juliana Macís");
        this.nombres.put(3, "Karen Cascante");
        this.nombres.put(4, "Pedro Picapiedra");
        this.nombres.put(5, "Sergei Montezkyu");
        this.nombres.put(6, "Juan");
        this.nombres.put(7, "Elsa Po");
        this.nombres.put(8, "Popeye El Marino");
        this.nombres.put(9, "Allan Brito Delgado");
        this.nombres.put(10, "Sacarías Piedras del Río");
        this.nombres.put(11, "Ganoza B El Diamante");
        this.nombres.put(12, "Tío Cosa");
        this.nombres.put(13, "Elmer Gruñón");
        this.nombres.put(14, "San Bigotes");
        this.nombres.put(15, "Jonnathan McDonald");
        this.nombres.put(16, "Leando Gado");
        this.nombres.put(17, "Jimmy Neutrón");
        this.nombres.put(18, "Kick Buttowski");
        this.nombres.put(19, "Pinky");
        this.nombres.put(20, "Cerebro");

        try{
            Thread.sleep(400);
            System.out.println(".");

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }try{
            Thread.sleep(400);

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Listo.");
    }

    public synchronized static SingletonFacebook getInstance() {
        if (facebook == null) {
            facebook = new SingletonFacebook();
        }
        return facebook;
    }

    public String GetNombre(){
        return this.nombres.get(ran.nextInt());
    }
}
