package com.learning.creational.abstractfactory;

public class PC implements IComputer {
	private String computerType;
	
	public PC(String computerType){
		this.computerType = computerType;
	}

	/**
	 * @return the computerType
	 */
	public String getComputerType() {
		return computerType;
	}
	
	
}
