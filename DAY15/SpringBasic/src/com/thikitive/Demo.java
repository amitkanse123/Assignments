package com.thikitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("demo.xml");
	
	Employee e=context.getBean(Employee.class);
	e.hello();
	System.out.println(e);
}
}
