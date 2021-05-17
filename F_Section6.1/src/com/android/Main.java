package com.android;

public class Main {
/**
 * Exam object 7.1 Describe inheritance and it benefits
 * Exam objectives 7.5 User abstract classes and interfaces
 * @param args
 * Benefit 1
 * With smaller derived classes (sub classes) we only need to concentrate on what
 * is unique to a particular derived class
 * Benefit 2
 * ease of modification to common properties and behaviour
 * Benefit 3
 * Extensibility
 * code that works with the base class in some hierarchy tree can work with all
 * classes that are added using inheritance later
 * Benefit 4 
 * use tried and tested code from a base, as if something works in a base class, its
 * going to work in a sub class, promotes re-use of good code.
 * i.e connecting to a database
 * Benefit 5
 * concentrate on specialised behaviour of your classes. 
 * benefit 6
 * logical structures and grouping
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eddie=new Employee();
		Employee etna=new Employee();
		Fireman sam=new Fireman();
		Secretary sean=new Secretary();
		/*
		 * the sendInvitation method returns a Employee reference to a Fireman 
		 * object. As this returns a employee reference to a fireman object we
		 * can't assign this to a fireman, we have to assign it to an employee.
		 * 
		 */
		Employee edel=eddie.sendInvitation(sam);
		/*
		 * casting changes the reference of the object, but you can only cast to
		 * compatible object
		 */
		Fireman fiona=(Fireman)edel;	
		/*
		 * this demonstrates extensibility in that we can send this a fireman, 
		 * oilrig fireman, a secretary or employee to this method as it takes 
		 * an employee object
		 */
		eddie.sendInvitation(sean);
		eddie.sendInvitation(eddie);
		/*
		 * this sendInviation method can take an employee or any of its three subclasses
		 * . if there was no inheritance relationship, then i would have to have 4
		 * overloded sendInvitation methods in each of the classes, one that takes
		 * a employee, one that takes a fireman, one that takes a oilrigFireman and 
		 * one that takes a secretary, which would be 16 methods, rathern than one
		 * method in the super Employee class
		 * See Animal  class for example
		 */
		/*
		 * superclass reference to sub class object, only has access to methods
		 * that the rose class has access too
		 */
		Rose myRose=new EnglishRose();
		myRose.shed();
		myRose.shed();
		myRose.sniff();
		myRose.grow();
		/*
		 * not available as only in the EnglishRose class
		 */
		//myRose.stiffUpperLip()

	}

}
