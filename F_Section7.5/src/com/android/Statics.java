package com.android;

public class Statics {
	/*
	 * ExceptionInitializerError can only be caused by a runtimeException
	 */
	/*
	 * String is an object, an object that is an atribute of a class
	 *  that is not given an explicit value has a default value of null
	 */
	static String name;
	//static int num=name.length();
	int num2=45;
	/*
	 * if an exception is generated when initialising a static variable or if an exception
	 * is generated in a static initilisers, a ExceptionInitializerError is produced
	 * regardless of the type of exception that is produced
	 */
	static {
		/*
		 * this produces a ArrayIndexOutOfBoundsException, but it is in a static 
		 * initialiser so it will produce a ExceptionInitializerError
		 */
		int[]myArray= {12,34,56};
		System.out.println(myArray[4]);
		
		/*
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception in static is "+e);
		}
		*/
		
	}
	
/*	static {
		try{
			int[]myArray2= {12,34,56};
		System.out.println(myArray2[4]);
		}
		catch(Throwable t) {
			System.out.println(t);
		}
		
	}*/

}
