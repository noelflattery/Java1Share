package com.android;
/*
 * all methods in an interface are public
 */
public interface Behaviour {
	//no body, means abstract method
	void sad();
	/*
	 * sad() and happy() are both public, abstract methods
	 */
	public abstract void happy();
	/*
	 * you have to provide implementation {curly brackets} with the keyword
	 * default
	 */
	default void mad() {
		System.out.println("I am mad");
	}

}
