package com.android;
/*
 * comment out each of the import statement to see the effect it
 * has on creating your variables
 * importing all the public and protected members of the 
 * Cow class ONLY
 * you can have as many import statements as you want
 */
import com.animal.Cow;
/*
 * will import a class called ArrayList that resides inside the 
 * util package which resides inside the java package
 */
import java.util.ArrayList;
/*
 * this would also work for ArrayLists but it would also import all 
 * of the others classes in the same package (and there is a lot), 
 * some of which are large and complex
 */
//import java.util.*;

/*
 * importing all of the classes in the com.animal package, so now
 * we can  also create a Duck and a Zebra
 * star (*) usually means "ALL" in programming languages
 * this import ONLY imports the classes in the com.animal package
 * NOT THE classes in any sub package, so the Ape, Horse class and
 * the Behaviour interface are not currently accessible as they
 * are in the package com.animal.mammal
 */
import com.animal.*;
/*
 * this will import all the classes in the com.animal.mammal package
 * if we did not do this, we would have no access to the Ape and 
 * Horse class and the Behaviour interface
 */
import com.animal.mammal.*;
public class Person {
	
	com.animal.Cow bessie= new Cow();
	Duck daffy=new Duck();
	Zebra zed = new Zebra();
	Ape andy=new Ape();
	
/*
 * if we don't import a class, we can still create an object of the
 * class by using the full qualified name. in our case we have
 * an Apartment and Bungalow class in a different package and we are
 * NOT going import the package or a class	
 */
	com.building.Apartment myApartment=new com.building.Apartment();
	com.building.Bungalow myBungalow=new com.building.Bungalow();
/*
 * have to import the ArrayList class for this to work, or we could
 * use a fully qualified name	
 */
	ArrayList<Integer>myList;
/*
 * using a fully qualified name to create an ArrayList object	
 */
	java.util.ArrayList<Double>dList;
	
	enum Car{FORD,TOYOTA,VOLKSWAGON,MERCEDES,BMW,TESLA,
		MASSEY_FERGUSON
		}//a comment

	Car myCar=/*another comment*/Car.FORD;
	
	/*
	 * inner class, this is a class inside a class.
	 */
	private class Heart{
		int bpm;
		double bloodPressure;
	}
	
	Heart myHeart;
}
