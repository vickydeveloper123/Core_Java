package com.xworkz.runner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.maven1jdbc.RequiredType;

public class SpringRunner {
	
	
		public static void main(String[] args) {

			ApplicationContext ap = new ClassPathXmlApplicationContext("com/xworkz/maven1jdbc/resource/Springs.xml");

			RequiredType adv = (RequiredType) ap.getBean("requiredType");
			adv.display();
		}
	}


