package com.android;

import java.util.function.Predicate;

public class Main {
	public static void main(String[]args) {
		
		Dog spot=new Dog();
		spot.bark();//own method from Dog class
		spot.lambda1(4, 6);//abstract method in Behaviour interface
		//dog implments Behaviour so have to implement all
		//abstract methods contained in the Behaviour interface
		Behaviour myBehave=spot;
		Behaviour behaveDog2=new Dog();
		myBehave.lambda1(2, 4);
		/*
		 * lambdas always starts with a interface reference on the 
		 * left. The interface it refers to can only have ONE
		 * ABSTRACT method in it for it to be a lambda.
		 * on the right hand side of the assignment operator (=)
		 * we have to put a parameter list enclosed in parenthesis.
		 * the method in the Behaviour takes two ints, so here 
		 * int a, int b, represents the two variables the method
		 * lambda1 takes. these are the parameter list of the 
		 * lambda1 method. 
		 * this is followed by an arrow ->
		 * then we have implmentation of the the lambda1 method, which
		 * is in {} curly brackets
		 * lambda1 method in the behaviour interface returns an int
		 * so our lambda has to return an int
		 */
		Behaviour b1=(int num,int num2)->{
			System.out.println("b1 behaviour called");
			int sum=num*num2;
			return sum;
		};
		System.out.println("b1.lambda(3,4) "+b1.lambda1(3, 4));;
		
		Behaviour b2=(a,b)->{
			System.out.println("b2 behaviour called");
			return a+b;	
		};
		
		System.out.println("b2.lambda(3,4) "+b2.lambda1(3, 4));
		
		Behaviour b3=(int num1,int num2)->{
			System.out.println("b3 behaviour called");
			int sum=num1/num2;
			return sum;
		};	
		System.out.println("b3.lambda(3,4) "+b3.lambda1(3, 4));
		/*
		 * we are implementing the lambda1 abstract method in the
		 * behaviour interface, that takes two ints and returns
		 * an int. if you lambda only has ONE line of code, you do
		 * not need to put in curly brackets
		 */
		Behaviour b4=(a,b)->a+b*a-b;
		/*
		 * if you lambda has MORE THAN one line of code, you have 
		 * to put in a curly brackets
		 */
		Behaviour b5=(int a,int b)->{
			int sum=a+b*a-b;
			return sum;
		};
		Behaviour behaveDog=new Dog();
		
		System.out.println("b4.lambda1(3, 4) "+b4.lambda1(3, 4));
		System.out.println("b5.lambda1(3, 4) "+b5.lambda1(3, 4));
		//System.out.println(b1.lambda1(2, 20));
		Employee eddie=new Employee(23,"eddie",4);
		Employee etna=new Employee(52,"etna",6);
		/*
		 * Employee has instance variables of int age, string name,
		 * int rating 
		 *It also has a interface reference Behaviour myBehave. this
		 *can be a lambda that implements the lambda1 method in the
		 *behaviour interface (we have 5, b1,b2,b3,b4,b5) or a object
		 *of a class that implements the Behaviour interface (Dog
		 *class implements Behaviour)
		 */
		Employee ed=new Employee(40,"ed",7,b1);
		ed.myBehave.lambda1(3, 4);
		Employee edel=new Employee(34,"edel",8,new Dog());
		System.out.println("what does edel do");
	//	edel.myBehave.lambda1(3,4);
		/*
		 * based on the Validate interface which has one abstract
		 * method called check, and check takes an employee and
		 * returns a boolean
		 */System.out.println("long form validatePerformance");
		Validate validatePerformance=(Employee emp)->{	
			if(emp.getRating()>5)
				return true;
			else
				return false;
		};
		/*
		 * if rating is greater than 5, return true, else return false
		 */
		System.out.println(validatePerformance.check(etna));
		System.out.println(validatePerformance.check(eddie));
		/*
		 * this is exactly teh same as the validatePerformance
		 * lambda. the method check(), in the validate interface
		 * only has on variable in it's parameter, so we do not have
		 * to put this in parenthesis (), if we only have one line of
		 * code in the method body of the lambda, we do not need to
		 * put in curly brackets
		 */
		Validate validatePerShort=emp->emp.getRating()>5;
		System.out.println(validatePerShort.check(edel));
		//b1 lambda takes two ints and multiplies them
		//4*4=16
		takeLam(4,"hello",b1);
		//b2 lambda takes two ints and adds them
		//10+10=20
		takeLam(10,"pineapple",b2);	
		
		takeLam(34,"Apple",new Dog());
		/*
		 * this is implementing the test method in the Maneners interface
		 * which has a method signature of 
		 * boolean test(T t)
		 * T is a generic data type that is defined when we create the
		 * Manners interface by going interface Manners<T>
		 * when creating a lambda for the test method, we supply a data type
		 * (Employee) so that T then becomes an employee in the 
		 * parameter list and implementation. T can be ANY data type
		 */
		Manners<Employee>myMood=(emp)->{//body of test method
			System.out.println("lambda of the test method ");
			System.out.println("in the Manners interface that has a generic "
					+ "type t");
			return emp.getRating()>5;
		};
		
		System.out.println(myMood.test(eddie));
		
		Manners<String>myMood2=(str)->{
			System.out.println("with string data type");
			return true;
		};
		System.out.println(myMood2.test("myString"));
		
/*
 * there is a built in interface called Predicate, which looks 
 * like this
 * public interface Predicate<T>{
 * 		boolean test(T t);
 * }
 * this takes ANY DATA TYPE (except primitives) type and 
 * returns a boolean HAS TO BE BOOLEAN
 * (exact same structure as the test method
 * in the Manners interface we have, BUT IT IS NOT THE SAME METHOD)
 * we have to import this interface (like we import the 
 * classes to do with Dates and Arraylists, see top of file
 * 
 */
		
	Predicate<Employee>predEmployee=(emp)->{
		System.out.println("Predicate with Employee data type");
		return emp.getRating()>5;
	};
	
	System.out.println(predEmployee.test(etna));
	System.out.println(predEmployee.test(eddie));
	

		
		
		
	
	}
	/*
	 * this is a method, that takes an int, a string
	 * and an object with a Behaviour reference, which can be
	 * a object of a class that implements Behaviour (a dog)
	 * or a lambda that directly implements the method in
	 * the Behaviour interface
	 */
	static void takeLam(int num,String str,Behaviour myB) {
		System.out.println("str is "+str);
		System.out.println("returned number is "+
		myB.lambda1(num,num));;
	}

}

interface test{
	
//	default String toString(){ return “a”;}
	default void runMe() {
		System.out.println("runme run");
	}
}

interface test2 extends test{
	@Override
	default void runMe() {
		System.out.println("runMe again");
	}
}
