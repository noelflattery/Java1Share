package com.android;
/**
 * Exam objective 6.1 create methods with Arguments and return 
 * values, including overloaded methods
 * @author noelf
 */
public class Main {
	public static void main(String[]args) {
		/*
		 * creating a new Employee object to access the calcWages()
		 * method
		 */
		Employee eddie=new Employee();
		/*
		 * eddie.calcWages(40) returns a double, so this can be
		 * assigned to a double variable myWages
		 */
		double myWages=eddie.calcWages(40);
		System.out.println("eddies wages are "+myWages);
		/*
		 * system.out.println can take any variable type, so this
		 * print statement is taking a double and printing out the
		 * value
		 */
		System.out.println("eddie again "+eddie.calcWages(40));
		
		int holidays=eddie.calcHolidays(100);
		System.out.println("Eddie has "+holidays+" days holiday");
		
		System.out.println("calling calcHolidays "+eddie.calcHolidays(100));
		/*
		 * you can't put a method call that return void in a a
		 * print statement, and the eat() method returns void
		 * if the return is void, you can't put the method in a
		 * print statement
		 */
	//	System.out.println(eddie.eat());
		/*
		 * the eat method returns void/nothing, so it can't be
		 * assigned to any variable type as it will generate an
		 * error
		 */
	//	int food=eddie.eat();
		//this is the correct way to call this method
		eddie.eat();
		boolean myBool=eddie.shift(14);
		boolean myBool2=eddie.shift(10);
		
		System.out.println("shift is "+eddie.shift(15));
		/*
		 * using a public setter to set the private string 
		 * variable name
		 */
		eddie.setName("eddie");
		/*
		 * with variable argument list you can pass it, one, many
		 * or no ints
		 */
		Person pat=new Person();
		pat.daysWorked(2,3,4,5);//passes in four ints
		pat.daysWorked(2);//passes in one int
		pat.daysWorked();//passes in no ints
		int[]days= {45,78,56,90};
		pat.daysWorked(days);//can also pass in an array
		
		pat.passIntVar(1,4,5);
		
		takeAnimal(new Collie(),4);
				
	}
	
	static void takeAnimal(Animal myAnimal,int num) {
		myAnimal.identifyMe();
		System.out.println("Animal calling me");
	}
	
	static void takeAnimal(Dog myDog,int num) {
		myDog.identifyMe();
		myDog.bark();
	}

}
