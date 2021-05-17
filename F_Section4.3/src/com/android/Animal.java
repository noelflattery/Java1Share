package com.android;



public abstract class Animal {
	int age=23;
	

	void eat() {
		System.out.println("Animal eating");
	}
	
	abstract void drink();
	
	void sleep() {
		System.out.println("Animal Sleeping");
	}
}
/*
 * when a concrete class extends an abstract it HAS
 * to implement all abstract methods it inherits
 */
class Monkey extends Animal{
	int iq=98;
	//this is the overriden drink method from the Animal class
	void drink() {
		System.out.println("monkey drinking");
	}
	/*
	 * the monkey class has it's own method climb(), which is
	 * only available to the monkey class
	 */
	void climb() {
		System.out.println("Monkey climbing");
	}
}

class Hippo extends Animal{

	double swimSpeed=12;
//	@Override
	void drink() {
		System.out.println("hippo drink");
		
	}
	
	void sleep() {
		System.out.println("hippo sleeping");
	}
	void swim() {
		System.out.println("hippo swimming");
	}	
}

class Bird extends Animal{

	@Override
	void drink() {
		System.out.println("bird Drinking");
		
	}
	
	void fly() {
		System.out.println("bird flying");
	}
	
}