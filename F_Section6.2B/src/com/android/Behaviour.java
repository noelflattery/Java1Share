package com.android;
/*
 * if a class implments both the Behavoiur interface and the the
 * sub class interface Behaviour2. In both interfaces we have a
 * default method called agressive. the class implementing both 
 * interfaces will take the agressive() method from the sub class
 * interface behaviour2, which will print out
 * "agresisve in behaviour2 interface"
 */
public interface Behaviour {
	
	void joy();
	
	default void agressive() {
		System.out.println("I am agressive");
	}
	
}

interface Behaviour2 extends Behaviour{
	
	void scared();
	default void agressive() {
		System.out.println("agresisve in behaviour2 interface");
	}
}
