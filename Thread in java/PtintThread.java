package com.example.demo;

class PrintThread extends Thread {
    String name;

    PrintThread(String name) {

        for (int i = 0; i < 5; i++) {
            this.name = name;
        }
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " ==> " + i);
        }

    }
}