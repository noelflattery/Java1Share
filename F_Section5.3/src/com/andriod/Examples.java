package com.andriod;
/**
 * exam object 5.2 create and use for loops including enhanced for loops
 * @author noelf
 *
 */
public class Examples {
	
	static void ex1() {
		/*
		 * a for loop consists of three distinct parts
		 * Initialisation statements
		 * Termination condition
		 * Update clauses
		 */
		/*
		 * i=0 initialisation statement
		 * i<5 termination condition, as soon as not true, loop terminates
		 * i++ update clause
		 */
		for(int i=0;i<5;i++) {
			System.out.println("i is "+i);
		}
		/*
		 * you can have as many initialisation statements as you want,
		 * but they must be all the same data type
		 * in this example we are initialising three variables i,j,m of
		 * type int
		 * you can have as many update clauses as you want, you can have
		 * only ONE TERMINATION condition
		 */
		for(int i=0,j=1,m=2; i<4;i++) {
			System.out.println("i is "+i);
	//	System.out.println("j is "+j);
	//		System.out.println("m is "+m);
		}
		/*
		 * i=4;
		j=5;
		m=6;
		are available only inside the loop, i, j and m are local to the loop
		and can only be accessed inside the loop
		 */
		int k=9;
		/*
		 * you can use existing variables that were declared outside the
		 * loop
		 * semi colons are what seperate our initialisation statemennt
		 * and our termination statement. So you ONLY HAVE TWO seim colons
		 */
		for(k=0; k<3; k++) {
			System.out.println("k is "+k);
		}
		/*
		 * int i=0,j=1 is right as you can have multiple initilisation 
		 * statements
		 * i<4,j<5 is INCORRECT as you can only have ONE TERMINATION 
		 * CLAUSE, so you need to remove either i<4 or j<5
		 * i++ and j++ is correct as you can have multiple update clauses
		 */
	/*	for(int i=0,j=1; j<5,i++; i++,j++) {
			
		}*/
		/*
		 * you can have as many update clauses as you want. these are
		 * executed AFTER THE CODE in the body
		 */
		for(int i=0,j=10; i<5; i++,j--) {
			System.out.println("i is "+i);
			System.out.println("j is "+j);
		}
		int num=0;
		for(int i=0; i<4; i++,printMe()) {
			System.out.println("inside i is "+i);
		//	printMe();
			num=i;
		}
		System.out.println("num i is "+num);
		/*
		 * this is the simpliest form of for loop
		 * you are entering this loop with no conditions, so there is
		 * no way to exit
		 */
	//	for(;;) {
		//	System.out.println("nothing here");
	//	}
		
		int b=0;
		int top=34;
		/*
		 * we don't need any initialisation part as b already exists and
		 * has a value of 0
		 */
		for(; b<10; b++) {
			//inside the loop, the last value for b is 9
			System.out.println("b is "+b);
		}
		//b outside loop is 10
		System.out.println("b outside loop is "+b);
			
	}
	
	static void printMe() {
		System.out.println("I am printed");
	}
	
	static void ex2() {
		for(int i=0;i<3;i++) {//rows
			for(int j=0;j<4;j++) {//columns
				System.out.println("i is "+i+" j is "+j);
			}
		}
	}
	
	static void ex3() {
		String[]names= {"harry","george","mary"};
		String[]names2= {"laura","michelle","colm"};
		String[]names3= {"patsy","jack","mick"};
		
		//two dimensional array of strings
		String[][]name2DList= {names,names2,names3};
		/*
		 * this will loop for the amount of string arrays we have in out
		 * 2 dimensional string array. there are three arrays in our
		 * 2 dimensional array. so the outer loop will execute 3 times
		 * name2DList[3][3]
		 */
		//this will loop for the amount of arrays we have in our 
		//2 d array, we have three arrays, so this will loop
		//3 times
		for(int i=0;i<name2DList.length;i++) {
			/*
			 * the inner loop will also loop three times, as each array
			 * as three names in it, and will print them out
			 * name2DList[0].length
			 * name2DList[1].length
			 * name2DList[2].length
			 */
			System.out.println("row "+i);
			for(int j=0;j<name2DList[i].length;j++) {
				System.out.println(name2DList[i][j]);
			}
		}
	}

}
