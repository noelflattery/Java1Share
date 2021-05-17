package com.android;
/**
 * Exam objective 7.2 Develop code that demonstrates the use of
 * polymorphism, including overriding and object type versus reference 
 * type
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		Accountant andy=new Accountant();
		ForensicAccountant freddie=new ForensicAccountant();
		
		System.out.println(andy.age);
		System.out.println(freddie.age);
		System.out.println("qualifications of andy");
		System.out.println(andy.qualifications[0]);//both CPA
		System.out.println(freddie.qualifications[0]);//both CPA
		/*
		 * super class reference to a sub class object. reference
		 * determines what methods and variables can be called,
		 * only methods that are common to all Employees can be 
		 * called. it has to be a super class reference to a sub
		 * class object, the other way around will not compile
		 */
		Employee eddie=new Accountant();
		/*
		 * this will result in a ClassCastException, you can't 
		 * cast a superclass object to be of type sub class
		 */
	//	Accountant angela=(Accountant)new Employee();
		eddie.earn();
		eddie.holiday();
		System.out.println("age of eddie "+eddie.age);
		System.out.println("name of eddie "+eddie.name);
		System.out.println("pps of eddie "+eddie.pps);
		/*
		 * no access to variables or methods unique to accountants
		 */
		//System.out.println(eddie.qualifcations[0]);
		//eddie.fiddleTheBooks()
		
		Work workAccount=new Accountant();
		Work workFireman=new Fireman();
		/*
		 * if a super class implements an interface, all of its 
		 * subclasses also implment the interface
		 */
		Work workForensic=new ForensicAccountant();
		
		workAccount.clockIn();
		workFireman.clockIn();
		workForensic.clockIn();//takes implementation from accountant class
		/*
		 * populate this array with objects that implement the 
		 * Work interface, this takes 4 objects
		 */
		Work[] workEmployees=new Work[4];
		//these objects can only clockin()
		workEmployees[0]=new Accountant();
		workEmployees[1]=new ForensicAccountant();
		workEmployees[2]=new Fireman();
		workEmployees[3]=new Accountant();
		
		System.out.println("clockin for Employees");
		
		for(Work w:workEmployees) {
			w.clockIn();
		}
		//none of these object has access to the clockIn() method
		//because Employee does NOT implement the Work interface
		Employee[]empList= {new Accountant(),new Fireman(), new Nurse(),
			new Teacher(),new Farmer()	
		};
		/*
		 * all of these objects only have access to variables and methods
		 * that are common to all employees
		 */
		for(Employee e:empList) {
			System.out.println(e.getClass().getSimpleName());
			e.earn();
			e.holiday();
			System.out.println("age is "+e.age);
			System.out.println("name is "+e.name);
			System.out.println("pps is "+e.pps);
		}
		

	}

}
