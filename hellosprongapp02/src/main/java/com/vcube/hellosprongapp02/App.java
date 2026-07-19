package com.vcube.hellosprongapp02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Employee emp1= (Employee)context.getBean("Emp1");
       System.out.println(emp1.getEid());
       System.out.println(emp1.getEname());
       System.out.println(emp1.getSalary());
        
    }
}
