package com.android;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Examples {
	
	static void ex1() {
		int[]numList= {34,56,78,99};
		try {
			//this wil not generate an exception
			System.out.println("inside try in ex1");
			System.out.println("number is "+numList[0]);
		}
		//so the catch block never run s
		catch(Exception e){
			System.out.println("code does not run");
			System.out.println(e);
		}
		
		try {
			/*
			 * this code generates an exception which will be caught by the catch
			 * block
			 */
			System.out.println("inside second try");
			System.out.println(numList[5]);
		}
		/*
		 * this catches the exception generated in the try block and prints it
		 * out
		 */
		catch(Exception e) {
			System.out.println("second exception is "+e);
		}
	}
	
	static void ex2() {
		Dog spot=new Dog();
		try {
			/*
			 * this code executes fine, with not exception
			 */
			spot.drink();
			/*
			 * this method does generate an exception which is thrown out
			 * and is dealt with in this try catch block
			 */
			spot.eat();
			
		}
		/*
		 * there is an exception generated so the catch block executes
		 */
		catch(Exception e) {
			System.out.println("eat method exception");
		}
		
	}
	
	static void ex3() {
		Dog spot=new Dog();
		/*
		 * this will cause your program to crash as the sleep methods produces a
		 * ArrayIndexOutOfBoundsException
		 */
		spot.sleep();
	}
	
	static void ex4() {
		Dog spot=new Dog();
		/*
		 * here we decide to catch the RuntimeException produceds in the sleep method
		 * and our program will not now crash
		 */
		try {
			spot.sleep();
		}
		catch(Exception e) {
			System.out.println("exception in sleep "+e);
		}
	}
	/*
	 * if you do not deal with an exception in a try/catch block, if it is a 
	 * runtimeException your program will crash, if it is a checked exception
	 * your program will not compile. this below example will crash as
	 * spot.run produces a IndexOutOfBoundsException which is not dealt with
	 * in this try/catch block
	 */
	static void ex5() {
		Dog spot=new Dog();
		try {
			spot.run();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		/*
		catch(IndexOutOfBoundsException a) {
			System.out.println("IndexOutOfBoundsException is caught");
			System.out.println("exception is "+a);
		}*/
	/*	catch(Exception e) {
			System.out.println("exception exception is "+e);
		}*/
	}
	
	static void ex6() {
		String[]names={"noel","patsy","mary"};
		FileInputStream fis = null;
		try{
			int a=4/0;
			System.out.println(names[4]);
			fis=new FileInputStream("file.txt");
			fis.close();
		}
		/*
		 * ArrayIndexOutOfBoundsException is a sub class of IndexOutOfBoundsException
		 * so it has to go before ArrayIndexOutOfBoundsException
		 */
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("arrayIndexOutOfBoundsException");
			System.out.println("subclass of indexoutofBounds");
		}
		/*
		 * this is a subclass of IOException, so it can go anywhere 
		 * before the catch(IOException ioe)
		 */
		catch(FileNotFoundException fnfe){
			System.out.println("file not found exception");
		}/*
		if on same level, order does not matter
		*/
		catch(IndexOutOfBoundsException o){
			System.out.println("out of bounds exception");
		}
		catch(NullPointerException n){
			System.out.println("nullPointerException");
		}
		catch(RuntimeException r) {
			System.out.println("runtime Exception");
		}/*
		can can anywhere before the catch(Exception e) as IOException is sub class
		of Exception
		and after the catch(FileNotFoundException fnfe) as IOException is a 
		super class of FileNotFoundException
		*/
		catch(IOException ioe){
			System.out.println("IOException ");
		}
		catch(Exception e){
			System.out.println("exception caught");
		}
		/*
		 * super class of all errors and exceptions 
		 */
		catch(Throwable t){
			System.out.println("throwable caught");
		}
		/*
		 * executes in nearly all circumstances
		 */
		finally{
			System.out.println("finally called");
		}
		
	}

}
