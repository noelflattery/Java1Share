package com.android;
/*
 * Exam objective 1.4 import other packages to make them accessible
 * in your code
 */
/*
 * import all of the classes of the com.building.residetial package
 * which are Bungalow and SemiDetached
 */
import com.building.residential.*;
import com.exam.Test;
import com.exam.Test2;
/*
 * com.building only has the classes MultiStorey and Skyscraper 
 * NOT ANY OF THE SUBPACKAGES
 */
import com.building.*;
/*
 * imports only the Factory class from the com.building.commercial
 * package
 */
import com.building.commercial.Factory;
/*when we are accessing public static members of any class the way we
 * do this is prefix the static member we are wishing to call with
 * the name of the class. the class Test2 has a static method called
 * test2StatMethod and a static int variable called test2Int which
 * we can access without a static import with the following two commands
 * Test2.test2StatMethod
 * Test2.test2Int
 * by using the import static command for the static method test2StatMethod
 * we can now access this method by the command
 * test2StatMethod
 * 
 */
import static com.exam.Test2.test2StatMethod;
/*
 * even if we import all from Test2 class, we still have to use 
 * Test2.test2Int as if we want to use the shortened version of test2Int
 * we have to import this variable in a static way or we import everything in 
 * the class in a static way
 */
import com.exam.Test2.*;
import com.exam.Test3;

import static com.exam.Test3.*;

/*
 * importing all the static members so you don't have to use
 * the class name in front of a static member
 * i.e instead of going
 * Test.score;
 * Test.statMethod()
 * you can just go
 * score
 * or 
 * statMethod();
 * this import also imports all of the static public members of
 * a class. if we ONLY import from this class using this statement, we can only 
 * access the static members of the class but NOT create a member of the 
 * Test class
 */
import static com.exam.Test.*;

/*
 * can't import two classes of the same name from different packages
 * into the same file, because the compiler won't know which
 * multistorey class to create our object from
 */
import com.building.MultiStorey;
//this code will cause an error
//import com.building.commercial.MultiStorey;
public class Main {

	public static void main(String[] args) {
		
		MultiStorey myMultiStorey=new MultiStorey();
		// TODO Auto-generated method stub
		//simple names
		Dates myDates=new Dates();//short version
		//fully qualified names
		com.android.Dates longDates=new com.android.Dates();//long version
		
		Bungalow myHouse=new Bungalow();
		SemiDetached semiHouse=new SemiDetached();
		
		MultiStorey multiBuilding=new MultiStorey();
		Skyscraper skyBuilding=new Skyscraper();
		//only imported factory class so can't create an office
		Factory myFactory=new Factory();
	//	Office myOffice=new Office();	
		/*
		 * we have two multistorey classes in two different packages
		 * so we use the full qualified name, like in the Dates class
		 */
		com.building.MultiStorey myMulti=new com.building.MultiStorey();
		com.building.commercial.MultiStorey comMulti= new 
				com.building.commercial.MultiStorey();
		
		MultiStorey myBuilding=new MultiStorey();
		/*
		 * accessing a public static member that was not imported 
		 * statically into this class
		 */
		System.out.println("static number from test2 is "+Test2.test2Int);
		/*
		 * as we have not imported this in a static way so we can't use
		 * the shortened form of this variable
		 */
		//System.out.println(test2Int);
		/*
		 * we have imported this in a static way from the Test2 class so
		 * we can use the shortened version (that is we do not have to use
		 * Test2.tes2StatMethod()
		 */
		test2StatMethod();
		/*
		 * we have imported both all the static and non static public members
		 * of the Test class so we can access both static and non static
		 * members
		 */
		statMethod();
		System.out.println("static string from Test class is "+statStr);
		/*
		 * we can create an instance of the Test class as we have imported
		 * both static and non static public members of the class
		 */
		Test myTest=new Test();
		/*
		 * we can't create a instance of the Test2 class as we have not 
		 * imported this class, we have only imported the static method
		 * test2StatMethod
		 */
	//	Test2 myTest2=new Test();
		System.out.println(Test3.statInt3);
		Test3.test3StatMethod();
	//	Office myOffice=new Office();
		Test3 myTest3=new Test3();
		System.out.println(myTest3.num);
			
	}

}
