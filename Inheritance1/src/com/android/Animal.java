package com.android;

public class Animal {
	int age=10;
	String name="kevin";
	double weight=15.5;
	
	void eat() {
		System.out.println("animal eating");
	}
	void drink() {
		System.out.println("animal drinking");
	}
	void run() {
		System.out.println("animal running");
	}
	void sleep() {
		System.out.println("animal sleeping");
	}
}

class Dog extends Animal{
	String owner="donald";
	String colour="orange";
	boolean sex=false;
	//own method
	void breed() {
		System.out.println("Dog breeding");
	}
	//own method 
	void pants() {
		System.out.println("Dog panting");
	}
	/*
	 * override the eat method from the Animal class
	 * this has the same method signature as the eat() method in the Animal
	 * class, so is overriden
	 */
	@Override
	void eat() {
		System.out.println("dog eating");
	}
	/*
	 * this is overloaded as it has a different list of variables, it takes
	 * a int instead of nothing. It is important to note that java treats this
	 * method as a totally different method, with no relationship, to the other
	 * eat methods of the class. overloading the eat() method in the Dog class
	 */
	void eat(int num) {
		System.out.println("overloaded eat method");
	}
	
}

class Setter extends Dog{
	String prize="cruffs";
//	int age=4;
	//own method
	void prance() {
		System.out.println("setter prancing");
	}
	/*
	 * This is overriding the drink method from the Animal class
	 */
	@Override
	void drink() {
		System.out.println("setter drinking");
	}
	//overriding the toString method from the object class
	@Override
	public String toString() {
		return "hello";
	}
}
