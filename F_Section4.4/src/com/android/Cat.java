package com.android;

public class Cat extends Animal{
	int age;
	String name;
	
	Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	Cat(){
		
	}
	
	void eat() {
		System.out.println(name+" eating");
	}

	@Override
	public String toString() {
		return "Cat age is " + age + ", cat name is " + name;
	}
	
	

}
