package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.xworkz.maven1jdbc.containers;

public class ContainerRunner {

		   public static void main(String[] args) {
		      ApplicationContext context = new FileSystemXmlApplicationContext
		         ("com/xworkz/maven1jdbc/resource/containerSpring.xml");
		      
		      containers obj = (containers) context.getBean("HelloWorld");
		      obj.getMessage();
		   }
		}


