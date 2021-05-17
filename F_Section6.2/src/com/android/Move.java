package com.android;

public interface Move {
	void landBased();

}
/*
 * an interface does NOT IMPLEMENT an interface, an interface EXTENDS an
 * interface.
 * Run inherits from the Move interface, so that means that any class that
 * implments the Run interface, also has to implement all the abstract
 * methods in the Move Interface
 */
interface Run extends Move{
	/*
	 * all variables in an interface are public, static and final by 
	 * default
	 */
	public static final int finalNum=12456;
	int finalInt=67;//this is also public static and final
	
	void runSpeed();
	//this static method IS PUBLIC, as all methods in an interface are public
	static void race() {	
		System.out.println("we are in a race");
	}
}
