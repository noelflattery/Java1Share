package com.android;
/**
 * Exam Objective 6.1 create methods with return values,
 * INCLUDING OVERLOADING METHODS
 * Overloaded method is a method that has the same name but a 
 * a different parameter list or different order of parameters
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		Animal andy=new Animal();
		/*
		 * our 4 overloaded eat methods from the Animal class
		 * we don't have acces to the private void eat(boolean myBool)
		 * method, because this is a private method and only available
		 * within the Animal class
		 */
		andy.eat();
		andy.eat(3);
		andy.eat(1.2, "hello");
		andy.eat("hello", 2.3);
	
		
		Dog spot=new Dog();
		/*
		 * no drink method in the Dog class, so it takes it's 
		 * drink method from the Animal class
		 */
		spot.drink();
		/*
		 * println() is an overloaded method that can any data
		 * type and any object
		 */
		System.out.println(andy);
		System.out.println("hello");
		System.out.println(23);
		System.out.println(true);
		
		double dnum=2;
		int num=4;
		
		Phone samsung=new Phone();
		
		samsung.call(dnum, num);
		samsung.call(num, dnum);
		
		samsung.dial(num);
		samsung.dial(3);
		/*
		 * this will nto work, at it can't determine which call
		 * method to use as one taeks a double and a int, the
		 * other takes a int and a double and 2 and 3 could be passed
		 * to either call method in the Phone class
		 */
		//samsung.call(2, 3);
		Tablet myTablet=new Tablet();
		Message myMessage=new Message();
		/*
		 * these are five overloaded read methods, that take
		 * five different objects that can read messages.
		 * so this would be considered a real world programming
		 * example where we are trying to do the same task across
		 * multiple platfroms (i.e) an app that is avaiable across
		 * all platfroms, for instance facebook available for mobiles,
		 * pc, tablets and certain games consoles, smart tvs
		 */
		myMessage.read(myTablet);
		myMessage.read(samsung);
		
		myMessage.read(new Pc());
		
		myMessage.read(new GameConsole());
		myMessage.read(new Appliances());
		
		
		
	}

}
