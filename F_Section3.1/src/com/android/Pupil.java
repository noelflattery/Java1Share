package com.android;

public class Pupil {
	String name;
	int age;
	static int courseId=3456;
	//constructor
	Pupil(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	//instance method eat
	void eat() {
		/*
		 * accessing both instance variables/atributes and static
		 * variables in the this method
		 */
		System.out.println("my name is "+name+" i am "+age+ ""
				+ " years old and i eat and i am in course "+
				courseId);
	}//end of method
	//can't access non statics in a static method
	static void takeCourse() {
		System.out.println("we are taking a course with id of "+
				courseId);
	//	System.out.println("cannot access age"+age);
	//	System.out.println("cannot access name "+name);
	}//end of method

}
