package com.android;

public class Cat {
	/*
	 * can't create a Cat as the only constructor the Cat has access to
	 * is a private no argument constructor, and this can't be accessed
	 * outside of the Cat class. only another method of the Cat class
	 * can create a cat. which is what is happening with all time
	 */
	private Cat() {
		
	}
	
	static void meth1() {
		
	}
	
	static void meth2() {
		
	}

}
