package com.learning.creational.abstractfactory;

public class Laptop implements IComputer {
	private String computerType;
	
	public Laptop(String computerType){
		this.computerType = computerType;
	}

	/**
	 * @return the computerType
	 */
	public String getComputerType() {
		return computerType;
	}
	
	
}
