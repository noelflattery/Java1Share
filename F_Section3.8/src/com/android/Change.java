package com.android;

public class Change {
	
	static void changePrimitive(int num,boolean myBool) {
		
		num*=num;
		//num=num*num;
		myBool=true;
		System.out.println("inside method values are "+
		num+" and myBool is "+myBool);
	}
	
	static void changeDog(Dog spot) {
		spot=new Dog();
		/*
		 * spot is now a different dog
		 */
		System.out.println("id of dog inside method "+spot.id);
	}
	
	static void changeDogAtribute(Dog spot) {
		spot.age=100;
		spot.name="fido";
	}
	
	

}
