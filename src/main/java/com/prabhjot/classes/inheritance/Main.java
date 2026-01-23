package com.prabhjot.classes.inheritance;

public class Main {
    public static void main(String[] args) {

    }
}

class Engine {
    void start() {
        System.out.println("Engine Started.");
    }
}

class Car extends Engine {
    private Engine engine = new Engine();
    void driver() {

    }
}
