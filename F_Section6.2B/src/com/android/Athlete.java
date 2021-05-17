package com.android;

public class Athlete implements Jumpable,Moveable{
	
	void getValues() {
		System.out.println("max in jumpable is "+max);
		/*
		 * there is a min in both Jumpable and Moveable, so it
		 * does not know which one to call
		 */
		//System.out.println("min is "+min);
		/*
		 * so we have to tell the compile we want the min variable
		 * from the Jumpable interface
		 * or the min variable from the Moveable interface
		 */
		System.out.println("jumpable min is "+Jumpable.min);
		System.out.println("Moveable min is "+Moveable.min);
	}

}
