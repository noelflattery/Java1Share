package com.android;

public interface Behaviour {
	/*
	 * an abstract method called lambda1(can call it anything you
	 * want) that takes two ints and returns an int
	 */
	int lambda1(int a,int b);
	
	default void method1() {
		
	}
	
	default void method2() {
		
	}

}
