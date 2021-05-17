package com.android;

public class Examples {
	/**
	 * just a test
	 */
	static void ex1() {
		/*
		 * when you create a string by assigning a value, you
		 * place the text in what is called the "String pool",
		 * so the name "pat" is place in the pool
		 */
		String name="pat";
		/*
		 * every time a new String is created by assigning a 
		 * value directly, it first checks the string pool to see
		 * if that word already exists. If it does, it assigns
		 * the value in teh pool the new string reference.
		 * so name and name2 now refer to the same string object
		 * which contains the word "pat"
		 */
		String name2="pat";
		/*
		 * both contain the word "pat" so will print true
		 */
		System.out.println(name.equals(name2));
		/*
		 * name and name2 are the same object so will print true
		 */
		System.out.println(name==name2);
		/*
		 * the pool only holds value and assigns value if you are
		 * assigning strings directly to a variable
		 * String name="paul";
		 * here we are creating a string by using the constructor
		 * in the String class that takes a string. This String
		 * is NOT PLACED IN THE POOL
		 */
		String str1=new String("paul");
		String str2=new String("paul");
		/*
		 * this will print true as the equals method in the string
		 * class, checks to see if the two strings contain the same
		 * word, and this IS CASE SENSITIVE
		 */
		System.out.println("str1 1 equals str2 "+str1.equals(str2));
		/*
		 * this will print false as whenever you use the NEW keyword
		 * with a string, the string is NOT PLACED IN THE POOL
		 */
		System.out.println("str 1 == str2 "+str1==str2);
		name=name2=null;
		//"pat" is still in the pool
		String name3="pat";
		
		name="sean";
		name2="SeAn";
		/*
		 * this will be false, as equals is case sensitive
		 * also strings placed in the pool are case sensitive
		 */
		System.out.println("name and name2"+name.equals(name2));
		//different objects so false
		System.out.println(name==name2);
		//equalsIgnore case, ignores teh case and just checks the
		//letters, regardless of the case, so this will be true
		System.out.println("ignore case "+name.equalsIgnoreCase(name2));
		/*
		 * if you want to find out if two strings contain the same letters
		 * and words, you should ALWAYS USE equals, not the == operators
		 */
		
		/*
		 * you can also create a String by passing an array of 
		 * characters
		 */
		char[]names1= {'s','h','e','l'};
		char[]names2= {'m','a','r','y'};
		String woman=new String(names1);
		String woman2=new String(names2);	
	}//end of ex1
	
	/*
	 * methods of the String class
	 * String class is known as a immutable class, an immutable
	 * class is a FINAL CLASS, so the methods of a string class
	 * DO NOT CHANGE A STRING, they RETURN A NEW STRING
	 */
	static void ex2() {
		String str="hello there nice to meet you";
		/*
		 * i am replacing all the 'e's with a question mark ?
		 * all strings produced by methods are NOT placed in
		 * pool, this method produces a brand new string.
		 */
		System.out.println(str.replace('e', '?'));
		System.out.println("str string is ");
		//str still has the same original value
		System.out.println(str);
		/*
		 * this is creating a new string and assigning it to
		 * the newStr variable
		 */
		String newStr=str.replace('e', '?');
		System.out.println(newStr);
		/*
		 * once created you can't change a string, you can assign
		 * a new value to it, but not change the string for instance 
		 * changing all our 'e's to ?
		 */
	}//end of ex2
	
	//various  methods of the String class
	static void ex3() {
		
		String name="paul";
		/*
		 * charat()shows what character is at a particular index
		 * in a string. numbering in a string, is array numbering
		 * and starts at 0
		 */
		System.out.println("at position 0 "+name.charAt(0));
		System.out.println("at postion 3 "+name.charAt(3));
		/*
		 * this will give you StringIndexOutOfBoundsException
		 */
	//	System.out.println(name.charAt(4));
		/*
		 * if you want to get the lenght of your string, you
		 * use the length method
		 * this will give us the lenght of the string that contains
		 * "paul", which is 4
		 */
		System.out.println("length of string "+name.length());
		
		String nursery="mary had a little lamb, whose fleece was"
				+ "white as snow and everywhere that mary went "
				+ "the lamb was sure to go";
		System.out.println("indexOf method");
		/*
		 * first occurance of a character or word, which is at
		 * index positon 5
		 */
		System.out.println(nursery.indexOf('h'));
		/*
		 * we can search for words, a space does count as a
		 * character
		 */
		System.out.println(nursery.indexOf("lamb"));
		/*
		 * this will start our search from positon 22
		 */
		System.out.println(nursery.indexOf("lamb", 22));
		/*
		 * if indexOf() can't find a particular string or
		 * character, it will return -1
		 */
		System.out.println("searching for z "+nursery.indexOf('z'));
		
		/*
		 * Substring
		 * there are a few overloaded substring() methods. the
		 * first type takes as an argument the starting position
		 * index, in the example below with the word "oracle"
		 * its starts at position 2, with is the word 'a', and will
		 * produce the string "acle"
		 */
		String exam="oracle";
		String cut=exam.substring(2);
		System.out.println("Substring");
		System.out.println(cut);
		/*
		 * starting position is 2 and UPTO 4 but NOT INCLUDING
		 * position 4, so will print out "ac" from the word "oracle"
		 */
		cut=exam.substring(2, 4);
		System.out.println(cut);
		
		System.out.println("trim");
		/*
		 * trim gets rid of trailing spaces in string, but does
		 * not get rid of spaces between words (trailing space
		 * is any spaces at the beginning and end of a string)
		 */
		name="   tom jones   ";
		System.out.println("the "+name+"the");
		cut=name.trim();
		System.out.println("the"+cut+"the");
		/*
		 * replace
		 */
		System.out.println("Replace");
		name="tommy";
		//this produces a new string that has no reference
		System.out.println(name.replace('m', 'n'));
		//this is still tommy
		System.out.println(name);
		/*
		 * replaces the 'm's in tommy with 'n's and assigns
		 * this NEW string to the variable cut
		 */
		cut=name.replace('m', 'n');
		System.out.println(cut);
		/*
		 * this replaces both instances of fox with wolf
		 */
		String str="the quick brown fox jumped over the lazy fox";
		System.out.println(str.replace("fox", "wolf"));
		/*
		 * does nothing, if it can't find the word to replace
		 * it does nothing
		 */
		System.out.println("replacing that does nto exist");
		System.out.println(str.replace("cat", "sheep"));
		/*
		 * can't replace char with a string or vice verasa
		 */
		//System.out.println(str.replace('t', "badger"));
		System.out.println("endswith and startswith");
		str="ABCAB";
		//this will print true
		System.out.println(str.startsWith("AB"));
		//this will print false, as it's a lower case a
		System.out.println(str.startsWith("a"));
		/*
		 * this will print true, checks to see if there is
		 * an "A" at position 3, there is
		 */
		System.out.println(str.startsWith("A",3));
		//can't check for a particular positon with endsWith
		//will print true
		System.out.println(str.endsWith("CAB"));
		//will print false
		System.out.println(str.endsWith("D"));	
	}//end of ex3
	
	static void ex4() {
		String str="hello";
		String str2="there";
		//concat joins two strings
		System.out.println(str.concat(str2));
		System.out.println(str+str2);
		
		String day="    sunday  ".replace('d', 'z').trim().
				concat("men");
		System.out.println(day);
		
		day="Monday";
		String newDay=day.replace("M", "T").concat("Day").
				substring(2,6);
		System.out.println(newDay);
		
		day="Saturday";
		newDay=day.substring(3,7).replace('u', 'o').
				concat(day);
		System.out.println(newDay);
		
		str="hello there nice to meet you";
		/*
		 * count the amount of spaces
		 * count the amount of characters, excluding spaces
		 * count the amount of words
		 */
		/*
		 * gets rid of any spaces before or after the string
		 */
		str=str.trim();
		/*
		 * counter of our spaces, we set it at 0
		 */
		int spaceCount=0;
		//will loop the length of the string
		for(int i=0;i<str.length();i++) {
			//if character is a space
			if(str.charAt(i)==' ') {
				//increment the space counter by 1
				spaceCount++;
			}
		}
		System.out.println("amount of spaces is "+spaceCount);
		/*
		 * this is the total amount of characters including
		 * spaces
		 */
		int totLength=str.length();
		/*
		 * the amount of characters will be the totLength -
		 * the spaceCount
		 */
		int charCount=totLength-spaceCount;
		System.out.println("amount of characters "+charCount);
		/*
		 * in properly formatted text with no more than one space
		 * between each word, there is only one space, which is
		 * always going to be one less than the amount of words
		 * (there are no spaces at the beginning or end of the text
		 * as trim() has taken care of this
		 * so we add 1 onto the amount of spaces to get the 
		 * amount of words
		 * 
		 */
		int wordCount=spaceCount+1;
		System.out.println("amount of words is "+wordCount);	
	}//end of ex4
	
	static void ex5() {
		String poet="Wordsworth";
		/*
		 * substring returns a NEW string with contains "Words"
		 * the String "Words" is NOT PUT in the string pool as 
		 * poet.substring(0,5) produces a new string each time,
		 * methods of the string class always produce a new
		 * string()
		 */
		String str1=poet.substring(0,5);
		String str2=poet.substring(0,5);
		//this will print true as both strings contain "Words"
		System.out.println(str1.equals(str2));
		//this will print false, as two different objects
		System.out.println(str1==str2);
		/*
		 * only at this point is "Words" in the string pool
		 */
		String str3="Words";
		/*
		 * this is false as str2 was produced by the subString
		 * method, and any string produced by a method of the
		 * String class is NOT PLACED in the string
		 */
		System.out.println(str2==str3);
		String str4="Words";
		/*
		 * these are the same object, as str3 places the STring 
		 * "Words" in the pool so that means that str4 is the 
		 * object as str3
		 */
		System.out.println(str3==str4);
		
	}//end of ex5
	
	static void ex6() {
		/*
		 * with Strings we can only use certain operators
		 * namely concatenation (+ +=)
		 * and equality (== !=)
		 * always use equals() method to find out if two strings are
		 * the same
		 */
		/*
		 * this is simple concatenation, just joins them up
		 */
		String aString="santa"+" claus "+" is coming to town";
		System.out.println(aString);
		
		int num=10;
		int num2=30;
		//40 santa claus is coming to town
		System.out.println(num+num2+aString);
		/*
		 * the first location we find a string in a print statement
		 * , everything after that is treated as a string, with
		 * one exception. if you put your numbers in a bracket, then
		 * that is treated as numbers
		 */
		//santa claus is coming to town1030
		System.out.println(aString+num+num2);
		
		System.out.println(aString+(num+num2));
		/*
		 * as soon as you put a string in an equation, the
		 * product of that equation becomes a String
		 */
		String sum=num+num2+aString;
		sum=true+aString;
		
		num=10;
		//num=num+20
		num+=20;
		
		aString="rudolph";
		//aString=aString+" the red nosed reindeer";
		aString+=" the red nosed reindeer";
		System.out.println(aString);
		
		num=15;
		/*
		 * if you have null and any other data type you will
		 * get an error
		 */
		//System.out.println(null+num);
	//	System.out.println(num+null);
		System.out.println(null+" hello");
		/*
		 * when you use null with a string in a print statement
		 * the null value is converted to the string word
		 * "null"
		 */
		System.out.println(10+20+"hello"+null);
		
	}
	
	
}
