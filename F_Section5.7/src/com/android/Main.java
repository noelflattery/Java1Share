package com.android;
/**
 * Exam Objective 5.5 use break and continue
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		/*
		 * break and continue are primarily use to break out of loops, but
		 * we also use break to break out of switch statements.
		 * break breaks completely out of the loop and there are no more iterations
		 * of the loop
		 * continue break out of the current iteration of the loop and contines with
		 * the next iteration
		 */
		for(int i=0;i<11;i++) {
			System.out.println("i is "+i);
			/*
			 * when i get to 6 it exits the loop completelyu
			 */
			if(i>5) {
				break;
			}
		}//after break control goes to here
		
		for(int i=0;i<12;i++) {
			if(i==3) {
				/*
				 * when i has the value 3 it will not print out "
				 * second loop i is 3" as it breaks out of the current iteration
				 * of the loop, but it will continue on the rest of the loop iterations
				 * it skips the rest of the four iteration of the loop
				 */
	
				continue;
				//this is unreachable code as this can NEVER RUN
			//	System.out.println("hello there");
				
			}
			System.out.println("Second loop i is "+i);
		}
		
		for(int i=1;i<14;i++) {
			/*
			 * if the remainder is 0 the modulus is 0, which means the number
			 * divided by two the remainder is 0. So if a number has a modulus
			 * of 0, it means it's even. if not, the number is odd.
			 */
			if(i%2>0) {
				/*
				 * whenever a number is odd it skips the rest of the current
				 * iteration of the loop, which means it will not print out
				 * the odd numbers
				 */
				continue;
			}
			System.out.println("number is "+i);
		}
		
		//Inners.nested();
		//Inners.breaking();
		Inners.labels();
		
	}

}
