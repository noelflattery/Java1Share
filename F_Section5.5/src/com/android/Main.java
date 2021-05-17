package com.android;
/**
 * Exam objective 5.1
 * create and use while loops
 * create and use do while
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		//while loops
		int age=12;
		//this has to be true to continue, false to exit
		while(age<18) {
			/*
			 * be careful where you put your incrementer in a while loop
			 * this will print out ages 13 to 18
			 */
			age++;
			/*
			 * a while loop, like every other loop, if given no exit 
			 * condition, will be infinite
			 */
			System.out.println("your age is "+age);
			/*
			 * usually have an incrementer or some condition that will
			 * result in an exit
			 */
			//this will print ages 12 to 17, and will be 18 when outside loop
		//	age++;
			
			
		}
		/*
		 * the while always evaluates to true or false
		 * if there more than 4 buns (5) bunsAvailable will be set to 
		 * false, and loop will exit when it goes 
		 * while(bunsAvailalbe)
		 */
		int count=0;
		boolean bunsAvailable=true;
			while(bunsAvailable) {
				if(count>4) {
					bunsAvailable=false;
				}
				else
					System.out.println("nice buns");
				count++;
				
			}
			count=0;
			bunsAvailable=false;
			/*
			 * while this is false
			 * while this is NOT TRUE
			 */
			while(!bunsAvailable) {
				if(count>4) {
					bunsAvailable=true;
				}
				else
					System.out.println("no buns at all");
				count++;	
			}
			
			int num=14;
			/*
			 * this loop will not execute as num is never less than
			 * 12
			 */
			for(;num<12;num++) {
				System.out.println("print something");
			}
			/*
			 * this loop will not execute either as num is greater than
			 * 12
			 */
			while(num<12) {
				System.out.println("won't print");
			}
			/*
			 * Do while loop always executes at least once
			 */
			age=15;
			do {
				System.out.println("you are over 18");
				System.out.println("you age is "+age);
				age++;	
			}while(age>18);

	}

}
