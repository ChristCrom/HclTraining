package com.chris;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.chris.utility.UtilityClass;

public class App {

	public static void main(String[] args) {

   // Resource r = new ClassPathResource("spring.xml");
   // BeanFactory factory = new XmlBeanFactory(r);
    
    ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    UtilityClass u1 = (UtilityClass)factory.getBean("uti");
    u1.output();
  

	}

}
