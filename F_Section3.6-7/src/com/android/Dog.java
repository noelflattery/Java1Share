package com.android;

public class Dog {
	public int age;//age of dog
	public String name;//name of dog
	//constructor for a Dog
	public Dog(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
	/*
	 * getter for age
	 * a public method that gets the variable age
	 */
	public int getAge() {
		return age;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//setter, which is setting the age of an existing dog
	public void setAge(int age) {
		this.age=age;
	}
	//setter, which is setting the name of an existing dog
	public void setName(String name) {
		this.name=name;
	}

}
