package com.android;

public class Examples {
	
	static void ex1() {
		/*
		 * a String object is an immutable object that once
		 * created CANNOT BE changed, as it is a Final class.
		 * So with a string all methods of the class create
		 * a NEW string object.
		 * A StringBuilder object is a mutable string that
		 * CAN be changed. the methods of a stringbuilder class
		 * can change the object (a lot of the methods for
		 * the string class have the same named method in the
		 * StringBuilder class)
		 */
		//only way to create a brand  new stringbuilder object
		StringBuilder sb1=new StringBuilder("Some Text");
		//can't assign a value directly to a stringBuilder object
		//sb1="more text";
		//StringBuilder sb2="cannot do";
		/*
		 * you can't assign a stringbuilder object to a string
		 */
		//String str=sb1;
		StringBuilder sb2=sb1;
	//	String str="hello";
		/*
		 * by default the initial lenght of all stringbuilder
		 * objects is size 16, that means, by default, we have
		 * an array of size 16 chars storing our stringBuilder
		 * object
		 */
	//	StringBuilder sb3=new StringBuilder("hello34jkhklqwey");
	//	sb3=sb3.append("hello");
		/*
		 * this starts off our initial char array inside the 
		 * stringBuilder class to be of lenght 50
		 */
		StringBuilder sb3=new StringBuilder(50);
		System.out.println("my stringBuilde is "+sb1);
		System.out.println("sb3 is "+sb3);
		/*
		 * you can also pass a stringbuilder object to the
		 * stringBuilder constructor
		 */
		StringBuilder sb4=new StringBuilder(sb1);
		//you can also create a blank StringBuilder object
		StringBuilder sb5=new StringBuilder();
	}//end of ex1
	
	static void ex2() {
		StringBuilder sb1=new StringBuilder("Toy ");
		System.out.println(sb1);
		/*
		 * append(), adds to the end of the StringBuilder
		 * object. this method changes the StringBuilder
		 * object
		 */
		System.out.println("append");
		sb1.append("Story");
		System.out.println(sb1);
		/*
		 * you can append any data type to a stringbuilder
		 * object
		 */
		sb1.append(true);
		System.out.println(sb1);
		sb1.append('?');
		System.out.println(sb1);
		sb1.append(12);
		System.out.println(sb1);
		sb1.append(12.4);
		System.out.println(sb1);
		
		Dog spot=new Dog();
		Cat tibbles=new Cat(10,"tibbles");
		/*
		 * this takes the toString() method from the object
		 * class that just prints out the address
		 */
		System.out.println(spot);
		/*
		 * this takes teh toString() methof from the class
		 * that prints out the age and name of the cat
		 */
		System.out.println(tibbles);
		/*
		 * it appends the address of spot onto sb1
		 */
		sb1.append(spot);
		System.out.println(sb1);
		/*
		 * it appends the statement, cat age is 10, name is
		 * tibbles to the of the string. this will append
		 * whatever the toString method is producing to the
		 * end of the sb1 stringbuilder object
		 */
		sb1.append(tibbles);
		System.out.println(sb1);
		
		String greeting="hello there ";
		//it does the same thing with strings
		System.out.println(greeting+tibbles);
		//can also append arrays of chars
		StringBuilder sb5=new StringBuilder("Hi ");
		StringBuilder sb6=new StringBuilder();
		char[]name= {'j','a','v','a'};
		//this will append from postion 1 to 3 in the above array
		sb6.append(name,1,3);
		//will print ava
		System.out.println(sb6);
		sb5.append(name,1,3);
		//this will print hi ava
		System.out.println(sb5);
		//have to use append to add anything to a StringBuilder
		//sb5=sb5+sb6//this will not work, only for strings it works	
	}
	
	static void ex3() {
		StringBuilder sb1=new StringBuilder("hello");
		/*
		 * insert
		 * inserts text or characters or boolean or numbers
		 * or object into certain locations in your StringBuilder
		 * object
		 */
		System.out.println("insert");
		//put in "NO" at postion 2
		sb1.insert(2, "NO");
		System.out.println(sb1);
		sb1.insert(3, 34);
		System.out.println(sb1);
		Cat newCat=new Cat(4,"tom");
		//this put in whatever the toString of the cat class produces
		sb1.insert(4, newCat);
		System.out.println(sb1);	
	}//end of ex3
	
	static void ex4() {
		StringBuilder numSb=new StringBuilder("012345678");
		/*
		 * delete
		 * delete removes the characters in a substring of the
		 * specified StringBuilder object
		 * so this will remove 2,3 BUT NOT 4, FROM POSITION 2 UP TO
		 * POSITION 4 BUT NOT INCLUDING IT
		 */
		System.out.println("delete");
		numSb.delete(2, 4);//.delete(5, 9);
		System.out.println(numSb);
		numSb=new StringBuilder("012345678");
		/*
		 * can't get outOfBounds for the delete() method
		 * in the StringBuilder, as the size of the char
		 * array can change
		 */
		numSb.append("mary had a little lamb").delete(3, 12);
		System.out.println(numSb);
		
		/*
		 * string can't change its size, so it can be
		 * outOfBounds, a stringBuilder can't be out of bounds
		 * when using delete
		 */
		numSb.delete(7, 60);
		System.out.println(numSb);
		//this gives us a stringIndexOutOfBoundsException
		String myStr="noel";
	//	System.out.println(myStr.charAt(5));
		
		numSb=new StringBuilder("012345678");
		/*
		 * deleteCharAT removes a single characters at a 
		 * specified location
		 * this is going to delete the 1
		 */
		numSb.deleteCharAt(1);
		System.out.println(numSb);
		//no trim method with the StringBuilder
		numSb.reverse();//reverses our string
		System.out.println(numSb);
		
		/*
		 * replace
		 * replaces a string in our stringbuilder object
		 * at a specified location
		 */
		numSb=new StringBuilder("012345678");
		numSb.replace(0, 5, "AB");
		System.out.println(numSb);
		
	}

}
