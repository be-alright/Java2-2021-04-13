package com.cindy;

public class Racing {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        Horse h2 = new Horse();
        HorseRunnable h3 = new HorseRunnable();
        Thread thread = new Thread(h3);
        thread.start();
        h1.start();
        h2.start();

        //for (int i = 0; i < 10000; i++) {
        //System.out.println(name1 +  " " + i);
    }
}

