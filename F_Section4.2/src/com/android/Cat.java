package com.android;

public class Cat {
	int age;
	String name;
	//constructor for cat class
	Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Cat age is " + age + ", name is " + name;
	}
	

}
