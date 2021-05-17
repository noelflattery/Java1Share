package com.microsoft;

import com.android.Employee;

public class Accountant extends Employee {
	
	/*
	 * testing to show what variables Accountant inherits from the Employee class
	 */
	void getVariables() {
		/*
		 * has access to age, as age is public in the Employee class, so age is directly inherited
		 * from the Employee
		 */
		System.out.println("can access age "+age);
		/*
		 * can't access name as name has default level access in the Employee class.
		 * so only classes in the same package can inherit this variables
		 */
		//System.out.println("cannot access name "+name);
		/*
		 * can't access phoneNumber as phoneNumber has private level access, so 
		 * this variable can't be inherited
		 */
	//	System.out.println("cannot inherit phoneNumber "+phoneNumber);
		/*
		 * CAN access eamil as the variable email in the Employee class has protected
		 * level access, which means it can be inherited by any class regardless of
		 * it's location, even if in a different package as we are in this 
		 * situation
		 */
		System.out.println("can access email "+email);
		
	}

}
