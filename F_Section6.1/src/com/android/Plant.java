package com.android;
/*
 * can't create an instance of an abstract class, so you can't create a plant, flower,
 * rose as these are all abstract classes. you can create a EnglishRose as this is
 * a concrete class
 */
public abstract class Plant {
	int height;
	String name;
	/*
	 * an abstract class does not have to have any abstract methods, but as soon
	 * as you have an abstract method in a class the whole class becomes abstract.
	 * an abstract method can ONLY EXIST in an abstract class
	 */
	void  grow() {
		System.out.println("plant growing");
	}
	
	void shed() {
		System.out.println("plants shed seeds");
	}

}

abstract class Flower extends Plant{
	//all other classes inherit this method
	abstract void pollinate();
}

abstract class Rose extends Flower{
	abstract void sniff();
}

class EnglishRose extends Rose{
/*
 * a concrete class that extends an abstract class has to implement any abstract
 * method in that abstract class in our case, the pollinate method in the flower
 * class and the sniff method in the rose class
 */
	@Override
	void pollinate() {
		System.out.println("english rose pollinate");
		
	}

@Override
void sniff() {
	System.out.println("english rose sniff");
	
}

void stiffUpperLip() {
	System.out.println("i say old chap a rose");
}
	
}
