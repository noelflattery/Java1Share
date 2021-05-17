package com.android;

public class Employee {
	
	int age=12;
	String  name;
	static int companyId;
	/*
	 * an initialiser is a block of code that always runs BEFORE
	 * A CONSTRUCTOR
	 * if you have more than one initialiser then they run
	 * the order they are in the file
	 */
	{//initialiser runs 1st
		System.out.println("first initialsier block");
		/*
		 * can be used to initialise values or atributes of
		 * an object, but you can't for instance access the
		 * age of the current employee as you have not created
		 * the employee yet, as initialiser runs BEFORE a 
		 * constructor
		 * so you can't access the age of an employee you 
		 * have not yet created, but you can use it to give
		 * the employee an age.
		 */
		age=23;
		System.out.println(age);
	}
	
	Employee(){//constructor runs 3rd
		System.out.println("constructor called third");
	}
	
	{//initialiser runs 2nd
		System.out.println("second initialiser block called");
	}
	/*
	 * static initialisers always come first in a file, but
	 * only come once per programming session
	 * you can only access statics inside a static initialiser
	 */
	static {
		System.out.println("static runs just once and is first");
		companyId=345;
	}
	

}

class Irish{
	
}