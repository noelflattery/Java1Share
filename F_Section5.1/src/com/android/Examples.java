package com.android;

import java.time.Period;

public class Examples {
	
	static void ex1() {
		
	//	Period agePeriod=Period.of(5, 2, 2);
		int age=5;
		
		if(age>=18) {
			System.out.println("you are an adult");
		}
		else if(age >12) {
			System.out.println("you are a teenager");
		}
		else
			System.out.println("you are a child");
		
		double weight=14.5;
		/*
		 * you can have an if statement all by itself, this will only trigger
		 * if the weight is greater than 20
		 */
		if(weight>20) {
			System.out.println("you are heavy");
		}//if statement finishes here
		/*
		 * you can't have a else by itself or you can't have a else if by itself
		 */
		System.out.println("test prints");
		/*
		 * you can't have any code of any type between an if and an else or
		 * else if
		 * an else has to "belong" to an if, an else if has to "belong" to
		 * an if
		 */
	/*	else {
			
		}
		else if{
			
		}*/
		/*
		 * you can have an else if, without an else
		 */
		if(weight<15) {
			System.out.println("less than 15");
		}
		else if(weight<20){
			System.out.println("less than 20");
		}
		/*
		 * whatever you put in the testing condition of a if or if else statement
		 * it has to evaluate to a true or false (a boolean)
		 */
		weight=45;//assigning a int, 45, to weight
		//this is a boolean, its checking to see if weight is 45
		System.out.println(weight==45);
		//can't do the below as this evaluates to the int 45
		//if(weight=45)
		
		if(weight==45) {
			System.out.println("weight is 45");
		}
		
		Dog spot;//=new Dog();
		spot=null;
		if(spot==null) {
			System.out.println("spot is null");
		}
		
		weight=5;
		if((weight+=10)>20) {
			System.out.println("will print out");
		}
		/*
		 * can check a boolean directly
		 */
		boolean test=true;
		if(test) {
			System.out.println("boolean true");
		}
		//the above is exactly the same as below
		if(test==true) {
			System.out.println("boolean true again");
		}
		
		int num1=10,num2=50;
		if((num1+num2)>50) {
			System.out.println("number greater than 50");
		}
		else {
			System.out.println("number not greater than 50");
		}	
	}//end of ex1
	
	static void ex2() {
		int age=18;
		/*
		 * you can have an if statement all by itself, but as soon as you put
		 * in a else or an else if, the if part HAS TO HAVE A BODY
		 */
/*		if(age>=17) 
		else {
			
		}*/
		age=11;
		//with just an if statemetn with no body, you need semi colon at end
		if((age+=10)>30);
		System.out.println(age);
		/*
		 * you can't put in any code (bar comments) between the body of your
		 * if and the else or else if
		 */
		if(age>20) {}
	//	System.out.println("generates error");
		else {}
		
		/*
		 * you can assign values to a boolean in the testing part of an if
		 * statement
		 */
		boolean test=true;
		int num1=45;
		/*
		 * this is assigning the value of "false" to the boolean test, and then
		 * the if statement reads if(false)
		 */
		if(test=false) {
			System.out.println("this is true");
		}
		else {
			System.out.println("this is false");
		}
		
		
	}//end of ex2
	
	static void ex3() {
		/*
		 * if no curly brackets, the body of your if, else or else if can only
		 * have one line of code
		 */
		String name="lion";
	//	if(name=="lion")
		if(name.equals("lion"))
			System.out.println("feed me meat");
		else if(name.equals("Horse"))
			System.out.println("feed me hay");
		/*
		 * only one line of code permitted in the body of this else if as
		 * we have no curly brackets, so if we have any line of code after this
		 * and before the else, it will generate
		 */
	//	System.out.println("wrong code");
		else
		{
			System.out.println("feed me cabbages");
			System.out.println("I assume this animal is a hippo");
		}
		
		name="ostrich";
		if(name.equals("ostrich"))
			/*
			 * treating this for loop as one line of code.
			 * it will treat any loop, other if statement, switch statement,
			 * etc as one statement
			 */
			for(int i=0;i<4;i++) {
				System.out.println(i);
				System.out.println("print me");
			}
		else//if not an ostrict then this executes
			for(int j=1;j<5;j++)
				System.out.println("second loop "+j);
		/*
		 * you can have as many else if's as you want, but only one else
		 */
				
	}//end of ex3
	
	static void ex4() {
		int score=456;
		//nested if, which is an if inside an if
		if(score<400) {
			if(score>300) {
				System.out.println("less than 400 but greater than 300");
			}
			else {
				System.out.println("less than 400 and less than 300");
			}
		}
		else {
			System.out.println("greater than 400");
		}
		
		if(score<400)//don't need curly brackets as this one line of code
		if(score>300)
		System.out.println("print less "
							+ "than 400 greater "
							+ "than 300");
		else
		System.out.println("less than 400 and "
							+ " less than 300");
		else
		System.out.println("greater than 400");	
	}//end of ex4
	
	static void ex5() {
		/*
		 * Ternary construct, which are simply if else statemtns but using
		 * the question mark symbol
		 */
		int age=18;
		if(age>18) {
			System.out.println("you are over 18");
		}
		else {
			System.out.println("you are under 18");
		}
		/*
		 * a ternary construct has to be assigned to something.
		 * the first part of a ternary construct has to be evaluated to a boolean
		 * (i.e here is age>18)
		 * followed by a question mark ?
		 * folowed by if true part
		 * followed by colons :
		 * followed by if false part.
		 * if boolean is true msg is "you are over 18"
		 * if boolean is false msg is "you are under 18"
		 */
		age=10;
		String msg;
		msg=(age>18)?"you are over 18":"you are under 18";
		System.out.println("message is "+msg);
		
		int bill=1200;
		/*
		 * if bill >2000 discount is 15, otherwise discount is 10
		 */
		int discount=(bill>2000)?15:10;
		/*
		 * if bill >2000, bill is discounted by 200 euros, otherwise discounted
		 * by 300
		 */
		discount=(bill>2000)?200:300;
		System.out.println("bill is "+(bill-discount));
		
		bill=(bill>2000)?bill-200:bill-300;
		System.out.println("bill is "+bill);
		age=15;
		double price=(age>18)?9.5:10.5;
		
		int rNum=(age>18)?returnNum():returnNum2();
	}
	static int returnNum() {
		return 10;
	}
	static int returnNum2() {
		return 12;
	}
	static void returnNothing(){
		
	}
	
	static void ex6() {
		/*
		 * all three parts of a ternary operator are mandatory (they have to
		 * be included
		 * 1:the boolean test
		 * 2: the value returned if true
		 * 3: teh value returned if false
		 */
		int bill=2000;
		int qty=10;
		
		int discount=(++qty>8)?10:20;
		//can't do this as ++qty does not evaluate to a boolean
		//the testing part has to evaluate to a boolean
		//discount=++qty?10:20;
		//can't omit the else part
		//discount=(qty>10)?10;
		/*
		 * this does not work as you have to assign ternary operators to a 
		 * variables
		 */
		//(bill>2000)?15:20;
		/*
		 * this will not work as you can't have code blocks {} in the if
		 * or else part of a ternary operator. the problem is the curly
		 * brackets NOT the parenthesis
		 */
		//discount=(bill>4000)?{bill-150}:(bill+100);
		/*
		 * as far as we can say you can't put in an if statement in the if
		 * and else part of a ternary operator
		 */
	}//end of ex6
	
	static void ex7() {
		int bill=1500;
		int qty=12;
		/*
		 * if the bill is greater than 1000 then we check if quantity is greater
		 * than 11, if quantity greater than 11, discount is 10, otherwise 
		 * discount is 9.
		 * if bill is not greater than 1000, discount is 5
		 */
		int discount=(bill>1000)?
						(qty>11)?10:9:
						5;
		int days=10;
		bill=500;
		qty=10;
		//value of discount is 20
		discount = (bill > 1000)? 
						(qty > 11)? 
								10 : days > 9? 
										20 : 30 : 
						5;
				
	}

}
