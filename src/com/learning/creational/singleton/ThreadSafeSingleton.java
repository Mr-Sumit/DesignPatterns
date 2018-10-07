package com.learning.creational.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton singletonInstance = null;
	
	private ThreadSafeSingleton(){}
	
	public static synchronized ThreadSafeSingleton getInstance(){
		System.out.println("Inside GetInstance Method " + Thread.currentThread().getName());
		if(singletonInstance == null){
			singletonInstance = new ThreadSafeSingleton();
		}
		return singletonInstance;
	}
}

class ThreadSafeSingletonTester implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " "+ ThreadSafeSingleton.getInstance().hashCode());
	}
	
	public static void main(String[] args) {
		ThreadSafeSingletonTester thread1 = new ThreadSafeSingletonTester();
		ThreadSafeSingletonTester thread2 = new ThreadSafeSingletonTester();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		t1.start();
		t2.start();
	}
}