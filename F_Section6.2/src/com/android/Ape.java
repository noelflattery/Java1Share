package com.android;

public class Ape {
	/*
	 * when overriding a method, you can't make it LESS AVAILABLE but you
	 * can make it MORE available
	 */
	public void eat() {
		System.out.println("Ape eating");
	}
	
	protected void drink() {
		System.out.println("Ape drinking");
	}
	
	void breed() {
		System.out.println("Ape breeding");
	}
	/*
	 * can't override this in a derived class as its only available inside the 
	 * Ape class. Can't inherit a private method or variable
	 */
	private void sleep() {
		System.out.println("Ape sleeping");
	}
	
	

}class Human extends Ape{
		/*
		 * this sleep method has NO RELATIONSHIP with the sleep() method in the
		 * Ape class. as the Sleep method in the Ape class is private so the
		 * Human class cannot inherit it
		 */
		//NOT OVERRIDEN
		protected void sleep() {
			System.out.println("Human sleep");
		}
		/*
		 *the first method we are going to override is the eat() method in the
		 *Ape class. 
		 *public void eat()
		 */
		//void eat() {}//this method has default level access NOT ALLOWED
		//protected void eat() {}//this method has protected level access NOT ALLOWED
		//private void eat() {}//this method has private level access NOT ALLOWED
		public void eat() {//this method can only be public
			System.out.println("human eat");
		}
		/*
		 * we have a method in the Ape class void breed(), default level access
		 */
	//	void breed() {}//will work same level access as ape class
	//	protected void breed() {};//will work, it MORE avaliable than ape class
		public void breed() {
			System.out.println("human breeding");
		}//will work, it is MORE available than ape class
	}
