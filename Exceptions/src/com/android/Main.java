package com.android;

import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		/*
		 * there are two broad types of exception
		 * Checked Exception- these are exceptions that HAVE TO BE put in a 
		 * try/catch block
		 * IOException 
		 * subclass of that is FileNotFoundException - example when you are connecting
		 * to a file in java, the connection HAS TO BE PUT in a try/catch block -
		 * your code will NOT COMPILE IF you don't
		 * RuntimeException - these exception do NOT HAVE TO BE put in a try catch
		 * block, these exceptions are  usually issues with the code you have written
		 * -arrayIndexOutOfBoundException, NullPointerException,classCastException,
		 * indexOutOfBoundException
		 */
		/*
		 * this generates a checked exception, so it has to be put in a 
		 * try/catch block, so if i do not put this in try/catch block your
		 * code will not compile
		 */
		try {
			/*
			 * if the file "myfile.txt" does not exist in its own directory
			 * , a checked exception is generated
			 */
			FileInputStream fis=new FileInputStream("myfile.txt");
		}
		catch(Exception e) {
			/*
			 * if the checked exception is generated, then this catch block
			 * will catch the exception, all it e, and deal with
			 */
			System.out.println("no file ");
			System.out.println("Exception "+e+" caught");
		}
		
		int[]numArray= {34,56,78};
		/*
		 * you don't HAVE TO put this in a try/catch block because this iw
		 * a RuntimeException, and RuntimeExceptions do not HAVE TO BE put in
		 * try/catch block. runtimeExceptions are usually a error in the logic
		 * of your code
		 */
		try {
			System.out.println("4 number is "+numArray[3]);
		}
		catch(Exception e) {
			System.out.println("the exception is "+e);
		}
		System.out.println("our program continues");
		/*
		 * the super class of all exceptions is a class called 
		 * Exception
		 * the super class of the Exception class is a class called
		 * Throwable
		 * the super class of Throwable is the object
		 * a sub class of exception is RuntimeException - which has as it's 
		 * subclasses all of the runTimeExceptions such as arrayIndexoutofBounds
		 * exeption, classcastException
		 * there is no sub class called "checkedExceptions", checked exceptions is
		 * only a term that means the piece of code HAS TO be put in try catch
		 * block (i.e anything to do with accessing files or databases)
		 */
		

	}

}
