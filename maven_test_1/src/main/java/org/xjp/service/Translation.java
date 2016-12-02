package org.xjp.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Translation {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 MassService ms = (MassService) context.getBean("massService",MassService.class);
		 ms.serviceA();
		 ms.serviceB();
		 ms.doService();
	}
}
