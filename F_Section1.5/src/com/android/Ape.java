package com.android;

public class Ape implements Behaviour{

	@Override
	public void jealous() {
		System.out.println("ape Jealous");
		
	}

	@Override
	public int anger(double dnum, char myChar) {
		System.out.println("ape angry");
		return 0;
	}

	@Override
	public void joy() {
		System.out.println("Ape full of joy");
		
	}

	@Override
	public void euphoria() {
		System.out.println("a euphoric ape");
		
	}
	/*
	 * this is NOT overriding the statMethod in the Behaviour interface, this
	 * is a DIFFERENT statMethod. you can't override a static method
	 */
	static void statMethod() {
		System.out.println("Ape statmethod called");
	}
	

}
