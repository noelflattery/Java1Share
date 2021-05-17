package com.android;
/*
 * multiple inheritance is NOT ALLOWED in java, however a class can implment as
 * many interfaces as you want. here Duck implements the two interfaces Fly and
 * Swim
 */
public class Duck implements Fly,Swim{

	@Override
	public void calcSwimSpeed() {
		System.out.println("duck speed swimming");
		
	}

	@Override
	public void calcFlightSpeed() {
		System.out.println("duck speed flying");
		
	}

}
