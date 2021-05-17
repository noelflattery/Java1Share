package com.animal.mammal;

public interface Behaviour {
	/*
	 * these methods are by default abstract and public
	 */
	public abstract void happy();
	void sad();
	/**
	 * javaDoc comments
	 */
	
	/*
	 * default implementation
	 * you can set the default implementation for a method in
	 * java 8 in an interface. This means that a class implmenting
	 * this inteface does not have to override the angry() method
	 * see Monkey
	 */
	default void angry() {
		System.out.println("I am angry");
	}
	/*
	 * static method in an interface has to have a body
	 */
	public static void statMethod() {
		System.out.println("statmethod called");
	}
	
	

}
