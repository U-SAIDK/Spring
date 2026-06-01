package com.example;

public class Laptop implements Computer {

    // Constructor executes when
    // Spring creates a Laptop bean.
    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compiling in Laptop");
    }
}