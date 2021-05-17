package com.android;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Examples {
	//ArrayIndexOutOfBoundsException
	static void ex1() {
		int[]intList= {2,3,67,89};
		System.out.println(intList[1]);
		System.out.println(intList[5]);
	}
	//IndexOutOfBoundsException
	static void ex2() {
		ArrayList<Integer>intList=new ArrayList<Integer>();
		intList.add(23);
		intList.add(56);
		intList.add(102);
		System.out.println(intList.get(0));
		System.out.println(intList.get(5));
	}
	
	static void ex3() {
		Dog spot=null;
		Dog lassie=new Dog();
		System.out.println(spot);
		/*
		 * this generates a NullPointerException, this exception is generated if
		 * you try and do something with null
		 */
		System.out.println(spot.age);
	}
	/*
	 * you can't have a sub class reference to a super class object, if you try
	 * and cast it, you will get a ClassCastException
	 */
	static void ex4() {
		Dog spot=(Dog)new Animal();
	}
	
	static void ex5() {
		Dog spot=new Dog();
		//spot.recur();
		spot.recur2();
		System.out.println("flow of control back here");
	}
	
	static void ex6() {
		/*
		 * this code is attempting to create an object that will be used to write
		 * information to a file called timmy.txt, the file timmy.txt does not 
		 * exist so this will generate an exception
		 */
		try {
			File newFile=new File("timmy.txt");
			FileInputStream fis=new FileInputStream(newFile);
			System.out.println("File created");
		}
		/*
		 * the catch will not run, if the above code was sucessful.
		 * catch only runs if an actual exception is generated. however all checked
		 * exception either have to be in a try/catch block or thrown to whatever
		 * is calling this method and dealt with there. 
		 */
		catch(Exception e) {
			System.out.println("exception generated");
			System.out.println("Exception is "+e);
		}
		System.out.println("This will print out");
	}
	/*
	 * IF an exception is generated, the method will throw out the exception, 
	 * rather than deal with it in this method
	 */
	static void ex7()throws Exception{
		System.out.println("this has a throws Exception in its method signature");
	}
	
	static void ex8()throws Exception{
		
		File newFile=new File("timmy.txt");
		FileInputStream fis=new FileInputStream(newFile);
		System.out.println("File created");
	}
	/*
	 * if a RuntimeException is generated, then throw it out of the method and 
	 * let whatever is calling the method deal with it/
	 * a RuntimeException does not have to dealt with
	 * and a runtimeException is not generated here, so there is no need
	 * for a try/catch block in main when calling this method
	 */
	static void ex9()throws RuntimeException{
		System.out.println("ex9 method called");
	}
	/*this does create a RuntimeException, so this will compile, but if not 
	 * in a try/catch block when calling from main, your program will crash
	 */
	static void ex10()throws RuntimeException{
		int[]intList= {4,56};
		System.out.println(intList[5]);
	}

}
