package com.android;

public class Zebra implements Mood,Mood2{

	/*
	 * if two unrelated interfaces have two methods, with the same
	 * method signature, and a class implements both of those
	 * interfaces, then the class does not know whcih of those methods
	 * to choose. so the implementing class HAS TO OVERRIDE that method
	 * . here we have a default void happy() method in both Mood and
	 * Mood2, Zebra implements both interfaces, so it does not know which
	 * happy method to choose, so we then HAVE to override the happy()
	 * method
	 */
/*	@Override
	public void happy() {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void sad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void angry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void happy() {
		System.out.println("zebra happy");

	}
	


}
