package com.learning.creational.abstractfactory;

public class PCFactory implements IComputerFactory {

	@Override
	public IComputer createComputer() {
		return new PC("This is Personal Computer");
		
	}

}
