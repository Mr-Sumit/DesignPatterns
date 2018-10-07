package com.learning.creational.singleton;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton singleInstance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){}
	
	public static EagerInitializedSingleton getInstance(){
			return singleInstance;
	}
	
	public static void main(String[] args) {
		EagerInitializedSingleton s1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton s2 = EagerInitializedSingleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
}