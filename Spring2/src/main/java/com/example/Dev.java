package com.example;

public class Dev {

   private Computer com;


// These will run only when object is created of Dev Class
public Dev(){System.out.println("These is Dev Container ");}

/// Getter & Setters for Both Laptop & Desktop(Computer Interface)
 public Computer getCom() {
        return com;
    }

 public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
     System.out.println("Working on Awesome Project");
     com.compile();
}

}
