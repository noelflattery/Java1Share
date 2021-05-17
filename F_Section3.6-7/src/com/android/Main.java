package com.android;
/**
 * Exam objective 2.3
 * know how to read or write to object fields
 * Exam objective 3.7
 * Apply Encapsulation principles to a class
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * setting the values of the Dogs age and name by
		 * using a constructor
		 */
		Dog spot=new Dog(5,"spot");
		/*
		 * both these variables are public which means we can
		 * access these variables anywhere in the program
		 */
		System.out.println("age is "+spot.age);
		System.out.println("name is "+spot.name);
		
		Cat tibbles=new Cat(5,"tibbles");
		
		Zebra zed=new Zebra();
		/*
		 * we're using a public setter method to set the private
		 * atribute age, which is the age of the Zebra
		 * setters should always void
		 */
		zed.setAge(12);
		/*
		 * we are using a public getter method to get the private
		 * atribute age, which is the age of the zebra.
		 * getters ALWAYS have a return, NEVER VOID.
		 * if you are retrieved a int atribute, the getter method
		 * has to return an int
		 */
		System.out.println("age of zebra is "+zed.getAge());

	}

}
