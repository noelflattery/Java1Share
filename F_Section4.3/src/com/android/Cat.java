package com.android;

public class Cat {
	int age;
	String name;
	//constructor for cat class
	Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	//eat method
	void eat() {
		System.out.println(name+" cat eating");
	}
	//drink method
	void drink() {
		System.out.println(name+" cat drinking");
	}

}
