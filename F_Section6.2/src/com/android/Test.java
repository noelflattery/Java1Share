package com.android;



public class Test implements InterfaceTypes{
	
	/*
	 * we have a static method in the InterfaceType interface call 
	 * statMethod()
	 * this static method is a totally different method that the static
	 * method in the InterfaceType interface
	 */
	//@Override
	static void statMethod() {
		System.out.println("statMethod in test class");
	}

	@Override
	public void takeApe(Ape magilla) {
		System.out.println("takeApe method");
		
	}
/*
 * this method can take an Ape or a subclass of Ape which is a Human
 * this method can take a human or an ape.
 * this method returns a Ape, so it can return a ape or a subclass of ape
 * whihc is a a Human. this method can return a human or a Ape, here
 * we choose to return a human
 */
	@Override
	public Ape returnApe(Ape magilla) {
		System.out.println("returnApe method called");
		Human hanna=new Human();
		return hanna;
	}
	/*
	 * this method can't take an Ape, this method CAN ONLY take a human or
	 * a sub class of Human
	 */
	Human returnHuman(Human myHuman) {
		return new Human();
	}

}
