package com.android;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>();
		
	//	Box<Integer>intBox=new Box<Integer>();
	//	Box<String>strBox=new Box<String>();
	// 	Box<Dog>dogBox=new Box<Dog>();
		
		Horse neddie=new Horse();
		neddie.walk("hello");
		//an interface reference to a Horse object
		//this object can only walk()
		Move myMove=new Horse();
		/*
		 * a lambda has to be a reference to an interface
		 * this interface can only have ONE abstract method inside it
		 * what goes on the right is direct implementation of the 
		 * single abstract method inside the move interface
		 * direct implementation of the walk method
		 * a is the parameter list, only one parameter, if we had more
		 * than one parameter in the walk method, we could put in
		 * (a,b)
		 * method parameters and method body need to be seperated by
		 * a arrow ->
		 * { curly brackets are the body of the walk method in the 
		 * Move interface
		 */
		
		Move lambMove//interface reference
		//the walk method only takes one variable
		=(a)->{//direct implementation of the abstract walk method
			System.out.println("lambMove called");
			System.out.println(a);
		};//lambda has to end with a semi colon
		//calling the lambda with a int
		lambMove.walk(23);
		/*
		 * different implementation of the abstract walk method in the
		 * Move interface
		 */
		Move lambMove2=(myObject)->{
			System.out.println("lambMove2 called");
			System.out.println(myObject);
		};
		//calling the lambMove2 lambda
		lambMove2.walk("hello there");
		/*
		 * a lambda of the hungry method that takes an int and a 
		 * string, we do not need to specify that the first variable is
		 * a int and the second variable is a string, but we can
		 */
		Condition myCondition=(int a,String b)->{
			System.out.println("a is "+a);
			System.out.println("b is "+b);
		};
		
		myCondition.hungry(12, "lamb chop");
		/*
		 * there is a build in interface in java called predicate which
		 * has one abstract method called test, has a structre like the
		 * following
		 * public interface Predicate<K>{
		 * 	boolean test(K myK);
		 * }
		 * and
		 * 
		 */
		Predicate myPred;
		myPred=(b)->{
			System.out.println("myPred called");
			System.out.println(b.getClass().getSimpleName());
			return true;
		};
		
		myPred.test(12);
		
		
		

	}

}
