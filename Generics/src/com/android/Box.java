package com.android;

public class Box<T> {
//become Integer t
	T myVar;
	
	
	
	void printMe() {
		System.out.println("calling toString");
		System.out.println(myVar);
	}
}
