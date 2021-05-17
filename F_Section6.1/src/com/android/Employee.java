package com.android;

import java.util.concurrent.SynchronousQueue;
import java.util.logging.Logger;

public class Employee {
	/*
	 * its available in all classes, regardless of where they are
	 */
	public int age=23;
	/*
	 * default or package level access, it's available only in the same 
	 * package
	 */
	String name="tony";
	/*
	 * avaiable only in the same class
	 */
	private int phoneNumber=980989080;
	/*
	 * available in same package and in a derived class, no matter where that derived
	 * class is
	 */
	protected String email="me@you.com";
	/*
	 * we decided, after creating all of our subclasses, that every employee needed
	 * a variable to hold they're pps. so we then created a String called "pps", 
	 * which now means that every employee has a pps
	 */
	protected String pps;
	/*
	 * you have to make this constructor either public or protected. As Accountant
	 * is in a different package. Accountant extends Employee, which means we have
	 * to first create a employee, in order to create a accountant (super class
	 * object created first, then sub class created). If our constructor is default
	 * level access, then the accountant class has not access to this constructor
	 * and cannot create an employee
	 */
	protected Employee() {
		
	}
	/*
	 * these two methods are available to all subclasses in same file and same
	 * package, but not available outside package, so not avaiable to Accountants
	 */
	void earn() {
		System.out.println("Employee earn");
	}
	
	void work() {
		System.out.println("Employee work");
	}
	/*
	 * this can be inherited by any class, anywhere 
	 */
	public void someMethod() {
		System.out.println("employee someMethod");
	}
	/*
	 * this can be accessed and inherited from within the same package and outside
	 * of the packages, so Accountnat can access and inherit this method
	 */
	protected void protectMethod() {
		System.out.println("Employee protect method");
	}
	/*
	 * this method can take an employee, or a sub class of employee. which means
	 * this method can take a Employee, a secretary, a fireman, or a oilRigFireman
	 * this method can return ANY employee and can take ANY employee
	 */
	Employee sendInvitation(Employee emp) {
		System.out.println(emp.getClass().getSimpleName());
		System.out.println("invitation sent");
		return new Fireman();
	}

}

class Secretary extends Employee{
	int wordsPerMinute;
	
	void fileAway() {
		System.out.println("Secretary filing");
	}
	
	void type() {
		System.out.println("Secretary typing");
	//	Logger logger = null;
	//	logger.log(null, "My Message");
	//	logger.log
		
	}
}

class Fireman extends Employee{
	String safetyQualifications;
	
	void rescue() {
		System.out.println("fireman rescue");
	}
	
	void extinguish() {
		System.out.println("fireman extinguish");
	}
}

class OilRigFireman extends Fireman{
	/*
	 * you speicalise you classes as much or as little as you want
	 * this class actually has 7 methods, 6 inherited and one of its own, swim()
	 */
	void swim() {
		System.out.println("oilrig swimming man");
	}
}
