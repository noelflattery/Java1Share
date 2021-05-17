package com.android;

public class Deer implements Run{
/*
 * landBased is an abstract method in the Move interface, Move is the
 * super class of the Run interface
 */
	@Override
	public void landBased() {
		System.out.println("deer landbased");
		
	}
/*
 * runSpeed is an abstract method in the Run interface, Run extends the 
 * Move interface
 */
	@Override
	public void runSpeed() {
		System.out.println("deer run");
		/*
		 * when a class implements an interface we can access the variables
		 * of an interface by just typing up the variable name. we 
		 * dont' have to go name of interface followed by name of variable
		 * Move.finalInt
		 */
		System.out.println(finalInt);
		
	}

}
