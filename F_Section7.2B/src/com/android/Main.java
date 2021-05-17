package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTime runner=new RunTime();
		//runner.runTime1();
		try {
			runner.runTime1();
		}
		catch(Exception e) {
			System.out.println("runtime1 is "+e);
		}
		/*
		 * the exception is dealt with in the try/catch block in the runTime2()
		 * method
		 */
		runner.runTime2();

	}

}
