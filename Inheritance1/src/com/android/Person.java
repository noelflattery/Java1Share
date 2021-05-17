package com.android;

import java.util.concurrent.SynchronousQueue;

public class Person {
	int age=40;
	String name="mary";
	double weight=34.5;
	double height=2.3;
	
	void eat() {
		System.out.println("person eating");
	}
	void drink() {
		System.out.println("person drinking");
	}
}
class Employee extends Person{
	double wages=90000;
	int hoursWorked=25;
	@Override
	void eat() {
		System.out.println("employee eating");
	}
	void takeBreaks() {
		System.out.println("employee taking breaks");
	}
	void calcTax() {
		System.out.println("employee calculating tax");
	}
}
