package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(sum(i) + " , ");
		}

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session 
		Session session = factory.getCurrentSession();
		
		try {
			// use the session object to save java object .
			// create a student object 
			// start a transaction 
			// save the student object
			// commit transaction 
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			factory.close();
		}
	}
	
	public static int sum(int n) {
		int a = 0,b =1,c=0;
		if(n == 0)
			return a;
		else if(n == 1)
			return b;
		for (int i = 2; i <= n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}
}
