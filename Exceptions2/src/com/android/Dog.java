package com.android;

import java.io.FileInputStream;

public class Dog {
	/*
	 * if whatever is calling this method is not in try/catch block then the 
	 * code will compile, but it will crash when run
	 */
	void eat() {
		throw new RuntimeException();
	}
	/*
	 * this is a method that throws a checked exception, this means that
	 * whatever calls thims method, has to be in a try catch block.
	 * a actual exception is not created in this example.
	 * Anything that can produce a checked exception, has to be placed in a try
	 * catch block
	 */
	void drink()throws Exception{
		System.out.println("Dog Drinking");
	}
/*
 * this method generates a checked exception object, but is not dealt with in a 
 * try/catch block or thrown out of the method and dealt with whatever is calling
 * the method	
 */
/*	void breed(){
		
			throw new Exception();
		
		
	//	FileInputStream fis=new FileInputStream("myfile.txt");
	}*/
	/*
	 * this generates a checked exception object and is dealt with by being 
	 * thrown out of the method. in main we have a try/catch block that deals
	 * with the exception object generated here
	 */
	void sleep()throws Exception{
		/*
		 * in this  method an exception IS generated
		 */
		throw new Exception();
	}
	/*
	 * will not cause any issues as this will only throw out a RuntimeException
	 * if one is generated in the method, if none is generated in the method then
	 * the code will run
	 */
	void run()throws RuntimeException{
		System.out.println("dog running");
	}

}
