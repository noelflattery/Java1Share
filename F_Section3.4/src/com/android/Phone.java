package com.android;

public class Phone {
	int number;
	String brand;
	/*this is a method that can take an array of ints, which
	 * is what a phone number is
	 * 
	 */
	void dial(int[]numbers) {
		
	}
	/*
	 * this will not work as int...numbers puts all yoru numbers
	 * into an array. So the method signature is exactly the same
	 * as the other dial method. You can't have two methods with
	 * the same signature in the same class
	 */
	/*int dial(int...numbers) {
		
	}*/
	/*
	 * this method can take a double or any smaller numeric
	 * data type
	 */
	void dial(double dnum) {
		System.out.println("dial method");
		System.out.println("taking a double");
	}
	void call(int num,double dnum) {
		System.out.println("calling int and double");
	}
	
	void call(double dNumber,int num) {
		System.out.println("calling double and int");
	}

}
