package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Rethrow.rethrow1();
		}
		catch(Exception e) {
			System.out.println("exception caught in main is "+e);
		}
		/*
		 * this procudes an ArrayIndexOutOfBoundsException so will compile but crash the
		 * program
		 */
		//Rethrow.rethrow2();
		
		Nested.nested1();
		Nested.nested2();
	
	}

}
