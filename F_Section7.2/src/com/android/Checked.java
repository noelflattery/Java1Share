package com.android;

import java.io.FileInputStream;

public class Checked {
	/*
	 * we deal with the checked exception inside the method with a try/catch block
	 */
	void checked1(){
		try {
			FileInputStream fis=new FileInputStream
					("myfile.txt");
		}
		/*
		 * this can catch all exceptions, both checked and runtime
		 * because Exception is super class of all Exception classes
		 */
		catch(Exception e) {
			System.out.println("no file");
			System.out.println("exception "+e+" caught");
		}
	}
	/*
	 * we are telling the compiler that if an Exception is generated, we are NOT
	 * dealing with it inside this method, but whatever is calling this method
	 * has to deal with it. so when we call this method we can put it in a 
	 * try/catch block
	 */
	void checked2()throws Exception {
		FileInputStream fis=new FileInputStream
				("myfile.txt");
	}
	
	void checked3()throws Exception{
		checked4();
		
	}
	
	void checked4()throws Exception{
		FileInputStream fis=new FileInputStream
				("myfile.txt");
	}

}
