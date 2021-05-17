package com.android;
/*
 * this class now inherits from the exception class, which  means that this class
 * is a CHECKED exception. if you create an object of this class you are creating
 * a checked exception
 */
public class FallInRiverException extends Exception{
	/*
	 * new FallInRiverException() will produce this message
	 */
	public FallInRiverException() {
		System.out.println("get out of the water you fool");
	}

}

class DropOarException extends Exception{
	/*
	 * new DropOarException() will produce this message
	 */
	public DropOarException() {
		System.out.println("pick up your oar");
	}
}
