package com.android;
/**
 * Ecam objective 7.3 Determine when casting is necessary
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		byte bnum=3;
		/*
		 * we can cast here, but we don't have to, as a byte can fit 
		 * insdie an int
		 */
		int num=(int)bnum;
		
		int number=68909;
		byte newB=(byte)number;
		System.out.println(newB);
		
		Cat tibbles=new Cat();
		/*
		 * you can't cast imcompatible data types, there has to be some
		 * form of inheritance relationship or implemenation relatiohship
		 * Dogs and Cats are incompatible data types
		 */
		//Dog spot=(Dog)tibbles;
		
		Cow bessie = new Cow();
		bessie.eat();//eat method in Animal class overriden in Cow class
		bessie.run();//Run method in Animal class not overriden
		bessie.drink();//drink method only in Cow class
	
		
		Animal andy=new Animal();
		//age of animal is 2
		System.out.println("age of animal is "+andy.age);
		//age is cow is 200
		System.out.println("age of cow is "+bessie.age);
		Animal cowAnimal=new Cow();
		/*
		 * this object takes it's implementation of overriden methods
		 * from the subclass (Cow class) and if two variables have the same
		 * name in both classes (i.e age in cow, age in Animal) it will
		 * take the value of age in the Animal class. variables are 
		 * hidden is the term
		 */
		System.out.println(cowAnimal.age);//2 as age is 2 in Animal class
		System.out.println(
				(
						(Cow)cowAnimal
						)
				.age);
	try {
		/*
		 * this code might generate an exception
		 * it does, it generates a ClassCastException
		 */
		Cow daisy=(Cow)new Animal();
	}/*
	if this code does generate an exception, then the catch block will
	catch the exception and deal with, and our program will not crash
	*/
	catch(Exception e) {
		System.out.println("exception is ");
		System.out.println(e);
	}
	System.out.println("my program continues");
	
	Dog spot=new Dog();
	Animal angela=new Animal();
	Pig pippa = new Pig();
	/*
	 * we know spot is an animal but we don't know what type of 
	 * animal it is
	 * instanceof
	 * returns true if it is a particular object
	 * returns false if it is not a particular object
	 */
	System.out.println(spot instanceof Dog);
	System.out.println("testing pippa ");
	System.out.println(pippa instanceof Pig);
	System.out.println("testing pippa if a Animal");
	System.out.println(pippa instanceof Animal);
	/*
	 * super class reference to a sub class object
	 */
	Animal aidan=new Animal();
	System.out.println("anCow  is");
	System.out.println(aidan instanceof Cow);//false
	System.out.println(aidan instanceof Animal);//true
	
	System.out.println("using instanceof with The Dog class");
	/*
	 * instanceof ONLY WORKS with classes that have some kind
	 * of relationship. The Dog class and the Animal have no
	 * relationship, whereas Cow extends Animal, which is why we
	 * can use instanceof with Animals and Cows
	 */
	//System.out.println(spot instanceof Animal);
	System.out.println("find out what spot object is");
	/*
	 * this returns a string which is the full qualified name of
	 * the class, which is in this case
	 * class com.android.Dog
	 */
	System.out.println(spot.getClass());
	System.out.println("return just name of class");
	/*
	 * this returns a string which is just the NAME of the class,
	 * which in this case will be Dog
	 */
	System.out.println(spot.getClass().getSimpleName());
	/*
	 * this is an array of animals, so it can take Animals or 
	 * any sub class of Animals
	 */
	Animal[]farm= {new Cow(),new Sheep(),new Pig(),new Chicken(),
			new Sheep(),new Sheep(),new Animal()};
	int sheepCounter=0;
	System.out.println("counting our sheep");
	
	for(Animal a:farm) {
		/*
		 * this will check to see if the Animal is a sheep, 
		 * if it is sheepCheck will be true
		 */
		boolean sheepCheck=a instanceof Sheep;
		/*
		 * if sheepCheck is true, then increment our sheepCounter
		 */
		if(sheepCheck)
			sheepCounter++;
	}
	
	System.out.println("we have "+sheepCounter+" sheep in our farm");
	
	andy=new Animal();
	Cow daisy=new Cow();
	System.out.println("before casting of andy");
	andy.eat();
//	daisy.eat();
	System.out.println("after casting of andy");
	/*
	 * this does not change daisy to a Animal object, this only
	 * means that the below object is a Animal reference to a 
	 * Cow object
	 */
	andy=(Animal)daisy;
	andy.eat();
	//methods from the behaviour interface
	spot.angry();
	tibbles=new Cat();
	tibbles.sad();
	/*
	 * this is asking is the object spot imlementing the Behaviour
	 * interface, this will return true as class Dog implements
	 * the Behaviour interface
	 */
	System.out.println(spot instanceof Behaviour);
	/*
	 * you can create an interface object
	 * you can create a interface reference to a Object that 
	 * implements the interface
	 */
	Behaviour behaveDog=spot;
	Behaviour behaveCat=tibbles;
	/*
	 * only have access to the methods that the Dog and Cat class
	 * implements from the Behaviour interface
	 */
	behaveDog.angry();
	behaveDog.sad();
	//behaveDog.pant();
	behaveCat.angry();
	behaveCat.sad();
	//behaveCat.purrs();
	/*
	 * rex is now a Dog reference to a Dog object
	 */
	Dog rex=(Dog)behaveDog;
	rex.pant();
	//System.out.println(rex==behaveDog);
	System.out.println("age of dog is "+rex.age);
	/*
	 * this is still a behaviour interface reference to a Dog object
	 * this object cannot access the age of the dog
	 */
	behaveDog=new Dog();
	//System.out.println(behaveDog.age);
	
	System.out.println("using casting to access age of Dog "+
			((Dog)behaveDog).age
			);
	
	((Dog)behaveDog).pant();
	/*
	 * when you have an array or arraylist of interface type Behavior
	 * the array can be populated with objects that implement the
	 * Behaviour interface, which in our case is only Cats and 
	 * Dogs
	 */
	Behaviour[]behaveArray= {new Dog(),spot,tibbles,new Cat()};
	
	
	
	
			
		
		
		
	

	}

}
