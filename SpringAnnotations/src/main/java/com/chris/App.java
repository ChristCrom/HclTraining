package com.chris;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.chris.auto.Vehicle;
import com.chris.config.VehicleConfig;


public class App {

	public static void main(String[] args) {

   // Resource r = new ClassPathResource("spring.xml");
   // BeanFactory factory = new XmlBeanFactory(r);
    
    ApplicationContext factory = new AnnotationConfigApplicationContext(VehicleConfig.class);
    Vehicle v = (Vehicle)factory.getBean("maz");
    v.speed();
  

	}

}
