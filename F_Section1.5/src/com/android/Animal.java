package com.android;
/*
 * An abstract class cannot be instantiated (can't create an animal object)
 * A abstract method can only exist in an abstract class. If ONE method
 * in an class is abstract then the whole class has to be declared abstract
 * A abstract class CAN HAVE concrete methods
 */
public abstract class Animal {
	//variables CANNOT BE abstract
	int age;
	/*
	 * a abstract method has to be defined with the keyword "abstract" and
	 * it has no body {curly brackets}
	 */
	abstract void happy();//no body, no curly brackets
	/*
	 * an abstract class can have concrete methods
	 */
	void mad() {
		System.out.println("I am a mad animal");
	}
	/*
	 * can't have an concrete method without a body {}
	 */
	//void angry();
	/*
	 * can't have a abstract method with a body
	 */
/*	abstract void angry() {
		
	}*/
	void sad() {
		System.out.println("I am a sad animal");
	}
}

class Dog extends Animal{
/*
 * every inheritied abstract method, has to be implemented in this class
 * , because this class is a concrete and you can't have a abstract metho
 * in a concrete class. We have one abstract method in the Animal class,
 * happy() so we implement (override) the happy method. YOU HAVE TO OVERRIDE
 * ABSTRACT METHODS IN A CONCRETE CLASS
 */
	@Override
	void happy() {
		System.out.println("Dog happy");
		
	}
	/*
	 * we are overriding the sad() concrete method from the Animal
	 * class, we don't have to do but WE CAN DO THIS
	 */
	void sad() {
		System.out.println("I am a sad Dog");
	}	
}
/*
 * When an abstract class inherits from another abstract class that has
 * abstract methods in it, it does not have to implement those abstract
 * methods. In this case the Reptile class does not have to implement the
 * happy() method, it can IF IT WANTS TO, BUT IT DOES NOT HAVE TO
 */
abstract class Reptile extends Animal{
	/*
	 * it inherits all the methods from Animal of happy() sad() and mad()
	 * and the next concrete class that it hits HAS TO override happy()
	 */
	abstract void bite();
}

abstract class Snake extends Reptile{
	/*overriding the abstract bite()  method from the reptile class, YOU
	 * DON'T HAVE TO DO THIS,but you can
	 */
	void bite() {
		System.out.println("snake biting");
	}
}

class RattleSnake extends Snake{

	@Override
	void happy() {
		System.out.println("RattleSnake happy");
		
	}
	
}

class Crocodile extends Reptile{

	@Override
	void bite() {
		System.out.println("crocodile biting");
		
	}

	@Override
	void happy() {
		System.out.println("Crocodile happy");
		
	}
	
}