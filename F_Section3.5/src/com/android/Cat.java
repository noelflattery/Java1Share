package com.android;

public class Cat {
	int age;
	String name;
	double weight;
	/*
	 * this is a Cat constructor that takes no arguments
	 */
	Cat(){//constructor 1
		System.out.println("cat constructor with no arguements");
		age=21;
		name="tibbles";
		weight=12.3;
	}
	/*
	 * This is a constructor that takes an int, and assigns
	 * that int to age. this is an overloaded constructor as
	 * it has a different parameter list to the other
	 * constructors in the class
	 */
	Cat(int newAge){//constructor 2
		age=newAge;
	}
	/*
	 * this is a constructor that takes an int, a String and
	 * a double and assigns them to age,name and weight
	 * respectively. this is a overloaded constructor as this
	 * has a different parameter list to other constructors
	 * in the class
	 */
	Cat(int age,String name,double weight){//constructor 3
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	/*
	 * this is overloaded as the parameters are in a different
	 * order to the above constructor
	 */
	Cat(String name,double weight,int age){//constructor 4
		this.name=name;
		this.weight=weight;
		this.age=age;
	}

}
