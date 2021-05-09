package com.learning.creational.factory;

public class CarFactoryMain {
// plain Factory Main Method	
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		ICar sedanCar = carFactory.getCar("Sedan");
		sedanCar.modelName();

	}

}
