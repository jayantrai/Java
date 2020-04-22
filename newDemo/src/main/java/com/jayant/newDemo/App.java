package com.jayant.newDemo;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("maven.xml");
        Vehicle car = (Vehicle)context.getBean("vehicle");
        car.drive();
    }
}
