package com.android;

public interface Behaviour {
	int finalInt=34;
	
	default void happy() {
		System.out.println("I am happy");
	}
	void sad();
	void angry();
	
	static void statMethod() {
		System.out.println("statMethod called");
	}
	/*
	 * can use the keyword "this" in an interface, but you
	 * can ONLY use it inside a default method
	 */
	default void callThis() {
		System.out.println(this.finalInt);
		System.out.println(finalInt);
		//can call other default methods
		this.happy();
		//can call other abstract methods
		this.sad();
		angry();
		//can call the object itself
		System.out.println(this);
		//can also call static methods
		statMethod();
		//can't use the "this" keyword with statics anywhere
	//	this.statMethod();
		
	}

}
