package com.android;

public class Dog {
	
	static{
		System.out.println("static initialiser called");
		statDog=new Dog();
	}
	
	static Dog statDog;

	private Dog() {
		
	}
	
	
	
	
	void eat() {
		System.out.println("A dog eating");
	}
	
	
	/*
	 * can use a static method to create a dog even if we don't have
	 * access to any constructor as the constructor in this class is
	 * private, but the static method can access this constructor and 
	 * return a dog and assign it to our spot variable back in main
	 */
	static Dog getDog() {
		Dog spot=new Dog();
		return spot;
	}
	
	static void printMe() {
		System.out.println("print me");
	}

}
