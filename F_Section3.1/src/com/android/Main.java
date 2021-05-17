package com.android;
/**
 * Exam objective 1.1 Define the scope of variables
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local myLocal=new Local();
		Local myLocal2=new Local();
		myLocal.address="Dublin";
		myLocal2.address="Cork";
		myLocal.accessLocal(4);
		
		System.out.println("address for myLocal is "+
		myLocal.address);
		
		System.out.println("address for myLocal2 is "+
				myLocal2.address);
		//accessing a static in a non static way
		/*
		 * using a object to access a static variable, which
		 * is NOT RECOMMENDED
		 */
		System.out.println(myLocal.courseId);
		System.out.println(myLocal2.courseId);
		myLocal.courseId=345;
		System.out.println(myLocal.courseId);
		System.out.println(myLocal2.courseId);
		/*
		 * ACCESSING IN A STATIC WAY
		 * name of the class, followed by the name of the static
		 * 
		 */
		System.out.println("accessing in static way "+
		 Local.courseId);
		
		Pupil paul=new Pupil("Paul",21);
		Pupil pauline=new Pupil("Pauline",19);
		paul.eat();
		pauline.eat();
		//accessing the static variable courseId in a static way
		System.out.println(Pupil.courseId);
		//accessing the static variable courseId in a non static way
		paul.courseId=11111;
		paul.eat();
		pauline.eat();
		/*
		 * I do not have to create a pupil to access the static method
		 * takeCourse(), as this method applies to all pupils, not
		 * just ONE. so it follows you can't access an individual
		 * pupils name or age
		 */
		Pupil.takeCourse();
		/*
		 * calling the static takeCourse in a non static way
		 * which is not recommended
		 */
		paul.takeCourse();
		//double dnum=Math.random();
		
		Phone myPhone=new Phone();
		System.out.println("Before method call");
		System.out.println(myPhone.name);
		System.out.println(myPhone.weight);
		myPhone.dialup();
		System.out.println("After method call");
		System.out.println(myPhone.name);
		System.out.println(myPhone.weight);
	//	myPhone.dialup();
		
		
		
		
		

	}

}
