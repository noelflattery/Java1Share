package com.android;

import java.util.ArrayList;

public class Examples {
	/*
	 * is an object version of a primitive variable.
	 * with a primitive variable, a primitive has no methods
	 */
	static void createWrappers() {
			int num=5;
			//num.
			/*
			 * why use wrapper class, as a primitive variables have
			 * no methods, whereas a wrapper variable has many 
			 * methods
			 */
			Integer myInt=4;
			myInt.intValue();
			/*
			 * four ways to create a wrapper object
			 */
			/*
			 * we use the "new" keyword and pass in a number
			 * the the Integer classes constructor
			 */
			Integer myInt2=new Integer(3);
			/*
			 * we use the "new" keyword and pass in a string, that
			 * contains a number, to the Integer class constructor
			 * that takes a string
			 */
			Integer myInt3=new Integer("12");
			String strNum="14";
			myInt3=new Integer(strNum);
			/*
			 * we can directly assign a literal value to a Integer
			 */
			Integer myInt4=45;
			/*
			 * using the static method valueOf, of the Integer class
			 * one method takes an int, one method takes a string
			 * that contains an int
			 */
			Integer myInt5=Integer.valueOf(45);
			myInt5=Integer.valueOf("45");
			Double doubleMe=2.0;
			/*
			 * Double myDouble=2.0;
			int newNum=myDouble.intValue();
			an arraylist can only take objects, so when you add a number
			to a arraylist, what is actually being added is a wrapper object
			i.e
			numList.add(45)
			is actually adding a Integer wrapper object to arraylist
			 */
			ArrayList<Integer>numList=new ArrayList<Integer>();
			//num is a primitve variable, an int
			num=56;
			numList.add(23);
			
			int newNum=56;
			/*
			 * so what happens when you add a primitive int to a arraylist
			 * is that it is autoboxed to become an interger
			 */
			/*
			 * you can do this 
			 * as the number 45 is boxed to become an Integer wrapper object
			 */
			numList.add(45);
			/*
			 * the int newNum is boxed to become an Integer
			 */
			numList.add(newNum);
			numList.add(myInt);
			numList.add(myInt2);
			numList.add(myInt3);
			System.out.println(numList);
			
			
			/*
			 * creating a wrapper by assignment
			 * assigning a primitve value to a wrapper object
			 * this is called autoboxing
			 * here it takes the double primite 2.34 and "boxes"
			 * it in a Double wrapper class object called
			 * myDouble
			 */
			Double myDouble=2.0;
			double dnum=12.5;
			myDouble=dnum;
			Integer iNumber=2;
			int iNum=5;
			iNumber=iNum;
			//won't compile
			/*
			 * can't assign another wrapper numeric object to a different
			 * numeric type wrapper
			 */
		//	myDouble=iNumber;
			/*
			 * all wrapper numeric types inherit from the 
			 * Number class
			 */
			ArrayList<Number>myList=new ArrayList<Number>();
			myList.add(iNum);
			myList.add(myDouble);
			/*
			 * wrapper classes there are two constructors 
			 * one that takes a primitive value, and one that
			 * takes a string value (the latter DOES NOT WORK
			 * FOR CHARACTER)
			 * this is calling the consturctor in the Integer
			 * class that takes an int
			 */
			Integer number=new Integer(12);
			Double dNumber=new Double(2.5);
			/*
			 * this is calling the constructor in the Integer
			 * class that takes a String and converts that 
			 * string to a Integer
			 */
			Integer strNum2=new Integer("123");
			Boolean myBool=new Boolean("TrUe");
			/*
			 * the only way to create a Character wrapper object
			 * with a constructor is by passing in a actual
			 * character to the Character constructor.
			 * A string DOES NOT WORK
			 * a number DOES NOT WORK
			 */
			Character myCharacter=new Character('a');
			//this is boxed to become a character wrapper
			Character greatCharacter='b';
			char myChar='!';
			Character myCharacter2=new Character(myChar);
			/*
			 * this is the oracle recommended way to create 
			 * wrappers, by using static methods of the Wrapper
			 * class
			 * we create a wrapper object by passing in a primitve
			 * value to these methods
			 */
			Integer statInt=Integer.valueOf("12");
			Integer statInt2=Integer.valueOf(12);
			Boolean myBool3=Boolean.valueOf("tRUe");
			Boolean myBool4=Boolean.valueOf(true);
			
			myDouble=4.9;
			/*
			 * gets the number 4 from the Double wrapper object
			 * myDouble, which contains the value 4.9
			 */
			Integer statInt3=myDouble.intValue();
			
			//int iNum2=Integer.valueOf("123");
			//numList.add(iNum2);
			/*
			 * parsers are taking a string and converting that
			 * string to a primitve data type
			 */
			strNum="4560";
			
			int value=Integer.parseInt(strNum);
			double dValve=Double.parseDouble(strNum);
			short sValue=Short.parseShort(strNum);
			
			/*
			 * Unboxing, taking the int variable out of the 
			 * wrapper Integer variable number and assigning
			 * it to a int variable called num
			 */
			num=4;
			number=100;
			num=number;
			/*
			 * autoboxing, boxing up a primitive int variable
			 * num in the Integer wrapper variable number
			 */
			number=num;
			number=100;
			num=10;
			numList=new<Integer>ArrayList();
			/*
			 * the process by which a primitve variable is
			 * added to a arraylist is autoboxing. the primitive
			 * variable num IS NOT ADDED TO The arraylist.
			 * first the value of num is autoboxed into an 
			 * Integer wrapper and then added to the arraylist
			 */
			numList.add(number);
			numList.add(num);
			
			System.out.println(numList.get(0));
			System.out.println(numList.get(1));
			
			Dog spot=new Dog();
			Cat tibbles=new Cat();
			
			System.out.println(spot.getClass().getSimpleName());
			System.out.println(tibbles.getClass().getSimpleName());
			
			System.out.println(numList.get(0).getClass()
					.getSimpleName());
			/*
			 * second object in list is also an integer as the 
			 * int value num is boxed into an Integer
			 */
			System.out.println(numList.get(1).getClass()
					.getSimpleName());	
			
			ArrayList<Integer>myList2=new ArrayList<Integer>();
			myList2.add(45);
			int myInt6=56;
		///	myList2.add(myInt6);
	}
	
	static void compareWrappers() {
		/*
		 * can't assign one wrapper object of one type
		 * to another wrapper of a different type
		 */
/*		Short snumber=45;
		Integer number=snumber;
		*/
		//primitive variables
		int num=23;
		short snum=12;
		num=snum;
		/*
		 * this will not work, as you can only assign literal
		 * values of the primitive version of the wrapper to 
		 * a wrapper object. i.e a Double wrapper can only be
		 * assigned a number with a decimal point
		 */
		//Double dNumber=100;
		Double dNumber=100.0;
		//two Integer werappers that contain the number 1000
		/*
		 * here we createa two wrapper objects, these are two
		 * SEPERATE OBJECTS, and both contain the number 1000.
		 * so if we go number1==number2, they are two 
		 * different object, so this will return false.
		 * if we want to see that they contain the same number
		 * we have to go number1.equals(number2)
		 */
		Integer number1=new Integer(1000);
		Integer number2=new Integer(1000);
		num=100;
		int num2=100;
		//these two variables are the same value
		System.out.println("two ints same "+(num==num2));//true
		
		System.out.println("two integers "+(number1==number2));//false
		
		System.out.println("two integers equals "+
		(number1.equals(number2)));//true
		/*
		 * if you are assigning two of the same numbers directly
		 * to two Integer wrapper objects and the number is less
		 * than 127 and greater than -128, then the two wrappers
		 * point to the same object and 
		 * number1==number2 will be true
		 */
		number1=12;
		number2=12;
		System.out.println("integer less than 127"+
		(number1==number2));
		//all of these references point to the same Boolean object
		Boolean cBool=true;
		Boolean cBool2=true;
		Boolean cBool3=true;
		//this will print true
		System.out.println(cBool==cBool2==cBool3);
		/*
		 * when you change a wrapper number in any way, you 
		 * are CREATING A NEW Wrapper (with the exception if a 
		 * number is less than 127 greater than -128. so here cNumber and
		 * cNumber2 are two references to the same object to
		 * start off with, and they both contain the number
		 * 230.
		 * with ++cNumber we are adding one, so cNumber becomes
		 * 231 and also is a NEW INTEGER WRAPPER object. 
		 * again when we go --Cnumber, cNumber now refers
		 * again to a new INTEGER WRAPPER object. So even though
		 * cNumber and cNumber2 both have the value 230, they
		 * refere to DIFFERENT wrapper objects, so
		 * cNumber==cNumber2 will be false
		 * however cNumber.equals(cNumber2) will be true
		 */
		Integer cNumber=230;
		Integer cNumber2=cNumber;
		System.out.println("cNumber and cNumber2");
		System.out.println(cNumber==cNumber2);//true as same object
		System.out.println(cNumber.equals(cNumber2));//true as same value
		++cNumber;
		System.out.println(cNumber);
		System.out.println(cNumber2);
		//now refer to different objecgts
		System.out.println("different objects "+(cNumber==cNumber2));
		System.out.println("different values "+
		//have diffent values, prints false
		(cNumber.equals(cNumber2)));
		--cNumber;
		/*
		 * cNumber and cNumber2 are now both 230, however they
		 * are DIFFERENT OBJECTS
		 */
		System.out.println(cNumber);
		//will print false
		System.out.println("still different "+(cNumber==cNumber2));
		System.out.println("but same value "+
		(cNumber.equals(cNumber2)));
		
		Integer i3=Integer.valueOf(10);
		//creating a Byte wrapper object
		/*
		 * this will not compile, as the number 2 is by default,
		 * a int. all whole numbers, less than approx 2.2 billion
		 * are ints in java, and an int can't fit inside a byte
		 */
		//Byte myByte=new Byte(2);
		/*
		 * we have to cast the number 2 to be of type byte
		 */
		Byte myByte=new Byte((byte)2);
		/*
		 * these are two different wrapper classes, so this 
		 * will not compile
		 */
	//	i3=myByte;
		//so you have to cast it
		i3=(int)myByte;
		/*
		 * you can't use equlivance (==) with two different
		 * wrapper types. Here we have an integer and a byte, 
		 * so we can't compare them
		 */
		//System.out.println(i3==myByte);
		/*
		 * this will always be false, as they are two different
		 * wrapper object types, i3 is an Integer wrapper,
		 * myByte is a Byte wrapper
		 */
		System.out.println(i3.equals(myByte));
		/*
		 * so we have to cast the wrapper Byte object myByte
		 * to be an int, this will now print true
		 * or get the intvalue of the int object or the byteValule ofthe
		 * byte object (do out example)
		 */
		System.out.println(i3.equals((int)myByte));
		
		myByte=45;
		Long testLong=45L;
		//this will always be false, as different data types
		System.out.println("compare Long Byte "+
		(myByte.equals(testLong)));
		/*
		 * can't cast a larger data type to be a smaller
		 * data type, this will not compile
		 */
	/*	System.out.println("compare Long Byte "+
				(myByte.equals((byte)testLong)));*/
		System.out.println(testLong.equals((long)myByte));
		
		testLong=12000L;
	//	int finalInt=(int)testLong;
		/*
		 * each numeric type as a intvalue(),shortValue(),
		 * doubleValue(),etc which gets, for instance in this
		 * case, the integer value of the number stored in the
		 * testLong Long wrapper object
		 */
		int finalInt=testLong.intValue();
		byte finalByte=testLong.byteValue();
		double finalDouble=testLong.doubleValue();
		System.out.println(finalInt);
			
	}
	
	static void additional() {
		int a=10;
		int b=100;
		/*
		 * if the first condition is true then the second condtion will
		 * NOT BE run. in this case ++a IS GREATER than 5, so the 
		 * second condition ++b<10 is never tested and b is never 
		 * incremented
		 */
		System.out.println(++a>5 || ++b<10);
		System.out.println(a);//so a is incremented
		System.out.println(b);//b is NOT incremented
		a=10;b=100;
		/*
		 * regardless of whether the first statement is true or not, the
		 * second statement will always run. so a is incremetned and 
		 * b is incremented
		 */
		System.out.println(++a>5 | ++b<10);
		System.out.println(a);//a is incremented
		System.out.println(b);//b is incremented
	}

	

}
