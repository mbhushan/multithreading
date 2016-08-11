package com.manib.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext appcontext = new FileSystemXmlApplicationContext("src/main/java/com/manib/spring/beans/bean.xml");
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("com/manib/spring/beans/bean.xml");
		Person person = (Person)appcontext.getBean("person");
		person.speak();
		System.out.println(person);
		
		Address address = (Address)appcontext.getBean("address");
		System.out.println(address);
		//((FileSystemXmlApplicationContext)appcontext).close();
		((ClassPathXmlApplicationContext)appcontext).close();
	}
}
