package com.android;

public class Person {
	static int counter=0;
	int age;
	Person(){
		System.out.println("person created");
		counter++;
		System.out.println(counter+" people created");
	}
	
	Person(int age){
		this.age=age;
		counter++;
		System.out.println(counter+" people created");
	}

}
