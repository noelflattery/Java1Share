package com.android;

public class Animal {
	String type=this.getClass().getSimpleName();
	void identifyMe() {
		System.out.println("I am a "+this.getClass().getSimpleName());
	}
	
	

}

class Dog extends Animal{
	void bark() {
		System.out.println("I am a "+type+" barking");
	}
}

class Collie extends Dog{
	
}
