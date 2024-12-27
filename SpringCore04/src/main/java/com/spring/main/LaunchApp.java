package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Department;
import com.spring.beans.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee emp = container.getBean(Employee.class);
		System.out.println(emp);
		
		Department d = container.getBean(Department.class);
		System.out.println(d);
	}
}