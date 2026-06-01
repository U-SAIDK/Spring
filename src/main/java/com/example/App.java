/// These is a Example of Using Spring Framework NOT SPRING BOOT !
// Spring Boot is Built on Top of Spring.




package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

// Normal Manual Object Creation
//    Dev obj = new Dev();
//    obj.build();

/// Using Spring

// These Create the Spring IoC Container & Look in xml file to see which classe's object is to created ;
// Here Application Context is an Interface so can't create obj only the classes that implements it ClassPathXmlApplicationContext();
//  ClassPathXmlApplicationContext(); Create a xml Configuration File paste inside it
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev obj = (Dev)context.getBean("dev");

//        System.out.println(obj.getAge());
        obj.build();

}
}
