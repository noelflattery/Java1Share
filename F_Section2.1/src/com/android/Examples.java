package com.android;

import java.util.concurrent.SynchronousQueue;

public class Examples {
	/*
	 * a static method that contains code on how to initialise variables
	 * 
	 */
	static void ex1() {
		//the smallest primitive data type -128 +127
		byte bnum=3;
		// +-32000 approx is allowed
		short sNum=45;
		//+-2.1 billion approx
		int num=4;
		int num2=4567890;
		/*
		 * need an L as default is an int so the L casts the number to be
		 * of type long, can be upper or lowercase L
		 */
		long lNum=5909089890800989L;
		System.out.println("lnum is "+lNum);
		/*
		 * you can fit an int in a long, as a int is smaller than a long
		 */
		lNum=num;
		/*
		 * you can't fit a long in an int, as a long is bigger than an int
		 */
		//num=lNum;
		
		/*
		 * casting is changing from one compatible data type to another compatible
		 * data type
		 */
		long lNum2=(long)9809;
		/*
		 * by default all floating point numbers are double in java
		 */
		double dNum=45.67;
		double sum=10/3.0;
		System.out.println(sum);
		/*
		 * if you a number with a decimal place to be a float your have
		 * to put a 'f' at the end of the number or cast it to be of type
		 * float
		 */
		float fNum=56.78f;
		float fNum2=(float)455.98;
		/*
		 * this does not work as a float is bigger than the int num
		 */
	//	num=fNum;
		/*
		 * if you cast a floating point number to be a whole number it
		 * chops off the  decimal places
		 */
		num=(int)fNum;
		System.out.println("num is now "+num);
		lNum=5909089890800989L;
		/*
		 * you can however cast a long to be of type int, however the results
		 * can be unpredictable, this happens if the long number is greater
		 * than the maximum or minimum allowable value for an int
		 * approx +-2.1 billion
		 */
		num=(int)lNum;
		/*
		 * looks nothing like the original long
		 */
		System.out.println(num);
		
		//can only be true or false
		boolean myBool=true;
		boolean myBool2=false;
		//there is no bool data type
		/*
		 * char data type which has single quotes around a character
		 * it is only ONE character
		 */
		char myChar='a';
		//every character corrsesponds to a number
		//than means you can assign a number to a character
		char myChar2=64;
		System.out.println("64 is "+myChar2);
		/*
		 * characters can only be assigned a positive number, positive numbers
		 * in computer programming are referrred to as unsigned ints
		 * so you can't assign a minus (signed) number to a character
		 */
		//char myChar3=-34;
		/*
		 * However we can force it to accept the minus number
		 * you have to cast it to be of type char
		 */
		char myChar4=(char)-5;
		System.out.println("muck out "+myChar4);	
	}
	
	static void ex2() {
		/*
		 * binary numbers begin with a 0b, they are displayed by default
		 * in decimal (100 in binary will display as 4
		 * binary only uses 1 and 0 to use any other numbers will
		 * result in an error
		 */
		int biNum=0b100;
		System.out.println("0b100 in decimal is "+biNum);
		biNum=0b1000110011;
		System.out.println("biNum is now "+biNum);
		/*
		 * octal numbers begins with a 0, again displayed by default in decimla
		 * (100 will appear as 64)
		 * only uses numbers 1 to 7, to use any other numbers will result
		 * in an error
		 */
		int octNum=0100;
		System.out.println("0100 in decimal is "+octNum);
		int octNum2=07677543;
		System.out.println("07677543 in decimal is "+octNum2);
		/*
		 * hexadecimal numbers begin with a 0x, again displayed by
		 * default in decimal, 10 will apper as 16, 100 (16X16) will appear
		 * as 256. numbers goes 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f 
		 */
		int hexNum=0x10;
		System.out.println("0x10 is "+hexNum);
		/*
		 * by default all numbering systems are displayed in decimal
		 */
		int sum=hexNum+octNum+biNum;
		System.out.println("sum is "+sum);
		/*
		 * sum is 643, so now we will display it in octal, binary and 
		 * hexadecimal
		 */
		System.out.println("in binary");
		System.out.println(Integer.toString(sum,2));
		System.out.println("in octal");
		System.out.println(Integer.toString(sum,8));
		System.out.println("in hexadecimal base 16");
		System.out.println(Integer.toString(sum,16));
		System.out.println("in base 25");
		System.out.println(Integer.toString(sum,25));
		/*
		 * you can put underscores in variable number values to aid 
		 * with reading the numbers
		 */
		long bigNum=1_000_000_000_000L;
		/*
		 * can't put underscores in the following positions
		 */
		//int wrongNum=_123;
		//int wrongNum=123_;
		//double dnum=1._45;
		//double dnum=1_.45;
		
		int newOctNum=0_123;
		/*
		 * can't put underscores in the following positions
		 */
	//	int newOctNum=0x_123;
	//	int newbiNum=0b_123;
	//	System.out.println(newOctNum);
		
	//	long lnum2=1000000000000_L
		/*
		 * these are called parsers and converts text to numbers or booleans
		 * but NOT CHARACTERS. each numeric type and boolean has it's own
		 * parser, i.e int has parseInt, double has parseDouble.
		 * these methods are static methods from the wrapper classes
		 */
		int i=Integer.parseInt("1234");
		double dnum=Double.parseDouble("1.233");
		boolean myBool=Boolean.parseBoolean("trUe");
		//you can't use underscores with parsers 4.5_6
		/*
		 * rules for underscores and numbers
		 * you can't start or end a literal value (number) with an underscore.
		 * you can't place an underscore right after the prefixes for hex or
		 * octal (0b, 0B, 0x, 0X)
		 * you can place an underscore after prefix for octal, which is a 
		 * 0
		 * you can't place an underscore prior to the L suffix, the F suffix
		 * or the D suffix (d suffix is doubles which we usually don't have to 
		 * use as all number with decimal places are by default doubles)
		 * you can't place a underscore adjacent to a decimal point.
		 * you can't use an underscore where a string of digits is expected (i.e
		 * in parsers)
		 */
	}
	/*
	 * this is section 2.2, it is a small section so will not have it's own
	 * java project
	 */
	static void ex3() {
		/*
		 * no limit to size in the name of a variable
		 */
		int jlkjlkjlkjolkjlkjkljlkjlkjkl;
		//underscores can be anywhere for variable names
		int _myNumber_;
		//all currency symbols will work anywehere
		int €nu€m€;
		int £nu£$;
		//number can be anywhere,EXCEPT at the beginning
		//int 1num;
		//also variable name can't be numbers only
		//int 234;
		int num1;
		//no dashes -- allowed anywhere
		//int dash-num;
		/*
		 * not allowed to use any other symbols except the currency symbols
		 * and the underscores
		 */
		//double special@
		//double more#
		/*
		 * can't use java keywords for variable name
		 */
		//int for;
		//double if;
		//float throw;
		
		/*
		 * you can define and intialise as many variables as you like of
		 * the same type on the same line
		 */
		int number=9,number2=12,number3=number;
		double dnum,dnum2,dnum3;
	}

}
