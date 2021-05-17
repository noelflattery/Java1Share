package com.android;

public class Building {
	int age=23;
	String address="Dublin";
	
	void calcCosts() {
		System.out.println("Building CalcCosts");
	}
}

class House extends Building{
	int age=100;
	String address="Galway";
	@Override
	void calcCosts() {
		System.out.println("House CalcCosts");
	}
}
