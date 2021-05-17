package com.android;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Rethrow {
	
	static void rethrow1()throws Exception {
		FileInputStream throwMe;
		FileOutputStream throwMe2;
		try {
			throwMe=new FileInputStream("myFile.txt");
		}
		catch(Exception e) {
			System.out.println("exception in rethrow1 is "+e);
			/*
			 * here we decide to rethrow the exception generated in the try block and
			 * caught by this block
			 */
			throw e;
		}
		System.out.println("method continues on");
	}
	
	static void rethrow2() {
		int[]myArray= {23,45,78};
		try {
			/*
			 * this will generate arrayIndexOutOfBoundsException
			 */
			System.out.println(myArray[5]);
		}
		/*
		 * this will catch the exception as the above is a RuntimeException
		 */
		catch(RuntimeException r) {
			//rethrowning the Exception r
			throw r;
		}	
	}
	/*
	 * a finally block, like any other block, can throw a new exception that has to dealt
	 * with, so you would have to put the call of this method in a try/catch block
	 */
	static void rethrow3()throws Exception {
		try {
			throw new Exception();		
		}
		catch(Exception e) {
			System.out.println("Exceptin in rethrow3 is "+e);
		}
		finally {
			throw new IOException();
		}
	}
	

}
