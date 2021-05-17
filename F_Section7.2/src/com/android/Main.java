package com.android;

public class Main {
/*
 * you have to deal wtih an exception in one of two ways
 * either a try/catch block or have a "throws" statement in your method
 * signature. ultimately you have to have a try/catch somewhere dealing with
 * the exception, if you don't, it eventually finds it's way back to your compiler
 * and crashes the program
 */
	public static void main(String[] args)/*throws Exception*/{
		Checked checker=new Checked();
		/*
		 * the checked exception generated within checked1 is dealt with the try
		 * catch block inside the checked1 method
		 */
		checker.checked1();
		try {
			checker.checked2();
		}
		catch(Exception e) {
			System.out.println("exception from checked2 dealt with in main");
			System.out.println("exception is "+e);
		}
		/*
		 * this will compile if the main method throws the exception back to the
		 * compiler to deal with it, however it will crash as the compiler
		 * ultimately does not know how to deal with exceptions
		 * uncomment "throws exception " in man method signature to compile this
		 * code
		 */
		//checker.checked3();

	}

}
