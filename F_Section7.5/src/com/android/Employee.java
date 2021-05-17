package com.android;

public class Employee {
	String pps;
	{
		System.out.println("instance initialisers");
	}
	static String workPlace;
	static {
		System.out.println("statics created");
		workPlace="Galway";
	}
	
	
	Employee(String pps){
		this.pps=pps;
		System.out.println("Employee created");
	}

}
