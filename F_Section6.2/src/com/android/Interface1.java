package com.android;
/*
 * you can only have one public class per file, so this interface is public
 * top level interfaces only public or package level
 */
public interface Interface1 {
	/*
	 * all methods in an interface are public
	 */
	//private void eat();
	/*protected default void drink() {
		System.out.println("drink me");
	}*/

}
/*
 * whereas this interface is default (PACKAGE) level access 
 * (NOT TO BE CONFUSED WITH
 * THE DEFAULT KEYWORD FOR METHODS IN AN INTERFACE)
 * a top level interface can only be package level access or public
 */
interface Interface2{
	
}
//can't be protected or private
/*
protected Interface3{
	
}*/
/*
private Interface4{
	
}*/
