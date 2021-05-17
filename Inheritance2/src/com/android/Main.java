package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal andy=new Animal();
		System.out.println("create me a Dog");
		Dog spot=new Dog();
		System.out.println("create me a collie");
		Collie colm=new Collie();
		//calling a static method in a non static way
		colm.pack();
		//calling a static method in a static way
		Collie.pack();
		
		Bungalow myHouse=new Bungalow();
	/*
	 * Plant is an abstract, so we can't create a plant object. so we can't use
	 * a plant object to call the static method pollinate. the only way to call
	 * this method is in a static way. which name of the class followed by
	 * name of the method
	 */Animal anDog=spot;
		Plant.pollinate();
		Flower.pollinate();
		System.out.println("andy the Animal");
		StaticMethods.takeAnimal(andy);//sending an Animal to the method
		System.out.println("spot the Dog");
		StaticMethods.takeAnimal(spot);//sending a Dog to the method
		/*
		 * what determines what method is called is the actual object
		 * so this is a Animal refrence to a Dog object, so inside the method
		 * this object behaves exactly the same way as a Dog object
		 */
		StaticMethods.takeAnimal(anDog);
		System.out.println("Colm the collie");
		StaticMethods.takeAnimal(colm);//sending a collie to the method
		

		
		
		

	}

}
