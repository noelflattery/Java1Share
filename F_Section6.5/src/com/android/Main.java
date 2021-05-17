package com.android;
/**
 * Exam object 7.4 use "this" and "super" to access objects and
 * constructors
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		Employee eddie=new Employee();
		Employee etna=new Employee(53,"Etna");
		Employee patsy=new Employee(50);
		//calling toString() method in the Employee class
	//	System.out.println(etna);
		etna.duties();
		
		Accountant ann=new Accountant();
		/*
		 * accountant implements Behaviour interface and
		 * callThis is a default method inside Behaviour interface
		 * which accounant DOES NOT override
		 */
		System.out.println("Accountant calling callThis");
		ann.callThis();
		System.out.println("Athlete calling callThis");
		Athlete andy=new Athlete();
		andy.callThis();
		
		System.out.println("creating Dog");
		Dog spot=new Dog();
		spot.accessSuper();
		System.out.println("creating vehicles");
		Boat boaty=new Boat();
		Boat boaty2=new Boat();
		Car myCar=new Car();
		Car myCar2=new Car();
		Ferrarri noelCar=new Ferrarri();
		Vehicle myVehicle=new Vehicle();
		System.out.println("boats created "+Boat.boatCount);
		System.out.println("Cars created "+Car.carCount);
		System.out.println("Ferrairs created "+Ferrarri.ferCount);
		System.out.println("Amount of vehciles "+Vehicle.count);
	//	System.out.println("there are "+Vehicle.count+ " Vehicles");
	//	System.out.println(myCar.count);
	//	System.out.println(noelCar.count);
		/*
		 * super class reference to a sub class object
		 * Building is the super class of house
		 * can't do other way around, can't have a House reference
		 * to a Building object, can't even cast it as you will get
		 * a classCastException
		 */
		Building buildHouse=new House();
		System.out.println("houses and buildings");
		/*
		 * this will take its implementation from the House class.
		 * because methods in derived/sub classes are overriden
		 * methods are taken from subclass
		 */
		buildHouse.calcCosts();
		/*
		 * variables of the same name are taken from the super class, 
		 * which is in this case the Building class. variables of the
		 * same name in derived/sub classes are HIDDEN
		 */
		System.out.println("age of buildHOuse is "+buildHouse.age);
		System.out.println("address of buildHouse is "+buildHouse.address);

	}

}
