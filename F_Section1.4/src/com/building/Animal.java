package com.building;
/*
 * only two access levels allowed for top level classes (this is a class
 * that is not within another class). the access levels allowed are public
 * and default (default has no keyword, any class with no access level is
 * given the access level of default which is package level)
 */
public class Animal {
	private class Heart{
		
	}
	/*
	 * if the only constructor in your class is private, it is IMPOSSIBLE
	 * to create a member of this class. ie. in the Animal only one
	 * private no argument constructor means we can't create a Animal
	 * outside of the Animal class
	 */
/*	private Animal() {
		
	}*/
	public Animal() {
		
	}
	
	/*
	 * this is a public instance variable that can be accessed anywhere
	 * within our project
	 */
	public String name="spot";
	/*
	 * default level access instance variable weight only accessed
	 * within the same package
	 */
	double weight=12.5;
	/*
	 * a private instance variable that is available only within the
	 * Animal class
	 */
	private int age=12;
	/*
	 * this protected variables are available to all classes within the
	 * same package and also to subclasses/derived classes. So these variables
	 * are availabe to the Access and Cat class as they are in the same
	 * package, and also available to the Dog class as Dog extends Animal
	 * even though Dog is in a different package
	 */
	protected double height=5.2;
	protected boolean sex=true;
	/*
	 * this is a public instance method that can be accessed anywhere 
	 * within our project
	 */
	public void run() {
		System.out.println("Dog running age is "+age);
		printHello();
		
	}
	/*
	 * default level access instance method eat();
	 */
	void eat() {
		System.out.println("dog Eating age is "+age);
		printHello();
	}
	/*
	 * public static method that can be accessed anywhere within our
	 * project
	 */
	static public void herd() {
		System.out.println("Animal static herd method");
	}
	/*
	 * a static method with default level access which can only be accessed
	 * in the same package
	 */
	static void stampede() {
		System.out.println("Animal static stampede method");
	}
	/*
	 * private method that just prints out hello
	 */
	private void printHello() {
		System.out.println("hello there");
	}
}
/*
 * Zerbra has only default level access so we can only create or access this
 * class inside the same package which is is com.building
 */
class Zebra extends Animal{
	void zMethod() {
		Animal zAnimal=new Animal();
		/*
		 * can't access the private variable age
		 */
		//System.out.println(zAnimal.age);
		//zAnimal.printHello();
	}
}


