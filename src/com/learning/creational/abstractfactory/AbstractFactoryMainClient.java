package com.learning.creational.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryMainClient {
	
	public static void main(String[] args){
		IComputerFactory computerFactory = null;
		AbstractComputerFactory abstractComputerFactory = new AbstractComputerFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your computer Type");
		String type = sc.next();
		
		if("PC".equals(type)){
			computerFactory = new PCFactory();
		}else if("Laptop".equals(type)){
			computerFactory = new LaptopFactory();
		}
		
		System.out.println(abstractComputerFactory.getComputer(computerFactory).getComputerType());
		
	}

}
