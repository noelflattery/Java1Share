/*
 * package statement always is the first thing in every file
 * you create in java, nothing can come before it and any class can
 * only be a member of one package
 * can only have one package statement per file
 */
package com.android;
/*
 * this generates an error as you can only have on package 
 * statement per file
 */
//package com.animal;
/**
 * Exam Objective 1.2 Define the Structure of a Java 
 * Class
 * we start in the Person class
 * @author noelf
 *
 */
import com.animal.mammal.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub#
		Monkey magilla=new Monkey();
		
		magilla.sad();
		magilla.happy();
		magilla.angry();
		
		Horse ed=new Horse();
		ed.sad();
		ed.happy();
		ed.angry();
		
		String myStr="/* hello there */ nice to meet you";
		System.out.println(myStr);
		

	}

}
