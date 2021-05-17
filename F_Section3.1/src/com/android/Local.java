package com.android;

import java.util.concurrent.SynchronousQueue;

public class Local {
	
	/*
	 * these are instance variables, i.e age, weight, height,etc.
	 * we say that the variable "name" is avaliable the full
	 * "length" of the class. a instance varaible is ALWAYS
	 * LONGER than that that of a local variable or a method
	 * parameter. Name is available ANYWHERE IN THE Local class.
	 * Access modifiers DO NOT EFFECT the scope of a variable.
	 * the String  name variable is still avaliable throughout the
	 * Local class
	 */
	private String name="mary";
	protected String address="Galway";
	/*class variables or static variables belong to a class, not
	 * to an individual object, a class variable is shared 
	 * accross all objects (i.e everyone in this course has the
	 * same course id). so there is only ONE copy per class of
	 * this variable, whereas with a instance every object has
	 * it's own copy. i.e every person has an age, weight, height
	 * etc
	 */
	static int courseId=457689;
	/*
	 * the method parameter int num, can only be as long as the
	 * the method accessLocal.
	 * num is available ONLY in the accessLocal method
	 */
	void accessLocal(int num) {
		/*
		 * the number that was sent to this method has now
		 * doubled
		 */
		num=num*2;
		/*
		 * this is a local variable that is available throughtout
		 * the accessLocal method. Local variables can be as 
		 * long as a method parameter, but never longer. In this
		 * case dnum is a "long" as the method parameter num
		 */
		double dnum=24,doubleNum=4.5;
		/*
		 * accessing the string instance variable from this method.
		 * the instance variable "name" is available to all instance
		 * methods
		 */
		name="Paddy";
		System.out.println(this.address);
		/*
		 * dnum is longer than then dnum2
		 * this will not compile as "FORWARD REFERENCING" to local
		 * variables is not allowed. can't access dnum2 before it
		 * is declared
		 */
	//	System.out.println(dnum2);
		double dnum2=2.34;
		int age=21;
		Cat newCat = new Cat();
		if(age>19) {
			/*
			 * this is a local variable that is available only within
			 * these curly brackets
			 */
			double weight=34.5;
			System.out.println("my weight is "+weight);
			Cat tibbles=new Cat();
			newCat=tibbles;
		}
		System.out.println(newCat);
		/*
		 * as soon as we are outside the curly brackets we can no
		 * longer access the weight, as weight is local to the 
		 * above if statement
		 */
	//	System.out.println(weight);
		
		for(int i=0;i<4;i++) {
			/*
			 * the variable i is ONLY available within the the
			 * for loop curly brackets
			 */
			System.out.println("i is "+i);
			/*
			 * when i is 0 and when i is 1, do the following
			 */
			if(i<2) {
				/*
				 * local variable j, which is only available
				 * within the if statement curly brackets.
				 * every variable outside of these curly brackets
				 * is available within here
				 */
				int j=4;
				System.out.println("j is "+j);
				System.out.println("access to i"+i);
				
			}
		}//can only access i inside the for loop
		//System.out.println(i);
		/*
		 * the below clde is always going to run, however the
		 * variable "someThing" will be available ONLY inside the
		 * below curly brackets
		 */
		{
			int someThing=56;
			System.out.println("printing only "+someThing);
			System.out.println(dnum);
		}
	//	System.out.println(someThing);
	}//end of method
	
	void accessMethod(int num,double dnum) {
		/*
		 * method parameters are accessible only in the method
		 * that defines them. The scope of a method parameter may
		 * be as long as that of a local variable or longer, but
		 * it can NEVER be shorter
		 */
		/*
		 * localInt has the same length of as num and dnum, but it
		 * CANNOT be longer
		 */
		int localInt=23;
		System.out.println(localInt);
		double newDouble=3.4;
		System.out.println("num is "+num);
		System.out.println("dnum is "+dnum);
		System.out.println("name is "+name);
		
		for(int i=0;i<2;i++) {
			//i is local to the loop
			System.out.println(i);
			System.out.println(num);
			System.out.println(localInt);
			System.out.println(name);
			System.out.println(weight);
			
		}
			
	}//end of method
	/*
	 * a non static method can access both statics and non
	 * statics
	 */
	void accessStatic() {
		System.out.println(name);//instance variable
		System.out.println(address);//instance variable
		System.out.println(weight);//instance variable
		System.out.println(courseId);//STATIC/CLASS VARIABLE
		
	}//end of method
	/*
	 * a static method CAN ONLY DIRECTLY ACCESS STATICS, so we 
	 * can't access name, address or weight in this method
	 */
	static void accessStatic2() {
		System.out.println(courseId);//static variable
	//	System.out.println(address);
	//	System.out.println(name);
	//	System.out.println(weight);
		Local myLocal=new Local();
		System.out.println(myLocal.address);
		System.out.println(myLocal.name);
		System.out.println(myLocal.weight);
		
	}//end of method
double weight=78;
}
