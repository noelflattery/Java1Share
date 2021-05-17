package com.android;



public class House {
	double width;
	double height;
	int number;
	String address;
	static int counter=0;
	public House(double width, double height, String address) {
		super();
		counter++;
		this.width = width;
		this.height = height;
		this.number = counter;
		this.address = address;
	}
	@Override
	public String toString() {
		return "House [width=" + width + ", height=" + height + ", number=" + number + ", address=" + address + "]";
	}
	
	
}
