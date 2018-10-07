package com.learning.structural.adaptor;

public class SocketClassAdaptorImpl extends Socket implements ISocketAdaptor{

	@Override
	public Volt get3Volts() {
		Volt v = getVolt();
		return convertVolt(v, 40);
	}

	@Override
	public Volt get10Volts() {
		Volt v = getVolt();
		return convertVolt(v, 12);
	}

	@Override
	public Volt get120Volts() {
		return getVolt();
	}
	
	private Volt convertVolt(Volt v, int i){
		return new Volt(v.getVolts()/i);
	}

}