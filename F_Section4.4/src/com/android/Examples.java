package com.android;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Examples {
	
	static void ex1() {
		
		ArrayList<String>strList=new ArrayList<String>();
		//you don't have to put in string on right hand side
		ArrayList<String>strList2=new ArrayList<>();
		/*
		 * creates an array of size four with our four numbers
		 * in it, but you CANNOT have any more than four numbers
		 * in this array, it's length cannot change
		 */
		int[]myArray= {2,36,89,90};
		myArray[0]=100;
		//myArray[4]=899;
		/*
		 * we add values to an arraylist by using the 
		 * add() method
		 */
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		/*
		 * there is a toString() method in the ArrayList 
		 * class that will print out the elements of the
		 * arrayList
		 */
		System.out.println(strList);
		
		/*
		 * an arrayList can only take objects, it cannot
		 * take primitives so this will not compile
		 */
		//ArrayList<int>intList=new ArrayList<int>();
		ArrayList<Integer>integerList=new ArrayList<>();
		ArrayList<Character>characterList=new ArrayList<>();
		ArrayList<Double>doubleList=new ArrayList<Double>();
		
		integerList.add(1);//the 1 is autoboxed as an Integer
		integerList.add(new Integer(2));
		integerList.add(3);
		integerList.add(45);
		
		characterList.add('e');//e is autoboxed as a Character object
		characterList.add(new Character('a'));
		
		doubleList.add(2.34);//2.34 is autoboxed as a Double object
		doubleList.add(new Double(34.54));
		
		System.out.println(integerList);
		System.out.println(characterList);
		System.out.println(doubleList);
		System.out.println("using loop");
		for(Integer i:integerList) {
			System.out.println("number is "+i);
		}
		for(String s:strList) {
			System.out.println("String is "+s);
		}
		/*
		 * for arrays we use the varaible length to get the
		 * length of an array
		 * for arraylists we use the method size() to get
		 * the size of the arraylist. 
		 * arrayList numbering starts at 0
		 */
		for(int i=0;i<strList.size();i++) {
			
		}
		/*
		 * adding the number 56 at position 2
		 * this adds an extra number to our Arraylist
		 * so our Arraylist is now size 5
		 */
		integerList.add(2, 56);
		System.out.println(integerList);
		
		Dog spot=new Dog();
		Dog rex=new Dog(3,"rex");
		Dog lassie=new Dog();
		//create an ArrayList of Dogs
		ArrayList<Dog>dogList=new ArrayList<Dog>();
		//adding four dogs to our arrayList
		dogList.add(spot);
		dogList.add(rex);
		dogList.add(lassie);
		dogList.add(new Dog());
		/*
		 * this takes the toString method for each Dog
		 * and prints out the address, as there is no
		 * toString method in the Dog class, so it takes
		 * it's toString method from the object, which 
		 * just prints out the address of each dog.
		 * so it prints out four addresses
		 */
		System.out.println(dogList);
		
		for(Dog d:dogList) {
			System.out.println("dog is "+d);
		}
		
		Cat tibbles=new Cat(4,"tibbles");
		Cat fluffy=new Cat(2,"fluffy");
		Cat lucifer=new Cat(99,"lucifier");
		Cat tom=new Cat(12,"tom");
		
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(lucifer);
		catList.add(tom);
		/*
		 * this takes the toString method for each cat
		 * and prints out the details of the Cat. The Cat
		 * class DOES have a toString method, so this will
		 * print out four cats ages and names
		 */
		System.out.println(catList);
		
		for(Cat c:catList) {
			System.out.println(c);
		}
		/*
		 * if you don't specify a type for an arraylist
		 * like below, you are creating an arraylist of
		 * type Object, and the same rules that apply to
		 * an array of objects apply to an arraylist of
		 * objects.
		 * you can add ANY object to this arraylist, but
		 * it is limited what you can do with it as you
		 * can only work with the methods of the 
		 * object class
		 */
		ArrayList objList=new ArrayList();
		objList.add(2);//Integer wrapper
		objList.add(true);//Boolean wrapper
		objList.add("hello");//String
		objList.add(3.45);//Double wrapper
		objList.add(spot);//Cat
		objList.add(tom);//Dog
		System.out.println("printing out objects");
		System.out.println(objList);
		
		//animalList.add(e)
	//	animalList.add(e)	
	}
	
	static void ex2() {
		/*
		 * When you create an arrayList, what is happening is that in the
		 * background an array is being creating of size 10 and this
		 * is used to store your values if your arraylist has no more
		 * than 10 items in it. As soon as you are storing more than 10
		 * values in an arraylist, a new array is created in the background
		 * i.e, if we are an arraylist of 10 numbers, we add one number,
		 * an array of size 11 is created in the background and your
		 * 11 numbers are copied to it, if you add another number to this
		 * arraylist, a array of size 12 is created in the background
		 * and your 12 numbers are copied to it.
		 */
		ArrayList<Double>dList=new ArrayList<Double>();
		/*
		 * you can set the size of the initial array in the
		 * arrayList class, this means that the initial array
		 * in the background will be of size 23
		 */
		ArrayList<Integer>intList=new ArrayList<Integer>(23);
		
		ArrayList<String>strList=new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		
		String[]strArray= {"one","two","three","four"};
		//accessing first element of array
		System.out.println("accessing array "+strArray[0]);
		//cannot access arrayLists like we access arrays
		//we have to use the get() method
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		System.out.println(strList.get(3));
		//this will give us IndexOutOfBoundsException
		//System.out.println(strList.get(4));
		/*
		 * using a for loop to access all strings in our 
		 * arrayLIst of Stings
		 */
		System.out.println("using for loop");
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		/*
		 * enhanced for loops are most suited to Arraylists
		 */
		System.out.println("using enhanced for loop");
		for(String s:strList) {
			System.out.println(s);
		}
		
		Dog spot=new Dog();
		Dog rex=new Dog();
		Dog lassie=new Dog();
		
		ArrayList<Dog>dogList=new ArrayList<Dog>();
		dogList.add(spot);
		dogList.add(rex);
		dogList.add(lassie);
		dogList.add(new Dog());
		
		System.out.println("using for loop for dogs");
		for(int i=0;i<dogList.size();i++)
			System.out.println(dogList.get(i));
		
		Cat tibbles=new Cat(4,"tibbles");
		Cat fluffy=new Cat(2,"fluffy");
		Cat lucifier=new Cat(99,"lucifer");
		Cat tom=new Cat(5,"tom");
		
		System.out.println("using for loop for cats");
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(lucifier);
		catList.add(tom);
		
		for(int i=0;i<catList.size();i++) {
			//call toString method of cat class for each cat
			System.out.println(catList.get(i));
			//this will get us the name of each cat
			System.out.println(catList.get(i).name);
			//call the eat method for each cat
			catList.get(i).eat();
		}
		System.out.println("using enhanced for loop");
		/*
		 * when using an enhanced for loop we don't use the
		 * get() method
		 */
		for(Cat myCat:catList) {
			System.out.println(myCat);//calls toString method of cat class for each cat
			System.out.println(myCat.name);//prints name of each cat
			myCat.eat();//calls eat() method for each cat
		}
			
	}//end of ex2
	
	static void ex3() {
		
		ArrayList<Integer>integerList=new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(new Integer(2));
		integerList.add(3);
		integerList.add(4);
		/*
		 * the set() method, this changes the value of an existing
		 * elment in our arraylist to a new value
		 */
		System.out.println("before set");
		System.out.println(integerList);
		System.out.println("after set");
		/*
		 * in an arrayList if you want to reassign values you
		 * use the set() method. the set() method takes two values
		 * the index positon of the number you want to change, 
		 * and the new number.
		 * set does not ADD extra elements to an arraylist, it
		 * REPLACES AN EXISTING ELEMENT
		 */
		integerList.set(0, 1000);
		integerList.set(1, 2000);
		integerList.set(2, 3000);
		integerList.set(3, 4000);
		System.out.println(integerList);
		
		Dog spot=new Dog();
		Dog rex=new Dog();
		Dog lassie=new Dog();
		
		ArrayList<Dog>dogList=new ArrayList<Dog>();
		dogList.add(new Dog());
		dogList.add(new Dog());
		System.out.println(dogList.size());
		//changing our first dog to lassie
		dogList.set(0, lassie);
		//chnaging our numbers back to 1,2,3,4
		for(int i=0;i<integerList.size();i++) {
			integerList.set(i, i+1);
		//	integerList.set(i, integerList.get(i)/1000);
		}
		System.out.println(integerList);
		/*
		 * set() replaces EXISTING values in an arrayList.
		 * so if you try to replace a value that DOES NOT exist
		 * your get an exception
		 * this changes the first number in our arrayLIst
		 * to 11
		 */
		integerList.set(0, 11);
		/*
		 * you can't change a number that does not exist, this
		 * is an arraylist of 4 numbers, so your trying to change
		 * the number at postion 10, which does exist
		 */
		//this generates IndexOutOfBoundsException
		try {
			integerList.set(10, 999);
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}
		System.out.println("our program continues");
		
	}//end of ex3
	
	static void ex4() {
		
		String sb1="one";
		String sb2="two";
		String sb3="three";
		String sb4="four";
		
		ArrayList<String>strList=new ArrayList<String>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		System.out.println("before remove");
		System.out.println(strList);
		/*
		 * remove command
		 * there are two overloaded remove() methods in the
		 * ArrayList class. One remove method takes an object
		 * to be removed, the other takes a index position
		 */
		//method that takes a object to be removed
		strList.remove(sb2);
		System.out.println("after first remove");
		//our arrayList is now of size3
		System.out.println(strList);
		System.out.println("size of arrayLIst is "+strList.size());
		//method that takes the index position position of the 
		//string to be removed
		strList.remove(1);
		//"three" is removed and we now only have one, four
		System.out.println(strList);

	}//end of ex4
	
	static void ex5() {
		String sb1="one";
		String sb2="two";
		String sb3="three";
		String sb4="four";
		
		ArrayList<String>strList=new ArrayList<String>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		ArrayList<String>nameList=new ArrayList<String>();
		String name1="enda";
		String name2="leo";
		String name3="Angela";
		String name4="justin";
		
		nameList.add(name1);
		nameList.add(name2);
		nameList.add(name3);
		nameList.add(name4);
		/*
		 * addAll, adds the contents of one arrayList to anohter
		 * arraylist
		 */
		System.out.println("strList");
		System.out.println(strList);
		System.out.println("nameList");
		System.out.println(nameList);
		/*
		 * this adds ALL of the namelist to the end of our
		 * strList
		 */
		strList.addAll(nameList);
		System.out.println("new strList");
		System.out.println(strList);
		/*
		 * this adds the contents of strList to nameList as
		 * index positon 2
		 */
		nameList.addAll(2,strList);
		System.out.println("new nameList");
		System.out.println(nameList);
		
		ArrayList<String>nameList2=new ArrayList<String>();
		nameList2.add(name1);
		nameList2.add(name2);
		nameList2.add(name3);
		nameList2.add(name4);
		
		String[]names= {"pat","mary","palm","harry"};
		System.out.println("nameList2 before addAll from array");
		System.out.println(nameList2);
		/*
		 * this method adds all of the names from the names
		 * array to the nameList2 arraylist. adds everything from
		 * an array to a arraylist
		 * nameList2 is the arrayList
		 * names is the array
		 */
		Collections.addAll(nameList2, names);
		System.out.println("nameList2 after addall from array");
		System.out.println(nameList2);	
	}
	
	static void ex6() {
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		/*
		 * deep copy and 
		 * shallow copy
		 * Deep copy is two references to the same arraylist
		 * shallow is two arraylists with the same values, but
		 * are different arrayLists
		 * this is a Deep copy
		 */
		ArrayList<String>strCopy=strList;
		System.out.println("same object");
		System.out.println(strCopy==strList);
		System.out.println("same values");
		System.out.println(strCopy.equals(strList));
		/*
		 * changing the value at postion 0, which was "one", to
		 * "hello"
		 */
		strCopy.set(0, "hello");
		
		System.out.println(strCopy);
		System.out.println(strList);
		
		strList.set(1, "orange");
		
		System.out.println(strCopy);
		System.out.println(strList);
		
		ArrayList<String>newString=new ArrayList<String>();
		//adding all the contents of strList arrayList to newString arraylist
		//this creates a shallow
		//shallow copy, copies the values, but not the reference
		newString.addAll(strList);
		System.out.println("newstring is ");
		System.out.println(newString);
		System.out.println(strList);
		/*
		 * this returns false, as these are two different
		 * arraylists
		 */
		System.out.println(strList==newString);
		/*
		 * this returns true as they both have the same values
		 */
		System.out.println(strList.equals(newString));
			
	}
	
	static void ex7() {
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		/*
		 * clear, this deletes all elements from arrayList
		 */
		strList.clear();
		System.out.println("after clear");
		System.out.println(strList);
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		/*
		 * contains()
		 * this method returns true if the list contains the
		 * specified element
		 */
		System.out.println(strList.contains("one"));
		System.out.println(strList.contains("baloon"));
		/*
		 * indexOf()
		 * this method returns the first index of the element
		 * if it exists and -1 if it does not
		 */
		strList.add("three");
		System.out.println("strList is ");
		System.out.println(strList);
		/*
		 * indexOf only finds where "three" FIRST EXISTS	
		 * which is at index position 2, it does not find the
		 * word "three" at index postion 4
		 */
		System.out.println(strList.indexOf("three"));
		System.out.println(strList.indexOf("tomato"));
		
	}
	
	static void ex8() {
	/*	ArrayList<Cat>catList=new ArrayList<Cat>();
		Cat tom=new Cat(2,"tom");
		Cat tibbles=new Cat(4,"tibbles");
		Cat puss=new Cat(4,"puss");
		catList.add(tom);
		catList.add(tibbles);
		catList.add(puss);
		
		Object clonedCatList=catList.clone();
		System.out.println(clonedCatList);
		ArrayList<Cat>clonedCat=(ArrayList<Cat>)catList.clone();
		System.out.println(clonedCat);
		*/
		
		ArrayList<Integer>intList=new ArrayList<Integer>();
		intList.add(5);
		intList.add(150);
		intList.add(250);
		intList.add(350);
		intList.add(350);
		intList.add(350);
		Integer myInt=1500;
		intList.add(myInt);
		intList.add(myInt);
		System.out.println("before removal");
		System.out.println(intList);
		intList.remove(1);//index removes number 150
		//still index, gets index of where 350 is
		intList.remove(intList.indexOf(350));//first instance of 350
		//removes the Integer wrapper myInt that contains the value 1500
		intList.remove(myInt);//removes first instance of 1500
		System.out.println("after removal");
		System.out.println(intList);
	}
	
	static void ex9() {
		ArrayList<Cat>catList=new ArrayList<Cat>();
		Cat tom=new Cat(2,"tom");
		Cat tibbles=new Cat(4,"tibbles");
		Cat puss=new Cat(4,"puss");
		catList.add(tom);
		catList.add(tibbles);
		catList.add(puss);
		//deep copy
		ArrayList<Cat>copyCatList=catList;
		/*
		 * copyCatList and catList refer to the same list of
		 * cats
		 */
		//are they the same object
		System.out.println(copyCatList==catList);//true
		//do the two lists have the same values
		System.out.println(copyCatList.equals(catList));//true
		
		ArrayList<Cat>shallowCatList=new ArrayList<Cat>();
		//shallow copy
		/*
		 * adding all the contents of the catList ArrayList to
		 * the shallowCatList, so the two lists now have the same
		 * cats, but are different lists
		 */
		shallowCatList.addAll(catList);
		//false as two different lists
		System.out.println(shallowCatList==catList);//false
		//this will be true as both lists have the same cats
		System.out.println(shallowCatList.equals(catList));//true
		/*
		 * the clone method in the arrayList class 
		 *  returns a object reference to an arrayList object.
		 *  here I am assigning the returned catList.clone object
		 *  to the object clonedCatlist
		 */
		Object clonedCatList=catList.clone();
		//only has access to methods common across all objects
		System.out.println(clonedCatList);
		
	//cast it to be of reference type ArrayList<Cat>
		ArrayList<Cat>clonedCat=(ArrayList<Cat>)catList.clone();
		//clonedCat  now has access to all methods of arraylist class
		System.out.println(clonedCat);
		//cloning is a shallow copy, different lists, same values
		System.out.println(clonedCat==catList);//false
		System.out.println(clonedCat.equals(catList));//true	
	}
	
	static void ex10() {
		ArrayList<String>nameList=new ArrayList<String>();
		
		nameList.add("pat");
		nameList.add("tom");
		nameList.add("mary");
		nameList.add("kate");
		nameList.add("kate");
		System.out.println("before remove");
		System.out.println(nameList);
		/*
		 * remove all instances of "kate" and replace with
		 * linda
		 */
		for(int i=0;i<nameList.size();i++) {
			//if the name is kate
			if(nameList.get(i).equals("kate")) {
				//this will say removing kate, twice
				System.out.println("removing "+nameList.get(i));
				//this will remove kate
				nameList.remove(i);
				//this will replace kate with linda
				nameList.add(i, "linda");
			}
		}
		System.out.println("after remove ");
		System.out.println(nameList);
		//deletes all names from our arraylist
		nameList.clear();
		//populating our arrayList
		nameList.add("pat");
		nameList.add("tom");
		nameList.add("mary");
		nameList.add("kate");
		nameList.add("kate");
		System.out.println("before remove 2");
		System.out.println(nameList);
		/*
		 * ListIterator is a class that is used specifically for
		 * going through any type of list, used a lot with 
		 * databases
		 */
		ListIterator<String>strIterator=nameList.listIterator();
		//this will just print out the address of the object
		System.out.println(strIterator);
		/*
		 * hasNext just checks to see are you at the end of your
		 * arraylist, if you are at the last value in your 
		 * arraylist, there is NO next value
		 * hasNext() creates a new Listiterator each time and the
		 * next command advances to the next point in the list.
		 * so we start and we create a new listIterator
		 */
		while(strIterator.hasNext()) {
			System.out.println(strIterator);
			//System.out.println("hello");
			System.out.println("before if");
			if(strIterator.next().equals("kate")) {
				strIterator.remove();
				strIterator.add("Linda");
				System.out.println("inside if");
			}
			//strIterator.hasNext();
			System.out.println("after if");
			
		}
		ArrayList<String> list = new ArrayList<String>();
		list.add("test");
		list.add("one");
		list.add("two");
		ListIterator<String>listIt=list.listIterator();
		while(listIt.hasNext()) {	
			System.out.println("print me before ");
			/*
			 * hasnext does NOT increment the loop, so the 
			 * increment counter does not increment and hence 
			 * will never execute
			 */
			//THIS IS WHAT INCREMENTS THE LOOP
			System.out.println(listIt.next());
			System.out.println("print me after");
			}
	}
	

}
