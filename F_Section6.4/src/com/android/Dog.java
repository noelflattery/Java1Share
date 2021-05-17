package com.android;

public class Dog implements Behaviour{
	int age=200;

	@Override
	public void angry() {
		System.out.println("Dog Angry");
		
	}

	@Override
	public void sad() {
		System.out.println("Dog sad");
		
	}
	
	void pant() {
		System.out.println("Dog panting");
	}

}
