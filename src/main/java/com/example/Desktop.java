package com.example;

public class Desktop implements Computer {

    // Constructor executes when Spring creates an object (bean) of this class.
    public Desktop() {
        System.out.println("Desktop Constructor");
    }

    public void compile() {
        System.out.println("Compiling with Desktop");
    }
}