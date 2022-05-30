package com.xworkz.runner;
//https://mkyong.com/spring/spring-collections-list-set-map-and-properties-example/
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bean.Loan;
import com.xworkz.bean.Salary;

public class BeanRunner {
	
	public static void main(String[] args) {
		
		
		
		
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext
				 ("com/xworkz/maven1jdbc/resource/BeanSpring.xml");
		
		System.out.println("Total Objects are managed"+applicationcontext.getBeanDefinitionCount());
		System.out.println(Arrays.toString(applicationcontext.getBeanDefinitionNames()));
		
		
		Loan loann=applicationcontext.getBean(Loan.class);
	
		boolean sanctioned=	loann.sanction();
		System.out.println("Loan santioned"+sanctioned);
		
		
		
	}

}
