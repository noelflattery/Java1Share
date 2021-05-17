package com.android;

public class Athlete implements Behaviour{
//same name and variable type as in Behaviour interface
	final int finalInt=1000;
	@Override
	public void sad() {
		System.out.println("Athlete Sad");
		
	}

	@Override
	public void angry() {
		System.out.println("Athlete angry");
		
	}
	@Override
	public void happy() {
		System.out.println("Athlete happy");
	}
//same static method signature as in Behaviour interface	
	static void statMethod() {
		System.out.println("statMethod in Athlete called");
	}

}
