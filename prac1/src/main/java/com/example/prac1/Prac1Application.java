package com.example.prac1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prac1Application {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");

		Vehicle obj=(Vehicle)context.getBean("bike"); //inside this string we can writ bike to call bike or car to call car function
		obj.drive();

	}

}

