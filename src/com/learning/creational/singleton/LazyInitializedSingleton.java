package com.learning.creational.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton singletonInstance = null;
	
	private LazyInitializedSingleton(){
		
	}
	
	public static LazyInitializedSingleton getInstnace(){
		if(singletonInstance == null){
			singletonInstance = new LazyInitializedSingleton();
		}
		return singletonInstance;
	}
	
	public static void main(String[] args) {
		LazyInitializedSingleton s1 = LazyInitializedSingleton.getInstnace();
		LazyInitializedSingleton s2 = LazyInitializedSingleton.getInstnace();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}