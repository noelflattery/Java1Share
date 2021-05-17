package com.android;

public class Vehicle {
	int age=100;
	void move() {
		System.out.println("Vehicle moving");
	}

}
class Car extends Vehicle{
	int mpg;
	void move() {
		System.out.println("car moving by driving");
	}
	void drive() {
		System.out.println("car driving");
	}
}
class Boat extends Vehicle{
	int propellerAmt;
	/*
	 * overriding the move() method of the Vehicle class
	 */
	void move() {
		System.out.println("A boat moving");
	}
	void floating() {
		System.out.println("boat floating");
	}
	
}
class Bike extends Vehicle{
	boolean type;
	int age=12;//shadowed
	//overriding the move() method of the vehicle class
	void move() {
		System.out.println("I move by cycling");
	}
	void cycle() {
		System.out.println("cycle me");
	}
}
