package com.example;

public class Dev {

    // Dependency of Dev class
    // Spring can inject this object using
    // Constructor Injection or Setter Injection.
    private Laptop laptop;

    private int age;

    // Default Constructor
    // Executes when Spring creates Dev bean
    // using the no-argument constructor.
    public Dev() {
        System.out.println("This is Dev Container");
    }

    // ----------------------------------
    // Constructor Injection Examples
    // ----------------------------------

    // Constructor Injection for age
    public Dev(int age) {
        this.age = age;
        System.out.println("Dev1 Constructor");
    }

    // Constructor Injection for Laptop dependency
    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev Constructor(Laptop)");
    }

    // ----------------------------------
    // Setter Injection for age
    // ----------------------------------

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ----------------------------------
    // Setter Injection for Laptop
    // ----------------------------------

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    // Business Method
    public void build() {

        System.out.println("Dev Working on Awesome Project");

        // Dev is using its dependency (Laptop)
        // to perform compilation.
        laptop.compile();
    }
}