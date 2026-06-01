package com.example;

public class Laptop implements Computer {

    // Constructor executes whenever
    // a Laptop bean/object is created.
    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    public void compile() {
        System.out.println("Compiling in Laptop");
    }
}