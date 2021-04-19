package com.tom.racing;

public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("RR " + i);
        }
    }
}
