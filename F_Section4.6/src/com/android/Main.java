package com.android;

import java.util.logging.Logger;

/**
 * create and manipulate calendar data using classes from
 * java.time.LocalDateTime, Java.time.LocalDate,
 * Java.time.LocalTime,Java.time, from,DateTimeFormatter,
 * java.time.period
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		
	//	Examples.ex1();
	//	Examples.ex2();
	//	Examples.ex3();
	//	Examples.ex4();
	//	Examples.ex5();
	//	Examples.ex6();
	//	Examples.ex7();
	//	Examples.ex8();
		Examples.ex9();
		
		/*
		 * we can create a dog as there is no user created constructor in
		 * the Dog class which means the Dog class has access to the hidden
		 * public default no argument constructor.
		 */
		Dog spot=new Dog();
		Cat.meth1();
		Cat.meth2();
		/*
		 * we can't create a Cat as there IS A PRIVATE CONSTRUCTOR in the
		 * cat class. when we have a user defined constructor in the class
		 * that class then has no access to the public default no arugment
		 * constructor.
		 * This is the ONLY CONSTRUCTOR available to the Cat 
		 * class, and as it is private this constructor is not accessible
		 * outside of it's own class. so we can't create a Cat outside 
		 * of the Cat class
		 */
	//	Cat tibbles=new Cat();	
	}
	

}
