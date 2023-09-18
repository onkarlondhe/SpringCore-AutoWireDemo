package com.mzos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentExecuter {

	public static void main(String[] args) {
 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student1 = (Student) context.getBean("stud1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("stud2");
		System.out.println(student2);
	}

}
