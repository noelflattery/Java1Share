package com.android;

public class Dog {
	static int counter=0;
	int age=45;
	double weight=12.34;
	final int dogId;
/*
 * every dog will have they're own unique dogId	
 */
	public Dog(){
		dogId=counter;
		counter++;
	}
	/*
	 * overriding the equals() method from the Object class
	 * if age and weight of a Dog matches with another dog, we will say that
	 * they are twins and will return true
	 */
	@Override
	/*
	 * Object is the superclass of all other classes in java
	 * and ultimately all classes are derived from this class.
	 * this method takes a object, when you have a superclass object in
	 * the parameter list of a method, it means that this method can take
	 * ANY subclass of the method. So this means in effect that this method
	 * can take ANY OBJECT OF ANY TYPE
	 */
	public boolean equals(Object myDog) {
	/*
	 * in order to use this object as a Dog, we have to cast it to be a 
	 * Dog object	
	 */
		Dog spot=(Dog)myDog;
		
		if(age==spot.age&&this.weight==spot.weight) {
			//if age and weight match for both dogs the method exits
			return true;
		}
		else
			return false;
	}
	
	void takeAnimal(Animal andy) {
		System.out.println("TakeAnimal called");
	}
	
}

class PassMe{
	
	static void changeValue(Dog spot,int num) {
		spot.age=9000;
		System.out.println("inside method age of dog is "+spot.age);
		num=78000;
		System.out.println("inside method number is "+num);
		spot=new Dog();
		System.out.println("inside method id of dog is "+spot.dogId);
//		System.out.println("age of new dog inside method is "+spot.age);
	//	Dog.counter--;
	}
}
