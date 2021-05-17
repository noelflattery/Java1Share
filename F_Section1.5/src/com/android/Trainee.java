package com.android;

public class Trainee {
	int age=34;
	String pps="8999999A";
	/*
	 * These are static variables, also called class variables. The correct
	 * way to access a class variable is the class name followed by the 
	 * variable name .ie
	 * Trainee.courseCode or Trainee.courseAddress. We can access a static
	 * variable via a particular trainees .ie
	 * we have a trainee called tom, we could go 
	 * tom.courseCode, but this is not recommended
	 * A static variable is shared by all members of the class i.e
	 * all trainees have the same courseCode, all trainees have the same
	 * courseAddress.
	 * if you change the courseCode for one trainee, you change it for every
	 * trainee
	 */
	static int courseCode=12345;
	static String courseAddress="GRETB Mervue";
	/*
	 * static methods can only access other static methods and static 
	 * variables
	 */
	static void statMethod() {
		System.out.println("coursecode is "+courseCode);
		System.out.println("courseAddress is "+courseAddress);
/*
 * can't access instance atributes in a static method		
 */
//		System.out.println("age is "+age);
//		System.out.println("pps is "+pps);
		Trainee tom=new Trainee();
		System.out.println(tom.age);
		System.out.println(tom.pps);
	}
	/*
	 * ordinary methods can access both statics and non statics
	 */
	void ordMethod() {
		System.out.println("access static courseCode "+courseCode);
		System.out.println("access instance variable age "+age);
	}

}
