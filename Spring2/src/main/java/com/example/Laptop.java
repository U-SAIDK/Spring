package com.example;

public class Laptop implements Computer {

public Laptop(){
//  These will run only when object is created of these class
    System.out.println("Laptop Constructor");
}


public void compile(){
     System.out.println("Compiling in Laptop  ");
}
}
