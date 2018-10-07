package com.learning.creational.singleton;

public class DoubleCheckingThreadSafeSingleton {

	private static DoubleCheckingThreadSafeSingleton singletonInstance = null;
	
	private DoubleCheckingThreadSafeSingleton(){}
	
	public static DoubleCheckingThreadSafeSingleton getInstance(){
		
		if(singletonInstance == null){
			synchronized(DoubleCheckingThreadSafeSingleton.class){
				if(singletonInstance == null){
					System.out.println("Inside GetInstance Method " + Thread.currentThread().getName());
					singletonInstance = new DoubleCheckingThreadSafeSingleton();
				}
			}
		}
		return singletonInstance;
	}
}

class DoubleCheckingThreadSafeSingletonTester implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " "+ DoubleCheckingThreadSafeSingleton.getInstance().hashCode());
	}
	
	public static void main(String[] args) {
		DoubleCheckingThreadSafeSingletonTester thread1 = new DoubleCheckingThreadSafeSingletonTester();
		DoubleCheckingThreadSafeSingletonTester thread2 = new DoubleCheckingThreadSafeSingletonTester();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		t1.start();
		t2.start();
	}
}