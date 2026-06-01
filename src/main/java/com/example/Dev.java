package com.example;

public class Dev {

   private Laptop laptop;
   private int age;



// These will run only when object is created of Dev Class
public Dev(){System.out.println("These is Dev Container ");}

/// Constructor Injection (Parametarized Constructor)

public Dev (int age){
    this.age = age;
    System.out.println("Dev1 Constructor");
}

    public Dev(Laptop laptop){
        this.laptop = laptop;
        System.out.println("Dev Constructor(Laptop)");
    }




/// Setter Injection for Dev :-
public int getAge(){
    return age;
}
public void setAge(int age){
this.age = age;
}

/// Setter Injection for Laptop:-
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
     System.out.println("Dev Working on Awesome Project");
     laptop.compile();
}

}
