package com.android;

import java.util.concurrent.SynchronousQueue;

public class Animal {
	int age;
	
	String name;
	void eat() {
		System.out.println("Animal eating");
	}
/*
 * this method can ONLY TAKE a animal object, it CANNOT TAKE a dog object as there
 * is no relationship between the classes	
 * so if no inheritance relationship, insteand of a takeAnimal that can take any
 * animal (animal or dog) we have to create two methods in each class. one that takes
 * a Animal and one that takes a Dog
 */
	void takeAnimal(Animal myAnimal) {
		System.out.println(myAnimal.age);
		System.out.println("takeAnimal printed");
	}
	
	void takeAnimal(Dog spot) {
		System.out.println(spot.age);
		System.out.println("takeAnimal printed");
	}

}
/*
 * there is no relationship between Dog and Animal, so nothing is inherited
 */
class Dog{
	int age;
	String name;
	void eat() {
		System.out.println("Dog eating");
	}
	
	void takeAnimal(Dog spot) {
		System.out.println(spot.age);
		System.out.println("takeAnimal printed");
	}
	
	void takeAnimal(Animal myAnimal) {
		System.out.println(myAnimal.age);
		System.out.println("takeAnimal printed");
	}
	
}
