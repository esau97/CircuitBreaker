package com.nttdata.bootcamp;


public class Main {
    public static void main(String[] args) {
        CircuitBreaker circuitBreaker = new CircuitBreaker();

        for (int i = 0; i < 15; i++) {
            if(circuitBreaker.getContador()>10 && circuitBreaker.getContador()<15){
                circuitBreaker.open();
            }else if(circuitBreaker.getContador()==15)
                circuitBreaker.close();
        }
        Retry retry = new Retry();
        for (int i=0;i<10;i++){
            retry.retry();
            System.out.println("He fallado "+retry.getContador());
            if (retry.getContador()==7){
                return;
            }
        }
    }
}
