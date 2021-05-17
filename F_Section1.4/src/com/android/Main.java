package com.android;
/**
 * Exam objective 6.4 apply access modifiers
 */
//importing all classes from com.building
import com.building.*;
public class Main {

	public static void main(String[] args) {
		/*
		 * see Animal class
		 * then access class
		 * then Dog class
		 * then Cat class
		 * all other classes are for you to practise on
		 */
		/*
		 * we have access to the Animal class because the Animal class
		 * itself is public
		 */
		Animal andy=new Animal();
		/*
		 * we have access to the name instance variable because this 
		 * variable is declared public in the Animal class
		 */
		System.out.println("name of animal is "+andy.name);
		/*
		 * we have access to the run() method because this method is
		 * declared publicn in the Animal class so any other class in our
		 * application can access this, regardless of what package we are 
		 * in
		 */
		andy.run();
		/*
		 * we cannot access the instance eat() method because this method
		 * only has default/package level access and the Main class
		 * is in a different package to the Animal class
		 */
		//andy.eat();
		/*
		 * can't access weight because weight is default
		 */
		//System.out.println(andy.weight);
	/*
	 * The zebra class, in the Animal file, has default level access so
	 * the Main class, which is in a different package, has no access
	 * to the Zebra class	
	 */
	//	Zebra zed =new Zebra();
		
		/*
		 * can create a cat as the Cat class is in the different package
		 * com.building but the Cat class is public which means it is
		 * accessible outside of the package. We still have to import this class, 
		 * which we have with the statement
		 * import com.building.*;
		 */
		Cat tibbles=new Cat();
		/*
		 * Siamese is a default level access class so not available outside
		 * of the com.building package
		 */
		//Siamese sammy=new Siamese();
		//System.out.println();
	}

}
