package com.android;

public class Vehicle {

	static int count=0;
	
	Vehicle(){
		System.out.println("vehicle constructor called");
		count++;
		System.out.println("amount vehicles created so far is ");
		System.out.println(count);
	}
}

class Boat extends Vehicle{
	static int boatCount=0;
	Boat(){
		System.out.println("Boat constructor called");
	//	boatCount++;
	}
}

class Car extends Vehicle{
/*
 * i do not have to put in constructor in ANY OF the subclasses
 * for this to work	
 */
	static int carCount=0;
	Car(){
		System.out.println("Car constructor called");
//		carCount++;
	}
	
}

class Ferrarri extends Car{
	static int ferCount=0;
	Ferrarri(){
		System.out.println("ferrarri constructor called");
//		ferCount++;
	}
	
	
}