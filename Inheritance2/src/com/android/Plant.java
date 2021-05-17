package com.android;

public abstract class Plant {
	/*
	 * an abstract call does not HAVE TO have any abstract, it can have all
	 * concrete methods
	 */
	void grow() {
		System.out.println("plant growing");
	}
	
	void reproduce() {
		System.out.println("plant reproducing");
	}
	//a static method in a abstract class
	static void pollinate() {
		System.out.println("plant pollinating");
	}

}
/*
 * inherits everything from the Plant class
 */
class Flower extends Plant{
	
}
/*
 * an abstract class can extend a concrete class
 */
abstract class Rose extends Flower{
	
}

class PinkRose extends Rose{
	
}
