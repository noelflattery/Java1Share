package com.building;
//public class avaiable to all other classes in the application
public class Cat {

	private String name;
}
//default access level class available to other classes in same package
class Siamese extends Cat{
	public int age=34;
	public double weight=9;
	
	public static int siamStat=89;
}
