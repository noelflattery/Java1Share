package com.android;

public class Main {
	public static void main(String[]args)throws Exception {
		Animal andy=new Animal();
		andy.returns();
		
		System.out.println("number is "+andy.returnInt());
		
		System.out.println("number is "+andy.returnFinally());
		
		Dog spot=new Dog();
		Dog rex=spot;
		System.out.println("before method call");
		System.out.println("age of spot is "+spot.age);
		System.out.println(rex==spot);
		andy.returnDog(spot);
		System.out.println("after method call");
		System.out.println(rex==spot);
		System.out.println("new age of dog is "+spot.age);
		
		try {
			/*
			 * this generates a checked exception that is not dealt with in the onlyFinally
			 * method, but is thrown out, and is dealt with here in the try/catch block
			 */
			andy.onlyFinally();
		}
		catch(Exception e) {
			System.out.println("onlyFinally exception dealt with in main");
			System.out.println(e);
		}
		/*
		 * this will compile, as there is a "throws" clause in the main method, but it will
		 * crash the program
		 */
	//	andy.onlyFinally();
	}

}
