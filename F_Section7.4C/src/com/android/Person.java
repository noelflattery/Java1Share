package com.android;
/*
 * to create a maternity nurse, we first have to create a person, employee, nurse and 
 * maternity object in that order. So the first constructor to run to completion and throw
 * and exception is the Person constructor. so this has to be the constructor that throws
 * the exception with the lowest precedence. any class that inherits from Person can 
 * throw the same level constructor, or a super class of it
 */
public class Person {
	
	Person()throws ArrayIndexOutOfBoundsException{
		System.out.println("Person created");
	}

}

class Employee extends Person{
	Employee()throws IndexOutOfBoundsException{
		System.out.println("Employee created");
	}
}

class Nurse extends Employee{
	Nurse()throws RuntimeException{
		System.out.println("nurse created");
	}
}

class Maternity extends Nurse{
	Maternity()throws Exception{
		System.out.println("Maternity nurse created");
	}
}

class Midwife extends Maternity{
	Midwife()throws Exception{
		
	}
}
