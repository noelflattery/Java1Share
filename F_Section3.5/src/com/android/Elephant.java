package com.android;

public class Elephant {
	int age;
	String name;
	double weight;
	/*
	 * you can apply access modifers to a constructor
	 * private, public, protected, default (which has no
	 * keyword)
	 */
	//this constructor has default level access
/*	Elephant(){
		
	}*/
	/*
	 * if all of your constructors are private, you CANNOT
	 * create an elephant by normal methods
	 * however you can create a elephant if there is a static method
	 * in this class that creates an elephant
	 */
	private Elephant() {
		
	}
	
	private Elephant(int age,String name,double weight) {
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	
	static Elephant makeElephant() {
		return new Elephant();
	}
	

}
