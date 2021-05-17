package com.android;

public class Examples {
	
	static void ex1() {
		//both classes in Animal file
		Dog spot=new Dog();
		Cat tibbles=new Cat();
		
		spot.breed();//from Animal class
		spot.drink();//overriding the abstract drink method in the behaviour interface
		spot.eat();//eat method in the Animal class
		spot.mad();//default mad method in the Behaviour interface
		spot.happy();//overrideing the abstract happy method in the Behaviour interface
		spot.sad();//overriding the abstract sad() methd in the Behhaviour interface
		spot.pant();//this is a standalone method in the Dog class
		//Cat class DID override the mad() method, Dog class DID NOT
		tibbles.mad();//this is overridng the default mad() method in the Behaviour interface
		/*
		 * this is a behaviour reference to a dog object. you can assign this
		 * reference to an object that implements the Behaviour interface.
		 * but you only have access to methods that are defined in the Behaviour
		 * interface
		 */
		Behaviour behaveDog=new Dog();
		Behaviour behaveCat=new Cat();
		/*
		 * all these methods were first defined in the Behaviour interface
		 */
		behaveDog.happy();
		behaveDog.sad();
		behaveDog.mad();
		/*
		 * does not have access to pant() method as this method was first defined
		 * in the Dog class, NOT IN the interface Behaviour
		 */
	//	behaveDog.pant();
		/*
		 * has no access to breed() or eat() as these methods were first defined
		 * in the Animal class
		 */
		//behaveDog.breed();
		//behaveDog.eat();
		/*
		 * Animal reference to a Dog object
		 * super class reference to a sub class object
		 * this object only has access to methods that are common to all
		 * Animals, only has access to methods first defined in the Animal
		 * class
		 */
		Animal anDog=new Dog();//super class reference to a sub class object
		anDog.breed();//not overriden in the Dog class
		anDog.drink();//is overriden in the Dog class
		anDog.eat();//not overridn the Dog class
		//no access to happy() as first defined in behaviour
		//anDog.happy();//
		//no access to pant() as first defined in Dog class
		//anDog.pant()
		/*
		 * this is not allowed, you can't have a sub classe reference to a
		 * super class object
		 */
	//	Dog dogAnimal=new Animal();
	//	Dog dogAnimal=(Dog)new Animal();//can't cast it
	}
	
	static void ex2() {
		/*
		 * to see multiple implementation of interfaces, go to Duck class
		 * to see overriding methods and accessibility go to Ape clas
		 */
	}
	
	static void ex3() {
		Deer bambi=new Deer();
		/*
		 * Deer implements the Run interface which extends the Move
		 * interface. An interface can extend an interface however an
		 * interface CANNOT implement another interface. A class implments
		 * an interface, a concrete or abstract class can implement an 
		 * interface
		 */
		bambi.landBased();//abstact method in Move interface
		bambi.runSpeed();//abstract method in Run interface
		/*
		 * accessing our finalInt variable in a static way
		 */
		System.out.println("accessing finalINt "+Run.finalInt);
		/*
		 * accessing our finalInt in Move interface in a NON static way
		 */
		System.out.println("accessing finalInt non static "+bambi.finalInt);
		/*
		 * can access a variable of an interface via the name of the class
		 * that implemetns that interface. Deer implements run  so we can
		 * do the following
		 */
		System.out.println("using Deer to access finalInt "+Deer.finalInt);
		/*
		 * we have a static method race() in the Run interface. there is only
		 * ONE way to access a static method in an interface. that is
		 * name of the interface followed by name of method
		 */
		Run.race();
		//Deer.race()//not work
		//bamib.race()//not work
	}
	
	static void ex4() {
		Ape magilla=new Ape();
		Human harry=new Human();
		
		Test testy=new Test();
		/*
		 * the method takeApe takes an Ape or a subclass of Ape. in the first
		 * case our method takes an ape, in the second our method takes
		 * a Human
		 */
		testy.takeApe(magilla);
		testy.takeApe(harry);
		/*
		 * returnHuman takes only a human object, or sub classes of the
		 * Human class. Ape is a SUPER class of Human, so we cannot pass
		 * a Ape object to this method
		 */
		testy.returnHuman(harry);
	//	testy.returnHuman(magilla);
		
		Ape humApe=new Human();
		/*
		 * returnHuman expects a object that has a HUMAN REFERENCE, this
		 * object is a human but it has a Ape reference, and reference is
		 * what determines if a method can take a certain object or not
		 */
		//testy.returnHuman(humApe);
		/*
		 * casting is changing the REFERENCE OF an object, only works for
		 * compatible objects
		 */
		Human newHuman=(Human)humApe;
		testy.returnHuman(newHuman);
		testy.returnHuman((Human)humApe);
		
	}

}
