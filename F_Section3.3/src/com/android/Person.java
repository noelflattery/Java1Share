package com.android;

public class Person {
	int age;
	String name;
	/*
	 * variable arguments
	 * the ... means we can pass it as many int variables as we
	 * like
	 * ... puts all the values passed to the method into an 
	 * array. So in this method days is an array
	 * so you can pass in no ints, one int, multiple int and
	 * and an array of ints
	 */
	/*
	 * void daysWorked(int days, String name)
	 */
	int daysWorked(int...days) {
		int count=0;
		System.out.println("daysworked");
		for(int i=0;i<days.length;i++) {
			System.out.println("number is "+days[i]);
			count++;
		}
		return count;
	}
	/*
	 * returning an array of ints, the return type will consist
	 * of the type (int) followed by square brackets[]
	 */
	int[]holiday(int num){
		int[]myArray= {45,67};
		
		return myArray;
	}
	/*
	 * variable length arguments have to the last arguement
	 * this is correct
	 */
	void correctCall(String type,int...num) {
		
	}
	//this is not the last argument so will not work
/*	void incorrectCall(int...num,String name) {
		
	}*/
	/*
	 * you can only have ONE variable lenght argument, and it
	 * HAS TO BE the last argument in your method
	 */
/*	void incorrectCall(int...num,boolean...myBool) {
		
	}*/
	/*
	 * you can pass in as many array of many types as you like
	 */
	void sendArray(int[]intArray,double[]doubleArray,
			Employee[]empArray,int[]intArray2) {
		
	}
	/*
	 * you can pass in a single variable and then a variable lenght
	 * argument of the same type, in this case, int.
	 * so if we pass in three numbers, for example
	 * 1,4,5
	 * 1 become int num
	 * 4,5 become the array nums
	 */
	void passIntVar(int num,int...nums) {
		System.out.println("num is "+num);
		for(int i=0;i<nums.length;i++) {
			System.out.println("nums is "+nums[i]);
		}
	}
	//can pass in variable lenght list of employees
	void myEmployees(Employee...empList) {
		
	}
	
	
	

}
