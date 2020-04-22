package com.jayant.demoMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle car = (Vehicle)context.getBean("bike");
//    	car.drive();
    	
    	// object of car
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    	
    	// to get obj of tire
//    	Tire t = (Tire) context.getBean("Tire");
//    	System.out.println(t);
    }
}
