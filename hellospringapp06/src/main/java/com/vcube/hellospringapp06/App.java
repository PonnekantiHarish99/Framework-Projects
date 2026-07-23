package com.vcube.hellospringapp06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        
       Car c1=(Car) context.getBean("car");
       
       c1.drive();
    }
}
