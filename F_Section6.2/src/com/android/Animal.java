package com.android;

public abstract class Animal {
	
	void breed() {
		System.out.println("Animal breeding");
	}
	
	void eat() {
		System.out.println("Animal eating");
	}
	
	abstract void drink();

}
/*
 * this class has to override the sad(), the happy() and the drink() method
 * as these are abstract methods in the Behaviour interface. Dog also has
 * the default mad() method in the interface, it can choose to override this
 * method BUT IT DOES NOT HAVE TOO
 */
class Dog extends Animal implements Behaviour{
	int age=45;

	@Override
	public void sad() {
		System.out.println("dog sad");
		
	}

	@Override
	public void happy() {
		System.out.println("dog happy");
		
	}

	@Override
	void drink() {
		System.out.println("dog drinking");
		
	}
	/*
	 * this is the Dog classes own method, pant(). this method is only available
	 * to Dogs and all sub classes of Dog
	 */
	void pant() {
		System.out.println("dog panting");
	}
	
}

class Cat extends Animal implements Behaviour{

	@Override
	public void sad() {
		System.out.println("Cat sad");
		
	}

	@Override
	public void happy() {
		System.out.println("Cat happy");
		
	}

	@Override
	void drink() {
		System.out.println("Cat drinking");
		
	}
	/*
	 * can't be default level access as the mad() method in the interface is 
	 * public, so a overriding method can't be any LESS acessible.
	 * also we do not HAVE TO override a default method, but in this case we 
	 * choose to override the mad method
	 */
	@Override
	public void mad() {
		System.out.println("Cat mad");
	}
	
}
