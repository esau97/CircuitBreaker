package com.nttdata.bootcamp;


public class CircuitBreaker {
    int contador=0;

    public int getContador() {
        return contador;
    }

    public void close(){
        System.out.println("El coche no arranca");
    }
    public void open(){
        try {
            System.out.println("Debe llevar el coche al taller antes de los 1000km");
            Thread.sleep(2000);
            half_open();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void half_open(){
        if (contador==15){
            close();
        }else
            open();
        contador++;
    }

}
