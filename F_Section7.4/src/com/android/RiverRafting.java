package com.android;

public class RiverRafting {
	/*
	 * if the degree the boat is eleavated at is greater than 10, then throw
	 * a new FallInRiverException, which means you have fallen into the water and
	 * the message tells you to get out of the water.
	 * otherwise you are in the boat
	 */
	void crossRapid(int degree)throws FallInRiverException{
		System.out.println("cross rapid");
		if(degree>10)
			throw new FallInRiverException();
		else
			System.out.println("your are still in the boat");
	}
	/*
	 * if the person is nervous, he will drop the oar, if not he will still have
	 * the oar in his hand
	 */
	void row(String state)throws DropOarException{
		System.out.println("row raft");
		if(state.equalsIgnoreCase("nervous"))
			throw new DropOarException();
		else
			System.out.println("you have the oar in your hand");
		
	}

}
