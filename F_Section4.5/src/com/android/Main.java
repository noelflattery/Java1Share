package com.android;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
/**
 * Exam objective 3.2 Test equality between Strings and other objects
 * using == and equals
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hank";
		String str2="hank";
		String str3="walter";
		String str4="skylar";
		//this is the same string, as "hank" is in the pool
		//and str2 checks the pool for "hank" and is assigned
		//to the object contained "hank" in the pool
		System.out.println(str==str2);
		/*
		 * the equals() method checks the value of the string,
		 * and if they have the same value, this will return
		 * true
		 */
		System.out.println(str.equals(str2));
		str="mary";
		//this mary is unique, as when you use new keyword, str2
		//does not check the pool
		str2=new String("mary");
		System.out.println(str==str2);//false
		/*
		 * the equals() method in the string class, checks the value
		 * of the string, both strings have the word "mary" only
		 * so this is true
		 */
		System.out.println(str.equals(str2));
		/*
		 * one string says "mary", the other strings says "skylar"
		 * so there are different values in the string, so this
		 * returns false
		 */
		System.out.println(str.equals(str4));//
		Object obj=new Object();
		obj.equals(str2);
		/*
		 * the string class overrides the equals() method from
		 * the object, because the equals() method only returns true
		 * if they are the same object
		 */
		
		Dog myDog=new Dog("spot",2);//dog galway
		Dog myDog2=new Dog("spot",2);//dog Dublin
		Dog myDog3=myDog2;//dog Dublin
		/*
		 * the Dog class DOES NOT OVERRIDE the equals method, so that
		 * means it takes it's equals() from the object class, so it
		 * only returns true if they are the same object
		 */
		System.out.println("mydog2 and mydog3 "+myDog2.equals(myDog3));
		/*
		 * this returns false because the Dog class uses the equals()
		 * method from the object class and this only returns true
		 * if the two dogs are the same dog
		 */
		System.out.println("myDog and myDog2 "+myDog.equals(myDog2));
		/*this is what the object class equals method looks like
		 * public boolean equals(Object obj){
		 * 	return (this==obj)
		 * }
		 */
		Cat cat1=new Cat("tibbles",2);
		Cat cat2=new Cat("tibbles",2);
		Cat cat3=new Cat("fluffy",3);
		Cat cat4=cat3;
		
		System.out.println("checking cat1 and cat2");
		//returns true both cats are called tibbles and are 2
		System.out.println(cat1.equals(cat2));
		System.out.println("checking cat3 and cat4 ");
		//returns true as cat3 and cat4 are the same cat
		System.out.println(cat3.equals(cat4));
		System.out.println("checking cat2 and cat3");
		//returns false as cat2 and cat3 have different ages and names
		System.out.println(cat2.equals(cat3));
		
		cat1=new Cat("tibbles",23);
		cat2=new Cat("fluffy",5);
		cat3=new Cat("beezer",2);
		cat4=new Cat("buster",3);
		Cat cat5=new Cat("beezer",2);
		Cat cat6=new Cat("beezer",3);
		Cat cat7=new Cat("harry",7);
		
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(cat1);//tibbles 23
		catList.add(cat2);//fluffy 5
		catList.add(cat3);//beezer 2
		catList.add(cat4);//buster 3
		catList.add(cat5);//beezer 2
		catList.add(cat6);//beezer 3
		catList.add(cat7);//harry 7
		System.out.println("before remove");
		System.out.println(catList);
		System.out.println(
				catList.get(2).equals(catList.get(4)));
		catList.remove(6);//this will remove harry the cat
		catList.remove(cat1);//this will remove our first cat
		System.out.println("after first remove");
		System.out.println(catList);
		/*
		 * this will remove the first instances of beezer
		 * with an age of 2 from the arrayList of cats.
		 * the remove() method uses the equals() method
		 * of the Cat class to find a particular cat with
		 * certain atributes (name and age). in this case
		 * it is looking for a cat called "beezer" that
		 * is 2 years old.
		 * If the cat class had no equals() method, remove
		 * would use the equals() method from the object
		 * class
		 */
		catList.remove(new Cat("beezer",2));
		System.out.println("after final remove");
		System.out.println(catList);
		/*
		 * the overriden method in the Person class only 
		 * checks the name of the person. So if they
		 * have the same name, equals() returns true
		 */
		Person person1=new Person("percy",34);
		Person person2=new Person("percy",56);
		/*
		 * the overriden method in the person class only
		 * checks the name of the person, so if they have
		 * the same name, equals returns true
		 */
		System.out.println("person equals");
		System.out.println(person1.equals(person2));
		
		

	
		}

	}


