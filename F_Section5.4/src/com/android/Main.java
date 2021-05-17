package com.android;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Main {
/**
 * exam objective 5.2 create and use enhanced for loops
 * @param args
 */
	public static void main(String[] args) {
		ArrayList<String>strList=new ArrayList<>();
		strList.add("Mary");
		strList.add("patsy");
		strList.add("harry");
		strList.add("bridie");
		/*
		 * an enhanced for loop always consists of a list of items and 
		 * a variable we use to iterate through the list (in our case the
		 * list will always be a arraylist or array). The variable HAS
		 * TO BE the same type as the elements in the list. 
		 * In this case we have a arraylist of strings so we a variable of
		 * type String to iterate through the list
		 */
		//System.out.println(strList);
		for(String name:strList) {
			System.out.println("strlist name is "+name);
		}
		
		String[]nameArray= {"mary","patsy","harry","bridie"};
		for(String name:nameArray) {
			System.out.println("nameArray is "+name);
		}
		
		int[]numArray= {34,56,99,67,12};
		for(int num:numArray) {
			System.out.println("numArray is "+num);
		}
		/*
		 * an enhanced for loop in java is also sometimes called a for
		 * each loop
		 */
		StringBuilder[]sbArray= {new StringBuilder("tom"),
				new StringBuilder("george"),new StringBuilder("yvonne")};
		
		for(StringBuilder sb:sbArray) {
			System.out.println("sbArray is "+sb);
			sb=new StringBuilder("harry");
		}
		
		for(StringBuilder sb:sbArray) {
			System.out.println("sbArray not changed is "+sb);
		}
		/*
		 * you can't use an enhanced for loop to directly change variables
		 * in a array or arraylist
		 */
		for(int num:numArray) {
			System.out.println("number is "+num);
			num=77;
		}
		
		for(int num:numArray) {
			/*
			 * if you print out this, it is NOT one of the elements of the
			 * array. it is just the variable num which now has the value
			 * of 23. the only relationship this number has with the array
			 * is that we have 5 numbers, so it will print 23 out, five
			 * times
			 */
			num=23;
			System.out.println("number is second time "+num);
		}
		/*
		 * similar to primitive data types you can't change in a enhanced
		 * for loop what each element in an array of objects refers too
		 * i.e a array of dogs, the second is spot, you can't change in
		 * the enhanced loop that this dog will always be spot.
		 * however you can can change the atributes of an object in a 
		 * enhanced for loop (i.e same dog spot, you can change his 
		 * weight, colours, sex, age, etc..you can change his atributes
		 * - instance variables
		 */
		for(StringBuilder sb:sbArray) {
			System.out.println("sb before change "+sb);
		}
		
		for(StringBuilder sb:sbArray) {
			sb.append(" lally");
		}
		
		for(StringBuilder sb:sbArray) {
			System.out.println("sb changed is "+sb);
		}
		
		/*
		 * can't use an enhanced for loop to initialise an array and 
		 * modify it's elements. for this you use a for loop instead
		 * can't be used to delete or remove elements from an arrayList.
		 * can't be used to iterate over multiple lists in the same 
		 * loop
		 */
		Soilder s1=new Soilder();
		Soilder s2=new Soilder();
		Soilder s3=new Soilder();
		Soilder s4=new Soilder();
		
		Soilder[]army= {s1,s2,s3,s4};
		
		for(Soilder s:army) {
			s.fight();
		}
		
		int[]myArray=new int[5];
		/*
		 * every number in our array is going to be 2, 
		 * going to have 5 "2"
		 * can't initialise values in an array with an enhanced for loop
		 */
		for(int i=0;i<myArray.length;i++) {
			myArray[i]=2;
		}
		/*
		 * you can remove items from a arraylist in a for loop, but
		 * not in an enhanced for loop
		 */
		for(int i=0;i<strList.size();i++) {
			if(i%2==0) {
				strList.remove(i);
			}
		}
		
		System.out.println(strList);
		
		int[]numArray2= {2,45,67,99};
		int[]numArray3= {345,678,990,2,88};
		/*
		 * with an enhanced for loop you can only iterate through one
		 * array, with a for loop you can iterate through as many loops
		 * as you want
		 */
		for(int i=0;i<numArray2.length;i++) {
			System.out.println("numarray2 is "+numArray2[i]);
			System.out.println("numArray3 is "+numArray3[i]);
		}
		
		String[]name1={"harry","mary","laura"};
		String[]name2={"Laura","sally","shelly"};
		String[]name3={"colm","jack","michael"};
		/*
		 * nested enhanced for loop
		 * this is an array of an array of strings. this means we have to
		 * use an array of strings (nameArr) to  iterate thorugh the
		 * 2d array of strings
		 */
		String[][]name2DList={name1,name2,name3};
		
		for(String[]nameArr:name2DList) {
			
			for(String name:nameArr) {
				System.out.println("inside 2d "+name);
			}
		}
		
		
		}
		

	}


