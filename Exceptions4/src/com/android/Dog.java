package com.android;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Dog {
	/*
	 * the eat method is saying that IF AN exception is generated in this method,
	 * then the eat method will not deal with the exception, but throw the exception
	 * out to whatever is calling the eat method. So in main, you need to have
	 * a try/catch block whenever calling this eat method
	 */
	void eat()throws Exception{
		System.out.println("dog eating");
		/*
		 * you are doing two things
		 * you are creating a new Exception, which is a checked exception
		 * and then you are throw it out of the method for someone else to deal with
		 */
		//throw new Exception();
		File newFile=new File("timmy.txt");
		FileInputStream fis=new FileInputStream(newFile);
		System.out.println("File created");
	}
	
	void drink() {
		System.out.println("Dog drinking");
	}
	
	void sleep() {
		int[]numList= {34,56,99};
		System.out.println("dog sleep");
		//this will generate an exception, but when calling the sleep method
		//this call does not Have TO BE in a try/catch, but this will crash your
		//program, this is a RuntimeException
		System.out.println(numList[5]);
	}
	/*
	 * this method produces IndexOutOfBoundsException
	 */
	void run() {
		System.out.println("run Dog");
		ArrayList<Integer>numList=new ArrayList<Integer>();
		numList.add(4);
		numList.add(56);
		numList.add(123);
		System.out.println(numList.get(5));
	}

}
