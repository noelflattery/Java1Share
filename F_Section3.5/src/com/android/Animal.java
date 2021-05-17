package com.android;

public class Animal {
	Animal(){
		/*
		 * calls Object class constructor that takes no
		 * arguments, then prints out "Animal Constructor
		 * called" and then goes to the cow constructor and
		 * implements the rest of the code in that constructor
		 * and then goes to Angus constructor that implements
		 * the rest of the code in that constructor
		 */
		super();
		System.out.println("Animal constructor called");
	}

}

class Cow extends Animal{
	Cow(){
		/*
		 * calls Animal class constructor that takes no 
		 * arguments
		 */
		super();
		System.out.println("Cow constructor called");
	}
}

class Angus extends Cow{
	Angus(){
		/*
		 * calls cow class constructor that takes no
		 * arguments
		 */
		super();
		System.out.println("Angus constructor called");
	}
}
