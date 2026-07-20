package com.vcube.hellospringapp03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//      l1.setBrand("dell");
//      l1.setModel("intel-core");

		Laptop l1 = (Laptop) context.getBean("lp");
		l1.show();

		Laptop l2 = (Laptop) context.getBean("lp");
		l2.show();
		
		Laptop l3 = (Laptop) context.getBean("lp1");
		l3.show();
		
	}
}
