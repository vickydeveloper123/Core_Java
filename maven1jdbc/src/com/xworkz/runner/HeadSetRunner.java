package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.maven1jdbc.HeadSet;

public class HeadSetRunner {
	
	public static void main(String[] args) {

		String xmlfile="spring.xml";
		
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext(xmlfile);
		
		HeadSet headset=applicationContext.getBean("Oppo",HeadSet.class);
		
		System.out.println(headset.getBrand());
		
		
	
		
		
		
}
	
}

