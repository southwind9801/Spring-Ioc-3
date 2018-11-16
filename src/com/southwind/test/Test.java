package com.southwind.test;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.southwind.entity.Car;
import com.southwind.entity.Person;


public class Test {
	public static void main(String[] args) throws SQLException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		Car car = (Car) applicationContext.getBean("car1");
//		System.out.println(car);
		
//		Car car2 = (Car) applicationContext.getBean("car2");
//		System.out.println(car2);
		
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}
