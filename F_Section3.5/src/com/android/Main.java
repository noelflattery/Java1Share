package com.android;
/**
 * Exam objective 6.3 create and overload constructors
 * including impact on default constructors
 * @author noelf
 */
/*
 * what is a constructor?
 * a constructor is a special type of  method that is used
 * to create an object. the constructor is always the same name
 * as the class it is contained within, it NEVER HAS A RETURN 
 * TYPE, not even void. you can overload constructors, which
 * means a single class can have many different constructors.
 * The same rule to overloaded methods applies to constructors.
 * you have to have either have a different parameter list or 
 * different order of parameters in order to have overloaded
 * constructors
 * 
 */
public class Main {

	public static void main(String[] args) {
		/*Dog() is calling the constructor in the Dog class
		 * that takes no arguments. As we have no user defined
		 * constructor in the class, this will use the default
		 * hidden no argument constructor. As soon as you 
		 * define a constructor in the class, you no longer
		 * have access to the default constructor
		 * 
		 */
		Dog spot=new Dog();
		/*
		 * you can only create a zebra by calling the only 
		 * constructor in the class, which is a constructor
		 * that takes an int.
		 * there is no constructor in the class that takes
		 * no arguments
		 */
		//Zebra zippy=new Zebra();//will not work
		Zebra zed=new Zebra(2);
		
		Cat cat1=new Cat();//constructor 1
		Cat cat2=new Cat(3);//constructor 2
		Cat cat3=new Cat(3,"tom",3.4);//constructor 3
		Cat cat4=new Cat("tabby",5.6,7);//constructor 4
		/*
		 * i CANNOT create a elephant because all of the 
		 * constructors in the Elephant class are private
		 */
		//Elephant nellie=new Elephant();
		/*
		 * only way to create an elephant is if we have a static method
		 * in the elephant class that returns an elephant
		 */
		Elephant nellie=Elephant.makeElephant();
		/*
		 * calls the Donkey constructor that takes no arguments
		 * which itself calls the Donkey constructor that takes
		 * an int, String and double
		 */
		Donkey trump=new Donkey();
		/*
		 * we can see the order of constructors called to 
		 * create harry
		 */
		Human harry=new Human(43,"harry",156,false);
		/*
		 * we can see the order of constructors called to 
		 * create andy
		 */
		Angus andy=new Angus();
		/*
		 * static first and only once
		 * then instance initialisers
		 * then constructors
		 * for eddie we can see the static initialiser called
		 */
		Employee eddie=new Employee();
		/*
		 * but static initialiser is not called for etna as
		 * only called once per
		 */
		Employee etna=new Employee();
		


	}

}
