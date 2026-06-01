/// Example of using the Spring Framework (NOT Spring Boot)
// Spring Boot is built on top of the Spring Framework
// and provides auto-configuration and embedded servers.

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {

        // -----------------------------
        // Traditional Java Object Creation
        // -----------------------------
        // Dev obj = new Dev();
        // obj.build();

        // -----------------------------
        // Using Spring Framework
        // -----------------------------

        // Creates the Spring IoC Container.
        // The container reads the XML configuration file (spring.xml),
        // creates objects (beans), manages their lifecycle,
        // and injects dependencies automatically.

        // ApplicationContext is an interface,
        // so we create an object of its implementation class:
        // ClassPathXmlApplicationContext

        // spring.xml must be present inside the classpath
        // (Created usually under src/main/resources).
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // Fetch the bean with id="dev" from the Spring Container.
        // Spring returns the already created/managed object.
        Dev obj = (Dev) context.getBean("dev");

        // System.out.println(obj.getAge());

        obj.build();
    }
}