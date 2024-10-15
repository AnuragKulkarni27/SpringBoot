package com.demo.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredApplication{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");
		Car obj=(Car)context.getBean("car");
		obj.drive();
		Bike b=(Bike)context.getBean("bike");
		b.drive();
	}
}
