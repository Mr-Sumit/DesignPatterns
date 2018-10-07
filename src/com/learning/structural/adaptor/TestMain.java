package com.learning.structural.adaptor;

public class TestMain {

	public static void main(String[] args) {
		SocketClassAdaptorImpl sai = new SocketClassAdaptorImpl();

		Volt v = sai.get120Volts();
		System.out.println(v.getVolts());
	}
}