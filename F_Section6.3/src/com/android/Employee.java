package com.android;

public class Employee {
	int age=23;
	String name="tom";
	String pps="9999999a";
	
	void earn() {
		System.out.println("Employee earn");
	}
	
	void holiday() {
		System.out.println("Employee holiday");
	}
}

class Accountant extends Employee implements Work{
	
	String[]qualifications= {"CPA","CFA"};

	@Override
	public void clockIn() {
		System.out.println("Accountant clockin");
	
	}
	@Override
	void earn() {
		System.out.println("Accountant earning");
	}
	//only accountants has this method
	void fiddleTheBooks() {
		System.out.println("Accountant fiddling");
	}
	
}

class Fireman extends Employee implements Work{

	@Override
	public void clockIn() {
		System.out.println("fireman clockin");	
	}
	
	void extinguish() {
		System.out.println("i put out fires");
	}
	
}

class ForensicAccountant extends Accountant{
	void investigate() {
		System.out.println("i investigate");
	}
}

class Nurse extends Employee{
	void earn() {
		System.out.println("nurse earning");
	}
}

class Teacher extends Employee{
	void earn() {
		System.out.println("Teacher earning");
	}
}

class Farmer extends Employee{
	void earn() {
		System.out.println("teacher earning");
	}
}
