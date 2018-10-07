package com.learning.creational.factory;

public class CarFactory {
	public static ICar getCar(String modelName){
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

class TestCarFactory{
	public static void main(String[] args){
		CarFactory.getCar("Sedan").modelName();
	}
}
