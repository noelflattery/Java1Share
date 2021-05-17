package com.android;

public class Animal {
	int age=23;
	String name="andy";
	
	Animal(){
		System.out.println("Blank Animal Constructor called");
	}
	
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog extends Animal{
	int age=99;
	String name="spot";
	
	Dog(){
		super();//accessing the super Animal blank constructor
		System.out.println("accessing blank Dog constructor");
	}
	void eat() {
		System.out.println("Dog eating");
	}
	
	void accessSuper() {
		System.out.println("age of dog is "+age);
		System.out.println("age of dog with this "+this.age);
		//this will access the age in the super Animal class
		System.out.println("access age of Animal "+super.age);
		eat();//access eat method in Dog class
		super.eat();//access eat method in Animal class	
	}
}

class Terrier extends Dog{
	int age=5000;
	String name="terry";
	
	void accessSuper() {
		System.out.println("age in Terrier is "+age);
		System.out.println("age in dog class "+super.age);
	//super.super.age;
		Animal andy=new Animal();
		System.out.println("age in Animal class "+andy.age);
	}
}