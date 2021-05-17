package com.android;
/*
 * if an IndexOutOfBoundsException was generated in this constructor, it would
 * be thrown back to whever the vehcile is being created. No actual excpetion is generated
 * in this constructor, and it's a runtimeexcpetion, so this means when we create a 
 * vehcile the code will compile, the code will not crash
 */
public class Vehicle {
	Vehicle()throws IndexOutOfBoundsException{
		System.out.println("Vehicle constructor");
	}

}

class Car extends Vehicle{
	
	Car()throws ArrayIndexOutOfBoundsException{
		System.out.println("Car Constructor");
	}
}
class Ferrari extends Car{
	Ferrari()throws Exception{
		System.out.println("Ferrari Constructor");
	}
}
