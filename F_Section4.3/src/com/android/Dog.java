package com.android;

public class Dog {
	
	static int counter=0;
	final int id;
	Dog(){
		counter++;
		id=counter;
	}
	@Override
	public String toString() {
		return "Dog id is " + id;
	}
	
	

}
