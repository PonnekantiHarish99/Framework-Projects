package com.vcube.hellospringapp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext contex = new ClassPathXmlApplicationContext("spring.xml");
        
       Student st = (Student) contex.getBean("st");
       System.out.println(st.getAddress());
       
       Student1 st1 = (Student1) contex.getBean("st1");
       System.out.println(st1);
    }
}
