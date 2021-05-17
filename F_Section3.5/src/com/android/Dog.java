package com.android;

public class Dog {
	/*
	 * this class has no user defined constructor so this
	 * uses the DEFAULT CONSTRUCTOR. the default constructor
	 * is a hidden no argument constructor
	 * in the case of the Dog class this hidden constructor
	 * looks like
	 * Dog()
	 * {
	 * 
	 * }
	 * that means we can go Dog spot=new Dog() and a dog will
	 * be created, as the command new Dog() calls the default
	 * constructor
	 */
}

class Zebra{
	int age;
	String name;
	/*
	 * this is the ONLY WAY to create zebra, as we have a user
	 * defined constructor in the class that takes an int, so
	 * the default no argument constructor is now no longer 
	 * available
	 */
	Zebra(int age){
		this.age=age;
	}
}
