package com.android;
/**
 * Exam objective 2.1
 * Decalre and initialise variables (including casting of primitive data types)
 * Exam objective 2.2
 * Differentiate between object reference variables and primitive variables
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot=new Dog();
		Dog lassie=new Dog();
		
		System.out.println("spots dog id is "+spot.dogId);
		System.out.println("lassies dog id is "+lassie.dogId);
		/*
		 * you can have as many references as you want to the one
		 * object, so in this case, spot, rex and benji all refer to the
		 * dog with the dogId of 0
		 */
		Dog rex=spot;
		Dog benji=spot;
		
		System.out.println("dog id of rex is "+rex.dogId);
		System.out.println("dog id of benji is "+benji.dogId);
		/*
		 * lassie now refers to a brand new dog with the dogid of 2
		 * the orginal dog of dogId 1 can no longer be referred to (got at)
		 * so it is liable for garbage collection, but not guaranteed to be
		 * garbage collected (Garbage collection frees up the memory)
		 */
		lassie=new Dog();
		System.out.println("dog id of lassie is now "+lassie.dogId);
		
		int num=45;
		int num2=45;
		System.out.println(num==num2);
		//rex and benji are the same dog
		System.out.println(rex==benji);
		//rex and lassie are different dogs
		System.out.println(rex==lassie);
		rex.age=3;
		lassie.age=3;
		rex.weight=3.4;
		lassie.weight=3.4;
		//rex.counter=lassie.counter;
		System.out.println("testing dogs equalivance");
		/*
		 * if you don't override the equals() method all this does is
		 * check if rex and lassie are the same dog, however we want to
		 * check if they are twins.
		 * so we override the equals method that checks if the two dogs
		 * have the same age and weight, if they are, then this will
		 * return true
		 */
		System.out.println(rex.equals(lassie));
		Pig pippa=new Pig();
		Cow bessie=new Cow();
		Sheep ma=new Sheep();
		/*
		 * takeAnimal can take a Animal object, which means it can take
		 * any sub class of Animal
		 */
		spot.takeAnimal(pippa);
		spot.takeAnimal(bessie);
		spot.takeAnimal(ma);
		
		rex.age=23;
		rex.weight=100;
		int changeNum=200;
		System.out.println("age of rex is "+rex.age);
		System.out.println("weight of rex is "+rex.weight);
		System.out.println("changeNum is "+changeNum);
		System.out.println("dogid of dog is "+rex.dogId);
		
		PassMe.changeValue(rex, changeNum);
		
		System.out.println("changeNum after the method is "+changeNum);
		/*
		 * with methods when you pass a primitive variable you pass by
		 * value, so if you change the primitive in the method, it is
		 * purely local and the change is not reflected outside of that
		 * method.
		 * when you pass a object, you pass by reference, so you can't change
		 * what the object refers to, but you can change the atributes of
		 * object 
		 * i.e pass in your dog to a method, if you change the age, weight,
		 * height, gender, etc of the dog, that change WILL be reflected
		 * everywhere outside of the method. but you can't change the fact
		 * that your dog will always be returned from the method.
		 * or you can change atributes of a object in a method  ,but not 
		 * what the object refers too.
		 */
		System.out.println("age of rex after method call is "+rex.age);
		System.out.println("dog id of rex after method call is "+rex.dogId);
		Dog darcy=new Dog();
		System.out.println("darcy id is "+darcy.dogId);
		
		
		
		
		
		
		
		

	}

}
