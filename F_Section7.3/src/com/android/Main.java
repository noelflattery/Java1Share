package com.android;

public class Main {

	public static void main(String[] args) {
		Throws throwMe=new Throws();
		try {
			throwMe.readFile("myFile.txt");
		}
		catch(Exception e) {
			System.out.println("Exception for readFile in main is "+e);
		}
		/*
		 * this will compile, but will crash your program as this method 
		 * generates a NullPointerException
		 */
		//throwMe.throwRuntime();
		
		try {
			throwMe.throwRuntime();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			/*
			 * all of these are checked, so they have to be in a try catch block
			 * or the main method could have a "throws Throwable"
			 */
			throwMe.method2();//has an throws Exception in method
			throwMe.method3();//has a throws Throwable in method
			throwMe.method5();//has a throws IOException in method
			throwMe.method6();//has a throws FileNotFoundException in method
		}
		/*
		 * this catch block can deal with all throwables and all the sub classes
		 * of throwable
		 * this catch block will not execute in this circumstance as none of
		 * the methods in the Try block actualy produce a exeption
		 */
		catch(Throwable t) {
			System.out.println("this does not run");
		}
		
		/*
		 * method7 does generate an exception, so the catch block will execute
		 */
		try {
			throwMe.method7();
		}
		catch(Exception e) {
		//	System.out.println(e);
			System.out.println(e.getMessage());
		
		}
		

	}

}
