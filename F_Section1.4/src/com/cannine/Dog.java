package com.cannine;

import com.building.Animal;

public class Dog extends Animal{
	/*
	 * test access to variables and methods in the animal class
	 */
	void getValues() {
		System.out.println(name);//public variable inherited from Animal class
		System.out.println(height);//protected variable inherited from Animal class
		System.out.println(sex);//protected variable inherited from Animal class
		/*
		 * weight is a default level access variable in the Animal class
		 * which is in a different package, so the Dog class can't see
		 * this variable
		 */
		//System.out.println(weight);
		Animal dAnimal=new Animal();
		//name is public access variable inherited from Animal class
		System.out.println("name of dAnimal is "+dAnimal.name);
		/*
		 * height is a protected variable from the Animal class which
		 * means we can't access this variable in this way by using
		 * a member of the class (we create an animal try to access
		 * the height of the Animal)
		 * the rule is you can't access a protected members of it's base
		 * class (Animal) using a member object of its class.
		 * In this case we have an animal referenced object and you can't
		 * access dAnimal.height as height is a protected variable and
		 * can't access dAnimal.sex as sex is also a protected variable
		 */
	//	System.out.println("height of dAnimal is "+dAnimal.height);
	}

}
