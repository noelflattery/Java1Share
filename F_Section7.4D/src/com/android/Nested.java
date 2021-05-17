package com.android;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Nested {
	
	static void nested1() {
		FileInputStream throwMe;
		try {
			throwMe=new FileInputStream("myFile.txt");
		}
		catch(Exception e) {
		/*
		 * we are catching the checked exception and calling it e, we are then rethrowing
		 * it in a inner/nested try catch, which catches and prints it out	
		 */
			try {
				throw e;
			}
			catch(Exception ie) {
				System.out.println("exception caught in inner block is "+ie);
			}
			
		}
	}
	
	static void nested2() {
		
		FileInputStream throwMe;
		try {
			throwMe=new FileInputStream("myFile.txt");
		}
		catch(RuntimeException e) {
			try {
				throw e;
			}
			catch(Exception ie) {
				System.out.println("Exception in first inner block caught "+ie);
			}
		}
		catch(Exception e) {
			try {
				throw e;
			}
			catch(Exception ie) {
				System.out.println("exception in second inner block caught "+ie);
			}
		}
		
	}

}
