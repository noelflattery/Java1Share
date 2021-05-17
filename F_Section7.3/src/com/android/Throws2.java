package com.android;

import java.io.FileInputStream;
import java.io.IOException;

public class Throws2 {
	
	static void manyTrys() {
		
		try {
			System.out.println("try catch no error");
		}
		catch(Error e) {
			
		}
		
		try {}
		catch(Exception e) {
			
		}
		try {}
		catch(NullPointerException n) {}
		
		try {}
		catch(RuntimeException r) {
			
		}
		try {}
		catch(Throwable t) {
			
		}
		/*
		 * a try block can define a catch block for unchecked exceptions that 
		 * are not thrown by the try block. it CAN'T DO THIS FOR CHECKED EXCEPTIONS
		 * OTHER THAN EXCEPTION AND THROWABLE
		 * if you have a particular checked exception in the catch block, you 
		 * HAVE TO generate a checked exception in the try block
		 */
		try {
			System.out.println("no exception thrown");
			/*
			 * FileNotFoundException which is sub class of IOException
			 */
			FileInputStream fis=new FileInputStream("myFile.txt");
		//	throw new Exception();
		}
		/*
		 * this can only catch IOExceptions or subclasses of this exception. hence
		 * why throw new Exception will not work, as Exception is a superclass
		 * of IOException
		 */
		catch(IOException i) {
			System.out.println(i);
		}
	}

}
