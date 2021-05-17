package com.android;

import java.util.concurrent.SynchronousQueue;

/*
 * an interface is a purely abstract class
 * for now we shall say it's just a list of abstract methods
 */

public interface Behaviour {
	/*
	 * a class IMPLEMENTS a interface, the class that implements the interface
	 * has to OVERRIDE all of the methods of the interface. All methods in
	 * an interface are PUBLIC and abstract by default, so they have
	 * no body
	 */
	void jealous();//no body
	int anger(double dnum,char myChar);//no body
	/*
	 * both void jealous() and void anger(double dnum, char myChar)
	 * are implicitly public and abstract
	 */
	public abstract void joy();
	void euphoria();
	/*
	 * with Java 8 we have default implementation of a method. this means
	 * that any class that implments the Behaviour interface now has a method
	 * called void nervous(). the implementing class CAN CHOOSE WHETHER to 
	 * override this method or not, if it does not override this method then
	 * it will just take the below implmentation and print out "I am nervous
	 */
	default void nervous() {
		System.out.println("I am nervous");
	}
	/*
	 * Java 8 also introduced static methods in a interface, you CAN'T OVERRIDE a static method, 
	 * in the implementing class its a different method
	 * This method can be called directly by the command
	 * Behaviour.statMethod();
	 */
	static void statMethod() {
		System.out.println("statMethod in the Behaviour");
	}
	/*
	 * if an abstract class implements a Interface, that abstract class DOES NOT HAVE TO 
	 * override the abstract methods in the interface. 
	 */


}
