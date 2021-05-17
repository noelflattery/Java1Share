package com.android;

public class Employee {
	int age=23;
	String name="eddie";
	
	Employee(){
		/*
		 * call to the blank super class constructor is here implicitly
		 * the object class blank constructor is the superclass for
		 * Employee. the Super class is always the class you directly 
		 * inherit from
		 */
		//super();
		System.out.println("blank Employee constructor called");
	}
	
	Employee(int age,String name){
		//super();
		System.out.println("Employee constructor that takes an int "
				+ " and a string called");
		this.age=age;
		this.name=name;
	}
	
	Employee(int age){
		/*
		 * this is calling a constructor in this class that takes an
		 * int and a String
		 * when callign another constructor from within a constructor, 
		 * it HAS TO BE THE FIRST PIECE OF CODE
		 */
	//	System.out.println("hello");
		this(age,"patsy");
		System.out.println("Employee constructor that takes an int called");
	}
	
	void earn() {
		System.out.println("Employee earn money");
	}
	
	void duties() {
		System.out.println("duties method called");
		/*
		 * when calling a method from inside the same class, "this" is
		 * implicitly before every method call
		 */
		earn();
		this.earn();
		//same principle for variables
		System.out.println("age is "+age);
		System.out.println("age is "+this.age);
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Employee age is " + age + ", name is" + name;
	}
}

class Accountant extends Employee implements Behaviour{
//abstract method in Behaviour interface
	@Override
	public void sad() {
		System.out.println("Accountant sad");
		
	}
//abstract method in behaviour interface
	@Override
	public void angry() {
		System.out.println("Accountant angry");
		
	}
/*
 * Accountant also has a default method happy() and takes it's 
 * implementation from the Behaviour interface/
 * Accountant also has a default method callThis() and takes it's 
 * implementation from the Behaviour interface	
 */
	
}
