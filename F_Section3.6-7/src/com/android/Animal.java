package com.android;

public class Animal {
	int age;
	String name;
	
	void eat() {
		System.out.println("animal eating");
	}
	void drink() {
		System.out.println("animal drinking");
	}
}//end of Animal class
/*
 * this is an example of a tightly coupled class
 */
class Cow extends Animal{
	//eat() overrides the eat method in the Animal class
	void eat() {
		System.out.println("cow eating");
	}
}
