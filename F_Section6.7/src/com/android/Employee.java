package com.android;

public class Employee {
	private int age;
	private String name;
	private int rating;
	Behaviour myBehave;
	
	public Employee(int age, String name, int rating) {
		super();
		this.age = age;
		this.name = name;
		this.rating = rating;
	}
	
	
	
	public Employee(int age, String name, int rating, 
			Behaviour myBehave) {
		super();
		this.age = age;
		this.name = name;
		this.rating = rating;
		this.myBehave = myBehave;
	}



	int getRating() {
		return rating;
	}

}
