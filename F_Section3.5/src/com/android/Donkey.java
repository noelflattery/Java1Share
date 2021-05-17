package com.android;

public class Donkey {
	int age;
	String name;
	double weight;
	
	Donkey(){
		/*
		 * this constructor is calling another constructor
		 * in the same class that takes a int, String and a
		 * double. When calling another constructor from inside
		 * a construct, this statement HAS TO BE the first
		 * statement in the constructor and there can only be
		 * ONE call to another constructor in a constructor.
		 * if you are calling a constructor in your own class
		 * you use the keyword "this", if calling a constructor
		 * in a super class you use the keyword "super"
		 */
		this(12,"neddy",120.2);
		System.out.println("donkey no argument constructor");
	}
	/*
	 * by default every class implicitly has a call to a super
	 * constructor that takes no arguments, it is hidden however
	 * we can include like we have here. this is calling
	 * the super no argument constructor in the Object class.
	 * utlimately every class inherits from the object class
	 * and if it does'nt, this is an error
	 */
	private Donkey(int age,String name,double weight){
		super();
		//this();
		System.out.println("donkey constructor that takes an "
				+ "int, String and double agruement");
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	
	Donkey(int age){
	//	super();
		System.out.println("donkey constructor that takes an "
				+ "int argument");
		this.age=age;
	}
	/*
	 * this is not a constructor, this is a method called 
	 * Donkey, because a constructor has NO RETURN type
	 */
	void Donkey() {
		System.out.println("this is not a constructor");
		
	}
	

}
