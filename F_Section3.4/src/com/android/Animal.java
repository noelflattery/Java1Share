package com.android;

public class Animal {
	int age=3;
	String name="andy";
	@Override
	public String toString() {
		return "Age of animal is" + age + ", name of animal " 
	+ name + "]";
	}
	int eat() {
		return 0;
	}
	/*
	 * this is an overloaded method, as the eat method has a 
	 * different parameter list, this takes an int but the above
	 * takes no parameters. RETURN TYPE DOES NOT MATTER FOR
	 * OVERLOADED METHODS
	 */
	void eat(int num) {
		
	}
	/*
	 * you can't have this method in this class, as you already
	 * have a eat method that takes no variables. and what uniquely
	 * identifes a method is the name, in combination with the 
	 * method parameters
	 */
	/*double eat()
	{
		return 0.0;
	}*/
	
	int eat(double dnum, String str) {
		
		return 1;
	}
	/*
	 * this is also overloaded as this has a different order of
	 * parameters, this takes a string and a double.
	 * the one above takes a double and a string
	 */
	int eat(String str,double dnum) {
		return 1;
	}
	/*
	 * access modifer do not matter, i.e private, protected,
	 * public
	 */
	private void eat(boolean myBool) {
		
	}//end of method
	
	void drink() {
		System.out.println("Animal Drinking");
	}//end of method
}//end of Animal class

class Dog extends Animal{
	
	void drink(int num) {
		System.out.println("dog drinking with int");
	}
	
/*	void drink() {
		System.out.println("Dog drinking");
	}*/
		
}


