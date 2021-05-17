package com.android;
/**
 * Exam objective 6.6 Determine the effect upon object 
 * references and primitive values when they are passed
 * into methods that change the values
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * if you pass a primitive variable to a method this method
		 * and then changes the value of the primitive, it still
		 * has the same original value from where it was called.
		 * in this case num will still be 10 after the method
		 * call, and myBool will still be false after the method
		 * call
		 */
		int num=10;
		boolean myBool=false;
		System.out.println("before method call");
		System.out.println("num is "+num);//will print 10
		System.out.println("myBool is "+myBool);//will print false
		/*
		 * will prinT 100 and true, but this is INSIDE the 
		 * changePrimitive method, so these are only LOCAL
		 * VARIABLES
		 */
		Change.changePrimitive(num, myBool);
		/*
		 * after method call will still print 10 and false
		 */
		System.out.println("after method call");
		System.out.println("num is "+num);
		System.out.println("myBool is "+myBool);
		
		Dog spot=new Dog();
		System.out.println("before Dog method call");
		System.out.println("spot id is "+spot.id);
		/*
		 * you can't change what an object refers to with a method
		 * this dog was the dog with id of 1 before the method
		 * and is still the dog with id of 1 after the method call
		 * which means its the same dog, it was ONLY a new dog
		 * of id 2 INSIDE the changeDog() method
		 */
		Change.changeDog(spot);
		System.out.println("after Dog method call");
		System.out.println("spot id is "+spot.id);
		/*
		 * you can't change what the dog spot refers to, but you
		 * can change the atributes of spot. So this is the same
		 * dog after the method call, but he has a different age
		 * and different name
		 */
		System.out.println("before change dog atribute method");
		System.out.println("age of dog is "+spot.age);
		System.out.println("name of dog is "+spot.name);
		System.out.println("id of dog "+spot.id);
		Change.changeDogAtribute(spot);
		System.out.println("After change dog atribute method");
		System.out.println("age of dog is "+spot.age);
		System.out.println("name of Dog is "+spot.name);
		System.out.println("id of dog is "+spot.id);

	}

}
