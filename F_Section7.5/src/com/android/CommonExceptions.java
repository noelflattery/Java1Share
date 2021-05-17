package com.android;

import java.util.ArrayList;

public class CommonExceptions {
	
	static void outOfBounds() {
		int[]numbers= {45,67,99};
		ArrayList<Integer>listNum=new ArrayList();
		listNum.add(567);
		listNum.add(55);
		listNum.add(22);
		//this will generate IndexOutOfBoundsException
		System.out.println(listNum.get(5));
		//this will generate ArrayIndexOutOfBoundsException
		//System.out.println(numbers[5]);	
	}
	
	static void classCast() {
		Animal[]farm=new Animal[3];
		farm[0]=new Dog();
		farm[1]=new Cat();
		farm[2]=new Dog();
		
		Dog lassie=(Dog)farm[0];
		/*
		 * you can have a super class reference to a sub class object
		 */
		Animal anDog=new Dog();
		/*
		 * you can't have a sub class reference to a super class object, if you attempt to
		 * cast the object you will get a ClassCastException
		 */
		Dog dogAnimal=(Dog)new Animal();
		
	
	}
	
	static void illegalArgument(String pwd) {
		if(pwd==null|| pwd.length()<6) {
			System.out.println("illegal password format");
			/*
			 * as far as i know, you have to explicitly throw this exception
			 */
			throw new IllegalArgumentException("Password cannot be shorter than 6 characters");
		}
		
		
	}
	
	static void nullPointer() {
		/*
		 * when you create an array of objects, and don't give them any explicit value, then
		 * each item in the array is null
		 */
		Dog[]dogList=new Dog[3];
		//this will print null
		System.out.println(dogList[1]);
		/*
		 * this is trying to call a eat method, on a a null object, so you get NullPointerException
		 */
	//	dogList[1].eat();
		/*
		 * there is nothing wrong with a null object, the issue arises when you try to do
		 * something with a null object (i.e the eat() method in the Dog) you will get
		 * a NullPointerException
		 */
		Dog spot=null;
		System.out.println(spot);
		spot.eat();	
	}
	
	static void Arithmetic() {
		/*
		 * this gives arithmeticException, division by zero, this is only the case for
		 * Integers
		 */
	//	System.out.println(4/0);
		/*
		 * this give us the answer Infinity
		 */
		System.out.println(4.0/0);
		System.out.println(4/0.0);
		System.out.println(4.0/0.0);
		
		System.out.println(4/122222222222222222L);
	}
	/*
	 * NumberFormatException is generated when we try to parse a String that does not
	 * contain a valid number
	 */
	static void NumberFormat(){
		String number="234";
		String number2="1000";
		int num=Integer.parseInt(number);
		int num2=Integer.parseInt(number2);
		
		String wrongNum="123rth7";
		//int num3=Integer.parseInt(wrongNum);
		int hex=0x12f;
		System.out.println(hex);
		System.out.println();
		String hexNumber="12F";
		/*
		 * this will parse out the string, but you have to tell the parser that it is base
		 * 16
		 */
		int hexNum2=Integer.parseInt(hexNumber,16);
		//hex numbers only go as far as F
		hexNumber="12G";
		//this generates a numberFormatException
	//	System.out.println(Integer.parseInt(hexNumber,16));
	}
	

}
