/// Example of using the Spring Framework (NOT Spring Boot)
// Spring Boot is built on top of the Spring Framework.
//
// This example is similar to the previous one,
// but here we avoid hard-coding a specific implementation
// such as Laptop inside the Dev class.
//
// Instead, we use the Computer interface and let Spring decide
// which implementation (Laptop or Desktop) should be injected.
//
// Bean configuration and dependency wiring are done in spring.xml.

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {

        // ---- Traditional Java Object Creation -------
        // Dev obj = new Dev();
        // obj.build();


        // ------ Using Spring Framework ------
        // Creates the Spring IoC Container -> The container reads spring.xml -> creates the required beans -> injects dependencies -> manages Bean lifecycle

        // ApplicationContext is an interface.
        // ClassPathXmlApplicationContext is one of its implementations
        // that loads configuration from an XML file.
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // Fetch the Dev bean from the Spring Container.
        // Spring automatically returns the object and its dependencies.
        Dev obj = context.getBean(Dev.class);

        // System.out.println(obj.getAge());

        obj.build();
    }
}