package com.android;

public class Employee {
	private String name;
	int age;
	/*
	 * this method takes a int(hours) and returns a double
	 * (wages)
	 * the amount of hours is multiplied by 20 and returns
	 * the product of this to main
	 */
	double calcWages(int hours) {
		double wages;
		wages=hours*20;
		return wages;
	}
	/*
	 * for every 5 days worked, we get 1 day holidays
	 */
	int calcHolidays (int daysWroked) {
		int holidays=daysWroked/5;
	//	System.out.println("holidays are "+holidays);
		return holidays;
	}
	
	void eat() {
		System.out.println("Employee eats");
		/*
		 * if your return is void, you do not have to put in a 
		 * return, but you can if you want too.
		 * Primary function of a return statement is to exit a
		 * method
		 */
		return;
	}
	/*
	 * if working more than 12 hours, they are on the day shift
	 * and this method returns true
	 * if less than 12 hours, they are on the night shift and
	 * this method returns false
	 * you can have more than one return, as long as it is the
	 * LAST line executed when the method is called.
	 * so if time>12, the last line executed will be 
	 * return true
	 * if time<=12, the last line executed will be
	 * return false;
	 */
	boolean shift(int time) {
		if(time>12) {
			System.out.println("day shift");
			eat();
			return true;
			/*
			 * unreachable code so will not compile
			 */
	//		System.out.println("hello");
		}
		else
			System.out.println("night shift");
		return false;
		/*
		 * unreachable code will not compile
		 */
	//	System.out.println("hello");
	}
	/*
	 * instead of having a break, we have a return statement
	 * for each case statement which will exit the method.
	 *  so if your number is one, it  return the string 
	 *  "you have choosen 1"
	 *  if the number is not 1,2,3 or 4 then it will exit with
	 *  the String
	 *  "you have choosen some other number"
	 */
	String moreReturns(int choice) {
		System.out.println("Multiple returns in switch statement");
		switch(choice) {
		case 1:
			String myStr="you have choosen 1";
			return myStr;
		case 2:
			return "you have choosen 2";
		case 3:
			return "you have choosen 3";
		case 4:
			return "you have choosen 4";
		default:
			return "you have choosen some other number";	
		}
		
	}
	/*
	 * we can use methods to access and change instance variables
	 * of an object, in this case the age and name of an employee.
	 * even if those variables are private.
	 * this is a public setter method
	 */
	public void setName(String newName) {
		name=newName;
	}
	

}
