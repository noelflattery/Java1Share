
package com.android;

public class Main {

	public static void main(String[] args) {
		//Examples.ex1();
		//Examples.ex2();
		//Examples.ex3();
		//Examples.ex4();
	//	Examples.ex5();
	//	Examples.ex6();
		try {
			Examples.ex7();
		}
		/*
		 * no exception was geneated, so the catch block is skipped
		 */
		catch(Exception e) {
			System.out.println("exception caught in main");
			System.out.println("exception is "+e);
		}
		System.out.println("some text in main");
		try {
			Examples.ex8();
		}
		catch(Exception e) {
			System.out.println("Exception for ex8 caught");
			System.out.println("exception is "+e);
		}
		
		Examples.ex9();
		/*
		 * this will compile but crash our program as ex10 produces arrayIndexOutofBoundsException
		 * 
		 */
		Examples.ex10();
		
		
		
		

	}

}
