package com.android;

public class Dog implements Behaviour{

	int age=5;
	double weight=3.4;
	@Override
	public int lambda1(int a, int b) {
		System.out.println("lambda1 dog method");
		return 1;
	}
	
	void bark() {
		System.out.println("dog barking");
	}

}

class Ostrich implements Behaviour{

	@Override
	public int lambda1(int a, int b) {
		System.out.println("lambda ostrich method");
		return 0;
	}
	
}
