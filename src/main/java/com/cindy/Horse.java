package com.cindy;

public class Horse extends Thread{          //Thread執行緒
    @Override                               //Ctrl+o 找run...
    public void run() {
        for(int i=0; i<10000;i++){
           // System.out.println("Horse2" +  " " + i);
            System.out.println(getName()+" "+i);
        }
    }
}
