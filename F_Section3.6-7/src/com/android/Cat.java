package com.android;

public class Cat {
	/*
	 * we are applying encapsulation principles to the Cat 
	 * class. this is making all of our atributes private and
	 * using public methods to access the values (getters) and
	 * using public methods to change the values
	 */
	private int age;
	private String name;
	
	Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	/*
	 * if we want to be able to access a private, we need to
	 * create a public getter method
	 * a public method that will return the age of the cat, but
	 * will not allow you to change the age the cat
	 */
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

}
