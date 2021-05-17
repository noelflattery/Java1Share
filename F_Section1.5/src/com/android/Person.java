package com.android;

import java.util.concurrent.SynchronousQueue;

/*
 * the "final" keyword
 * when you have a final class, You cannot inherit from it
 * the String is a final class, you can't have a subclass of the String class
 */
public final class Person {
	String name;
	/*
	 * a final variable cannot change once given a value
	 */
	final int age=34;
	/*
	 * you cannot create a Person without making sure that all of your
	 * final variables are given a value
	 */
	final double weight;
	/*
	 * you can't create a person without using this constructor, so you will
	 * always assign a value to the final double weight. it is an error
	 * to create a p e rson without giving a value to weight
	 */
	Person(double weight){
		this.weight=weight;
		final int myVar=67;
	}
	//see end of file for final methods
	
	
}
/*
 * can't extend to European
 */
/*class European extends Person{
	
}*/

class European {
	/*
	 * you can't override a final method
	 */
	final void talk() {
		System.out.println("European Talking");
	}
	//you can overload final methods, becasue they are totally different methods
	void talk(int num) {
		
	}
	
}

class Irish extends European{
	/*
	 * you can't override a final method
	 * and talk is a final method, so this is not allowed
	 */
/*	void talk() {
		System.out.println("Irish talking");
	}*/
}
