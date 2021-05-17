package com.android;

public class RunTime {
	
	void runTime1() {
		/*
		 * this will generate ArrayIndexOutOfBoundsException which is a 
		 * RuntimeException, so we DO NOT have to deal with it and compiler
		 * does not pick up, however if we leave as is and call this method it 
		 * will crash our program
		 */
		int[]numList= {45,78,99};
		System.out.println(numList[5]);
	}
	
	void runTime2() {
		try {
			int[]numList= {45,78,99};
			System.out.println(numList[5]);
		}
		catch(Exception e) {
			System.out.println("inside runTime2");
			System.out.println("exception is "+e);
		}
	}
	/*
	 * the throws RunTimeException is optional. if its a CHECKED exception then
	 * you would HAVE TO PUT IN A THROWS in order for it to compiler or a try/
	 * catch block
	 */
	void runTime3()throws RuntimeException{
		int[]numList= {45,78,99};
		System.out.println(numList[5]);
	}

}
