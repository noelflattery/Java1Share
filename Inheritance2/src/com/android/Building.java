package com.android;
/*
 * an abstract class means you can't create an abstract object. so you can't
 * use the new keyword to create a Building object
 */
public abstract class Building {
	/*
	 * an abstract method consists of the keyword "abstract" before the return
	 * type of the method and it has NO BODY {no curly brackets}
	 */
	abstract void heating();
	
	Building(){
		System.out.println("building constructor called");
	}
	
	void ventillation() {
		System.out.println("ventillate our building");
	}

}
/*
 * an abstract class can extend an abstract class. a abstract that extends an
 * abstract class does not have to implement the abstract methods it inherits.
 * i.e there is a abstract method heating() in the Building class. if this
 * was a concrete it would have to implement the heating method. as this is a
 * abstract it does not have to override, but it can
 */
abstract class House extends Building{
/*	@Override
	void heating() {
		System.out.println("house heating");
	}*/
	abstract void light();	
	House(){
		System.out.println("house constructor called");
	}
}
/*
 * when a concrete class inherits from a abstract class, the concrete has to
 * implement/override all of the abstract methods that it inherits
 * 
 */
class Bungalow extends House{
	
	Bungalow(){
		System.out.println("Bungalow constructor called");
	}
/*
 * this is a abstract method inherited from the House class
 */
	@Override
	void light() {
		System.out.println("bungalow light");
		
	}
/*
 * this is a abstract method inherited from the Building class
 */
	@Override
	void heating() {
		System.out.println("bungalow");
		
	}
	
}
