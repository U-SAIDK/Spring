package com.example;

public class Desktop implements Computer {

    // Constructor executes when
    // Spring creates a Desktop bean.
    public Desktop() {
        System.out.println("Desktop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compiling with Desktop");
    }
}