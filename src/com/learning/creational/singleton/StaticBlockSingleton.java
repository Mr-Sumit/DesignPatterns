package com.learning.creational.singleton;

public class StaticBlockSingleton {
	private static  StaticBlockSingleton singletonInstance;
	
	private StaticBlockSingleton(){}
	
	static{
		try{
			singletonInstance = new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating Singleton Instance");
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return singletonInstance;
	}
	
	public static void main(String[] args) {
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		

	}

}
