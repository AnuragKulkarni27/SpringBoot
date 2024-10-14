package com.example.prac2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prac2Application {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");

		// Vehicle obj=(Vehicle)context.getBean("bike");
		// obj.drive();
		Tyre t=(Tyre) context.getBean("tyre"); 
		System.out.println(t);
	}

}