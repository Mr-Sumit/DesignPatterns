package com.learning.creational.abstractfactory;

public class LaptopFactory implements IComputerFactory {

	@Override
	public IComputer createComputer() {
		return new Laptop("This is Laptop");
	}

}
