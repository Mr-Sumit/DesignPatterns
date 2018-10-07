package com.learning.creational.builder;

public class Computer {
	private String HDD;
	private String RAM;
	
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	/**
	 * @return the hDD
	 */
	public String getHDD() {
		return HDD;
	}
	
	/**
	 * @return the rAM
	 */
	public String getRAM() {
		return RAM;
	}
	
	/**
	 * @return the isGraphicsCardEnabled
	 */
	public boolean getIsGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	/**
	 * @return the isBluetoothEnabled
	 */
	public boolean getIsBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}



	static class ComputerBuilder{
		private String HDD;
		private String RAM;
		
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String HDD, String RAM){
			this.HDD = HDD;
			this.RAM = RAM;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
	}
	
}
