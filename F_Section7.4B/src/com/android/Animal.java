package com.android;

import java.io.FileInputStream;

public class Animal {
	
	void returns() {
		try {
			System.out.println("inside try block");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception in returns is "+e);
			/*
			 * the return statement exits the methods
			 */
			return;
			/*
			 * anything after this return statement is unreachable code 
			 * and will not compile
			 */
			//System.out.println("unreachable code");
		}
		/*
		 * a finally block is always called, regardless if it is after a return
		 * statement
		 */
		finally {
			System.out.println("finally block called");
		}
		/*
		 * anything outside of the finally block will not compile
		 */
	//	System.out.println("hello there");
	}
	
	int returnInt() {
		/*
		 * if an exception is generated this method will retun the int value 10
		 * if no exception is generated this method will return the int value 20
		 */
		try {
			int[]numList= {45,78,990};
			System.out.println(numList[5]);
		}
		/*
		 * if an exception is generated the value returned will be 10 and the 
		 * method will exit at this point
		 */
		catch(Exception e) {
			return 10;
		}
		/*
		 * if not exception is generated then the catch block will not run and
		 * the value returned will be 20 and the method will exit here
		 */
		return 20;
	}
	
	int returnReal(){
		try {
			System.out.println("inside returnFinally");
		//	int[]numList= {45,78,990};
		//	System.out.println(numList[5]);
		//	FileInputStream fis = new FileInputStream("myText.txt");
			/*
			 * this will definately produce a exception, no ambiguity, so the
			 * code after the catch block, will NEVER RUN, so is unreachable code,
			 * so will not compile
			 */
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
			return 10;
		}
		//this is unreachable code
		//return 20;
	}
	
	int returnFinally(){
		try {
			System.out.println("inside returnFinally");
			FileInputStream fis = new FileInputStream("myText.txt");
		}
		catch(Exception e) {
			System.out.println("exception in catch block is caught");
			return 10;
		}
		finally {
			int num=100;
			/*
			 * finally always runs, regardless of whether an exception is generated
			 * or not. so this method ALWAYS returns 100
			 */
			System.out.println("finally always runs");
			return 100;
			/*
			 * anything after the return in the finally block is unreachable code
			 */
			//System.out.println("unreachable code");
		}
		//System.out.println("unreachable code");
		
	}
	
	int returnFinalModify(){
		int num=45;
		try {
			/*
			 * this will generate and arrayIndexOutOfBoundsException 
			 */
			int[]numList= {45,78,990};
		//	System.out.println(numList[5]);	
		}/*
		this will catch the arrayIndexOutOfBoundsException and increment 45 to
		46
		*/
		catch(Exception e) {
			num++;
			System.out.println(e);
			System.out.println("inside catch num is "+num);
			return num;
		}/*
		finally alaways executes so this adds the value of num, which is 46, to 45
		and we get 91, and 91 is returned
		*/
		finally {
			num=num+45;
			System.out.println("inside finally num is "+num);
			return num;
		}
		
	}
	
	Dog returnDog(Dog spot) {
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception in returnDog catch is "+e);
			return spot;
		}
		finally {
			spot.age=100;
			/*
			 * still the same Dog in main, but he now has the age of 100
			 */
			spot=new Dog();
		//	spot.age=100;
			
		}
	}
	/*
	 * whatever is calling this method, has to deal with this exception
	 */
	static void onlyFinally()throws Exception{
		/*
		 * this try block is throwing a checked exception and the finally DOES NOT
		 * deal with it, so we either have to put in a a THROWS clause in the method
		 * signature and let whatever is calling this  method deal with it. 
		 */
		try {
			throw new Exception();
		}
		finally {
			System.out.println("finally block called");
		}
	}

}
