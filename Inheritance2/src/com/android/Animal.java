package com.android;

public class Animal {
	
	int age=12;
	String name="andy";
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}
	
	Animal(){
		super();//this is the call to the object class constructor
		System.out.println("Animal Constructor called");
	}
	
	void drink() {
		System.out.println("Animal drinking");
	}
	
	void eat() {
		System.out.println("Animal eating");
	}
	
	void fight() {
		System.out.println("Animla fighting");
	}
	
	

}
class Dog extends Animal{
	String colour="red";
	double weight=23.5;
	@Override
	public String toString() {
		return "Dog [colour=" + colour + ", weight=" + weight + "]";
	}
	
	Dog(){
		//the call to another constructor HAS TO be the first thing in a constructor
		super();//call to the superclass constructor is implicitly here
		System.out.println("Dog constructor called");
	}
	@Override
	void drink() {
		System.out.println("Dog drinking");
	}
	//own Dog method
	void pant() {
		System.out.println("Dog panting");
	}
		
	}//end of Dog class
class Collie extends Dog{
	String owner="kate";
	boolean sex=true;
	@Override
	public String toString() {
		return "Collie [owner=" + owner + ", sex=" + sex + "]";
	}
	
	Collie(){
	//	eat();
		super();
		System.out.println("Collie constructor called");
	}
	@Override
	void eat(){
		System.out.println("collie eating");
	}
	void grooming() {//own method grooming
		System.out.println("collie grooming");
	}
	
	static void pack() {
		System.out.println("collie pack");
	}
}

