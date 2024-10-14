package com.example.prac;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracApplication {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");

		Vehicle obj=(Vehicle)context.getBean("bike");
		obj.drive();

	}

}
