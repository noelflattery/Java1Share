package com.android;

public class Animal {
	int age;

}

class Dog extends Animal{
	/*
	 * generates a StackOverflowError method keeps calling itself and no means
	 * of exit
	 * recursive method call
	 * recursion means calling itself
	 */
	void recur() {
		System.out.println("calling recur");
		recur();
	}
	
	static int count=5;
	void recur2() {
		System.out.println("calling recur2");
		System.out.println("count is "+count);
		count--;
		if(count<0)
			return;
		else
			recur2();
	}
	
}
