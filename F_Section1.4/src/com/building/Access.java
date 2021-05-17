package com.building;

public class Access {
	/*
	 * Animal is a public class and we can create an Animal in any other
	 * class. we do not need to import the Animal class, as we are in the
	 * same package
	 */
	Animal myAnimal = new Animal();
	/*]
	 * Zebra is a default level access class, which means package level
	 * access so we can create a Zebra in the same package. We do not need
	 * to import the Zebra class as we are in the same package
	 */
	Zebra myZebra=new Zebra();
	/*
	 * getting the various variables and methods of the Animal class
	 */
	static void getAnimal() {
		Animal andy=new Animal();
		System.out.println(andy.name);//public
		System.out.println(andy.weight);//default
		System.out.println(andy.sex);//protected 
		System.out.println(andy.height);//protected
		andy.eat();//public
		andy.run();//default
		
	}

}
