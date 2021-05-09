package com.learning.creational.factory;

public class CarFactory {
	
	public ICar getCar(String modelName){
		ICar car = null;
		switch (modelName){
		case "Sedan": 
			car = new SedanCar();
			break;
		case "Luxury":
			car = new LuxuryCar();
			break;
		}
		return car;
	}
}

