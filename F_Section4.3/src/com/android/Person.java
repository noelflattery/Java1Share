package com.android;

public class Person implements Behaviour{
/*
 * this class implements the Behaviour interface, which has three
 * abstract methods mad(), happy() and sad(). this means that
 * the Person class HAS TO PROVIDE IMPLEMENTATION FOR each of these
 * three methods. the class has to have a mad(), happ() and sad()
 * method
 * this class also has two of its own methods, which are eat()
 * and drink(), which have no relationship with the interface
 * Behaviour or the eat() and drink() methods in the Animal class
 * (non-Javadoc)
 * @see com.android.Behaviour#mad()
 */
	@Override
	public void mad() {
		System.out.println("person mad");
		
	}

	@Override
	public void happy() {
		System.out.println("person happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Person sad");
		
	}
	
	void eat() {
		System.out.println("person eat");
	}
	
	void drink() {
		System.out.println("person drink");
	}
	

}
