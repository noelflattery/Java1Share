package com.android;

public class Main {
/*
 * this will allow your code to compile when we create a Ferrari, the Ferrari constructors
 * has a "throws Exception" clause in its signature, so when creating a ferrari it
 * either has to be in try catch block or you have to have a "throws Exception" in the
 * main method signature. bare in mind that if an actualy exception is generated in any of
 * these methods, the code will compile, but crash the program.
 */
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Vehicle myVehicle = new Vehicle();
		Car myCar=new Car();
		
		Ferrari myFerrari=new Ferrari();
		
		Maternity mary=new Maternity();
		
		Collie myCollie=new Collie();
	}

}
