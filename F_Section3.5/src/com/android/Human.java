package com.android;

public class Human {
	int age;
	String name;
	double weight;
	boolean sex;
	String gender;
	
	
	//constructor 1
	Human(int age,String name,double weight,boolean sex){
		this(age,name);//calling constructor 2
		System.out.println("constructor 1 called");
		this.weight=weight;
		this.sex=sex;
		if(sex==true)
			gender="female";
		else
			gender="male";
	}
	//constructor 2
	Human(int age,String  name){
		this(name);//calling constructor 3
		System.out.println("constructor 2 called");
		this.age=age;
	}
	//constructor 3
	Human(String name){
		this();//calling constructor 4
		System.out.println("constructor 3 called");
		this.name=name;
	}
	//constructor 4
	Human(){
		super();//calling blank constructor in Object class
		System.out.println("constructor 4 called");
		/*
		 * prints out 
		 * constructor 4 called
		 * constructor 3 called
		 * constructor 2 called
		 * constructor 1 called
		 */
	}
	

}
