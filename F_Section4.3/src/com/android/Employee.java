package com.android;

public class Employee implements Behaviour{

	int age=45;
	String name="eddie";
	@Override
	public void mad() {
		System.out.println("employee mad");
		
	}

	@Override
	public void happy() {
		System.out.println("employee happy");
		
	}

	@Override
	public void sad() {
		System.out.println("employee sad");
		
	}
	
	void doWork() {
		System.out.println("employee working");
	}

}

class Fireman extends Employee{
	public void sad() {
		System.out.println("fireman sad");
	}
	//this is only default level access
	//a overriden method CANNOT BE ANY LESS AVAILABLE
	//MAD IS PUBLIC IN EMPLOYEE, SO IT HAS TO BE PUBLIC HERE
/*	void mad() {
		
	}*/
	/*
	 * an overriden method CAN'T BE LESS AVAILABLE, it can be
	 * however MORE AVAILABLE. doWork in the Employee was only
	 * default level access, here it is overriden with a default
	 * level access method
	 */
	public void doWork() {
		
	}
}
