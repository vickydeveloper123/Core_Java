package com.xworkz.collections;

import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class WashingMachineRunner {

	public static void main(String[] args) {

		WashingMachineDTO washingMachine=new WashingMachineDTO( 101,"LG",10.0,Colour.BLUE,100,1.0);
		WashingMachineDTO washingMachine1=new WashingMachineDTO( 102,"LG1",12.0,Colour.DARK_GREEN,101,2.0);
		WashingMachineDTO washingMachine2=new WashingMachineDTO( 103,"SAMSUNG",14.0,Colour.ORANGE,102,31.0);
		WashingMachineDTO washingMachine3=new WashingMachineDTO( 104,"toyato",17.0,Colour.WHITE,105,32.0);
		WashingMachineDTO washingMachine4=new WashingMachineDTO( 105,"sunota",15.0,Colour.BLUE,104,15.0);
		WashingMachineDTO washingMachine5=new WashingMachineDTO( 106,"HERO",13.0,Colour.DARK_GREEN,1340,5.0);
		WashingMachineDTO washingMachine6=new WashingMachineDTO( 107,"hero",14.0,Colour.ORANGE,17780,46.0);
		WashingMachineDTO washingMachine7=new WashingMachineDTO( 108,"HERO HONDA",15.0,Colour.ORANGE,140,15.0);
		WashingMachineDTO washingMachine8=new WashingMachineDTO( 109,"pulsar",155.0,Colour.ORANGE,1400,15.0);
		WashingMachineDTO washingMachine9=new WashingMachineDTO( 110,"HONDA",140.0,Colour.BLUE,150,15.0);
		WashingMachineDTO washingMachine10=new WashingMachineDTO( 111,"HERO SPLENDER",15.0,Colour.WHITE,100,1.0);
		WashingMachineDTO washingMachine11=new WashingMachineDTO( 112,"PIEGION",14.0,Colour.ORANGE,1060,6.0);
		WashingMachineDTO washingMachine12=new WashingMachineDTO( 114,"LG_SPARKER",145.0,Colour.WHITE,10660,17.0);
		WashingMachineDTO washingMachine13=new WashingMachineDTO( 114,"NOKIA",1035.0,Colour.BLUE,19800,44.0);
		WashingMachineDTO washingMachine14=new WashingMachineDTO( 115,"FIREBRAND",145.0,Colour.WHITE,10340,34.0);
		WashingMachineDTO washingMachine15=new WashingMachineDTO( 116,"LITTLE WORK",1340.0,Colour.WHITE,10340,14.0);
		WashingMachineDTO washingMachine16=new WashingMachineDTO( 117,"LG SMART",1330.0,Colour.BLUE,1044,2.0);
		WashingMachineDTO washingMachine17=new WashingMachineDTO( 118,"LG GOOD",1340.0,Colour.WHITE,145,14.0);
		WashingMachineDTO washingMachine18=new WashingMachineDTO( 119,"SAMSUNG SMART",130.0,Colour.DARK_GREEN,1030,13.0);
		WashingMachineDTO washingMachine19=new WashingMachineDTO( 120,"HERO HONDA",130.0,Colour.WHITE,14500,6.0);

		Collection<WashingMachineDTO> washingMachineDTOS=new LinkedList<WashingMachineDTO>();
		
		washingMachineDTOS.add(washingMachine);
		washingMachineDTOS.add(washingMachine1);
		washingMachineDTOS.add(washingMachine2);
		washingMachineDTOS.add(washingMachine3);
		washingMachineDTOS.add(washingMachine4);
		washingMachineDTOS.add(washingMachine5);
		washingMachineDTOS.add(washingMachine5);
		washingMachineDTOS.add(washingMachine6);
		washingMachineDTOS.add(washingMachine7);
		washingMachineDTOS.add(washingMachine8);
		washingMachineDTOS.add(washingMachine9);
		washingMachineDTOS.add(washingMachine10);
		washingMachineDTOS.add(washingMachine11);
		washingMachineDTOS.add(washingMachine12);
		washingMachineDTOS.add(washingMachine13);
		washingMachineDTOS.add(washingMachine14);
		washingMachineDTOS.add(washingMachine15);
		washingMachineDTOS.add(washingMachine16);
		washingMachineDTOS.add(washingMachine17);
		washingMachineDTOS.add(washingMachine18);
		washingMachineDTOS.add(washingMachine19);
	
		System.out.println("Total washing machine lists washingMachineDTOS"+washingMachineDTOS.size());
		
		
		
		
		
		for(WashingMachineDTO n:washingMachineDTOS)
		{
			System.out.println(n);
			
		}
		
		for(WashingMachineDTO n:washingMachineDTOS)

		{
			if(n.getPrice()>5000)
			{
				System.out.println("Price="+n);
			}
			else
				
			{
				System.out.println("Price availability is not there");
			}
		}
		
		for(WashingMachineDTO n:washingMachineDTOS)

		{
			if(n.getPrice()<5000)
			{
				System.out.println("Price ="+n);
			}
			else
			{
				System.out.println("Price"+n);
			}
		}
		
		for(WashingMachineDTO n:washingMachineDTOS)

		{
			if(n.getCapacity()>5)
			{
				System.out.println("Capacity range ="+n);
			}
			else
			{
				System.out.println("capacity not available"+n);
			}
		}
		
		
		for(WashingMachineDTO n:washingMachineDTOS)

		{
			if(n.getCapacity()>5 && n.getCapacity()<5000)
			{
				System.out.println("capacity availability for the product"+n);
			}
			else
			{
				
				System.out.println("Capacity not available for the range");
			}
		}
		
		for(WashingMachineDTO n:washingMachineDTOS)

		{
			if(n.getCapacity()>15)
			{
				System.out.println("capacity availabile for the product"+n);
			}
			else
			{
				System.out.println("Capacity not available for the product");
			}
		}
		
		
		System.out.println(" elements less than 5  after removing @"+washingMachineDTOS.size());
		
		
	   Iterator<WashingMachineDTO> iterater=washingMachineDTOS.iterator();
		
		while(iterater.hasNext())
		{
			System.out.println("Inside iterater washing machine dto iterater");
			WashingMachineDTO machineElements=iterater.next();
			System.out.println(machineElements);
			
			double n=iterater.next().getCapacity();
			if(n<5)
			{
				iterater.remove();
				System.out.println(n);
			}
			else
			{
				System.out.println(n);
				
			}
			
						
		}
		
		
		for(WashingMachineDTO n:washingMachineDTOS)
		{
			if(n.getBrand().length()>=10)
			{
				System.out.println("Branded wasing machine items greate than 10"+n);
			}
			else
				System.out.println("Branded items not founded");
		}
		
		
		for(WashingMachineDTO n:washingMachineDTOS)
		{
		      System.out.println(n.getBrand().toUpperCase());
			
		}
		
		for(WashingMachineDTO n:washingMachineDTOS)
		{
			String ss=n.getBrand();
			for(int i=0;i<ss.length();i++)
			{
				if(('f'==ss.charAt(i)) || 'F'==ss.charAt(i))
				{
					System.out.println(n.getBrand());
					
				}
			}
			
		}
		
		
		
		
		
		
	}

}

