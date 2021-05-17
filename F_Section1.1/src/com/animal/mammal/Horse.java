package com.animal.mammal;

public class Horse implements Behaviour{

	@Override
	public void happy() {
		System.out.println("horse happy");
		
	}

	@Override
	public void sad() {
		System.out.println("horse sad");	
	}
	
	public void angry() {
		System.out.println("horse angry");
	}

}
