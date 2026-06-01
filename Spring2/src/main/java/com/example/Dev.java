package com.example;

public class Dev {

    // Dependency of Dev class.
    // Notice that we are using the interface type instead of a concrete class such as Laptop or Desktop.
    // This makes the class loosely coupled.
    // Spring can inject Laptop, Desktop, or any future Computer implementation.
    private Computer com;

    // Executes when the Dev bean is created.
    public Dev() {
        System.out.println("This is Dev Container");
    }

    // ----------------------------------
    // Getter & Setter Injection
    // ----------------------------------

    // Getter for Computer dependency
    public Computer getCom() {
        return com;
    }

    // Spring uses this setter method
    // to inject the required Computer bean.
    public void setCom(Computer com) {
        this.com = com;
    }

    // Business Method
    public void build() {

        System.out.println("Working on Awesome Project");

        // Dev does not know whether it received a Laptop or Desktop.
        // The entire config is in spring.xml which takes care of it
        // It simply calls the compile() method
        // defined by the Computer interface.
        com.compile();
    }
}