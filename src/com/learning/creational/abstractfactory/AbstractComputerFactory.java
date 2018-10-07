package com.learning.creational.abstractfactory;

public class AbstractComputerFactory {
	public static IComputer getComputer(IComputerFactory computerFactory) {
		return computerFactory.createComputer();
	}
}