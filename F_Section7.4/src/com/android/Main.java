package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception myException = new Exception();
		try {
			throw new FallInRiverException();
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
			
		}
		//created our RiverRafting object
		RiverRafting raft=new RiverRafting();
		/*
		 * this needs to be in a try catch block as the method crossRapid throws a
		 * FallInRiverException which extends Exception, which means it's a checked 
		 * Exception
		 */
		System.out.println("going white water rafting");
		try {
			raft.crossRapid(12);
		}
		catch(Exception e) {
			System.out.println(e);
		//	e.printStackTrace();
			
		}
		System.out.println("rowing our raft");
		try {
			raft.row("nervous");
		}
		catch(Exception e) {
			System.out.println("exception drop oar is "+e);
		}
		
		System.out.println("using both custom exception classes");
		try {
			/*
			 * if either method generates an exception then the try block will
			 * exit at that point and the rest of the try block will not execute.
			 * so raft.crossRapid(12) produces a checked exception, so the rest
			 * of the try block does not execute
			 */
			raft.crossRapid(12);//generates a throws FallInRiverException
			raft.row("happy");//generates a throws DropOarException
			/*
			 * this code will only be run if row() or crossRapid() produce no
			 * checked exceptions
			 */
			System.out.println("Enjoy river rafting");
		}
		/*
		 * this executes if crossRapid() produces a FallinRiverException
		 */
		catch(FallInRiverException f) {
			System.out.println(f);
			f.printStackTrace();
			System.out.println("get back in the raft");
		}
		/*
		 * this executes if raft.row() produces a DropOarException
		 */
		catch(DropOarException d) {
			System.out.println(d);
			System.out.println("do not panic");
		}
		/*
		 * this will always execute regardless of whether any exceptions are 
		 * produced, finally always runs
		 */
		finally {
			System.out.println("hope you had a nice day rafting");
		}
		/*
		 * this is not part of the try/catch finally structure so this will always
		 * run
		 */
		System.out.println("go home after rafting ");
		

	}

}
