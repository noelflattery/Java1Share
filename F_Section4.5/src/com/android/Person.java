package com.android;

public class Person {
	String name;
	double weight;
	public Person(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	//blank constructor
	Person(){
		super();
	}
	
	public boolean equals(Object obj) {
	//	Object objPerson=new Person();
		//this will be true as just checks the object
		//not the reference
	//	System.out.println(objPerson instanceof Person);
		if(obj instanceof Person) {
			Person newPerson=(Person)obj;
			boolean check= name==newPerson.name;
			return check;
		}
		
		return false;
	}

}
