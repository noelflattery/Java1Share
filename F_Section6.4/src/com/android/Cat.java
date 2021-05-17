package com.android;

public class Cat implements Behaviour {
	int age=50;

	@Override
	public void angry() {
		System.out.println("Cat angry");
		
	}

	@Override
	public void sad() {
		System.out.println("Cat sad");
		
	}
	
	void purrs() {
		System.out.println("Cat purrs");
	}

}
