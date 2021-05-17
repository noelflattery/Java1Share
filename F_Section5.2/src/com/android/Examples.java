package com.android;
/*
 * Exam objective 3.4 use a switch statement
 */
public class Examples {
	static void ex1() {
		int marks=10;
		/*
		 * in the switch part of a the statement you can only use the following
		 * data types. char, byte, short,int, String,Integer,Short, Byte,
		 * Character, enum
		 */
		
		switch(marks) {
		case 10:System.out.println("mark is 10");
		/*
		 * after each case we usually have a break statement, this breaks out
		 * of the swithc statement when it finds a match, in this case when
		 * marks==10. it first prints out "mark is 10" then exits the switch
		 * statement.
		 * the keyword "case" has to be followed by a colon, each case statement
		 * can have as many lines of code as you like (no need for bracketing)
		 */
		break;
		case 20:
			System.out.println("mark is 20");
			System.out.println("more lines of code for mark 20");
			break;
		case 30:
			System.out.println("mark is 30");
			break;
		default:
			System.out.println("invalid number");
			break;
		}
		
		String days="SAT";
		//using a string
		switch(days) {
		case "SAT":
			System.out.println("today is saturday");
			System.out.println("ah can stay in bed");
			break;
		case "SUN":
			System.out.println("today is sunday");
			break;
		case "MON":
			System.out.println("today is Monday");
			break;
		default:
			System.out.println("some other day");
			break;
			
		
		}
	}
	
	static void ex2() {
		int marks=10;
		/*
		 * if you have a swtich statement without any breaks, the swtich statement
		 * will continue until it finds a break. so if marks are 10, it will
		 * continue on to case20, case 30, and default as there are no breaks after
		 * any case statement. similairly if marks is 20, it will hit case 20 and
		 * everything after that
		 */
		switch(marks) {
		case 10:System.out.println("mark is 10");
		case 20:
			System.out.println("mark is 20");
			System.out.println("more lines of code for mark 20");
		case 30:
			System.out.println("mark is 30");
		default:
			System.out.println("invalid number");	
		}
		
		System.out.println("another switch statement with some breaks");
		String days="SAT";
		switch(days){
		case "SAT":	
		case "SUN":
			System.out.println("The Weekend");
			break;
		case "MON":
			System.out.println("MON");
		case "TUE":
			System.out.println("TUE");
		case "WED":
		case "THUR":
			System.out.println("THUR");
		case "FRI":
			System.out.println("working days");
			break;		
		default:
			System.out.println("invalid date");
			break;	
		}
		
	}
	
	static void ex3() {
		/*
		 * you can put expression in the switch part of the switch statement
		 */
		int score=10,num=10;
		switch(score+num) {
		case 10:
			System.out.println("number is 10");
			break;
		case 30:
			System.out.println("number is 30");
			break;
			/*
			 * default has to come at the end, but it is not compulsory
			 */
		default:
			System.out.println("number unknown");
			break;
		}
		//allowed
		switch(score++) {
		
		}
		
		boolean myBool=true;
		/*
		 * can't have a boolean in a switch statement as this would only
		 * give you two options
		 */
	/*	switch(myBool) {
		
		}*/
		
		double dnum=2.1;
		/*
		 * can't have a double as there is an infinite amount of numbers 
		 * between any two whole numbers i.e between 1 and 2
		 */
	/*	switch(dnum) {
		
		}*/
		
		Dog spot=new Dog();
		/*
		switch(spot) {
		
		}*/
		/*
		 * can't use null values
		 */
		String name=null;
		/*
		 * this will generate a NullPointerException
		 */
/*		switch(name) {
		
		}*/
		
		int age=3,age2=40;
		switch(age) {
		case 12:
			age+=10;
			age2+=50;
			System.out.println("age is "+age);
			System.out.println("age is "+age2);
		case 14:
			System.out.println("age in case 14 "+age);
			System.out.println("age2 in case 14 "+age2);
			/*
			 * can't use the below as a case statement has to evaluate to a
			 * definate value and age and age2 can be changed in other 
			 * case statements, so we can't say what the definate value is.
			 * you can't use variables in a case statement as variables 
			 * can change
			 */
		/*case(age2):
			System.out.println("age is whatever");*/
/*		case(age2+age){
			System.out.println("age and more");
		}*/
			
	/*		 * so the logical outcome of this is that you also can't check
			 * for a range of values (i.e if age>18)
			 */
	/*	case age>18:
			System.out.println("more rubbish");
		}*/
		}
		/*
		 * final variables when given value CANNOT CHANGE
		 */
		final int fNum=12;
		final int fNum2=30;
		final byte bNum=3;
		/*
		 * this is declaring and giving a value to a final variable over
		 * two lines instead of one
		 * can't use a final variable that is declared and initialised
		 * over two lines
		 */
		final int finalNum;
		finalNum=45;
		switch(age) {
		case fNum://this is 12 and can't change
			System.out.println("you are 12");
			break;
		case fNum2://this is 30 and can't change
			System.out.println("you are 30");
			break;
	/*	case finalNum:
			break;
			*/
		case bNum://this is a byte, the other data types were ints
			System.out.println("this is a byte number 3");
			break;
			/*
			 * can't have a case null, jsut does not work
			 */
/*		case null:
			break;*/
			
		}
	//	finalNum=45;

}
}
