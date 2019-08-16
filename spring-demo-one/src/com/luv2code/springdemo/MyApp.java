package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);

		// call method on the bean 
		System.out.println(theCoach==alphaCoach);
		System.out.println(theCoach +" " + alphaCoach);

		
		// close the context 
		context.close();
	}
}
