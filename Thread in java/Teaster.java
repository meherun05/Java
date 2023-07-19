package com.example.demo;

class Teaster {
    public static void main(String[] args) {
        PrintThread p = new PrintThread("A");
        Thread pThread = new Thread(p);
        PrintThread q = new PrintThread("B");
        Thread qThread = new Thread(q);
        qThread.start();
        pThread.start();
    }
}