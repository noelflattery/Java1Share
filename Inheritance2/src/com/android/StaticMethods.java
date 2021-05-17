package com.android;

public class StaticMethods {
	
	static void takeAnimal(Animal myAnimal) {
		System.out.println(myAnimal);//calls the toString method of whatever animal this is
		myAnimal.eat();//calls the eat() method of whatever animal this is
		myAnimal.drink();//calls the drink() method of whatever animal this is
	}
	
	static void takePlant(Plant myPlant) {
		myPlant.grow();
		myPlant.reproduce();
		myPlant.pollinate();
	}

}
