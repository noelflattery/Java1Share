package com.android;

public class Animal {
	
	Animal(){
		System.out.println("Animal Constructor");
	}
	
	void eat()throws Exception{
		System.out.println("animal eat that throws exception");
	}

}

class Dog extends Animal{
	
	Dog(){
		System.out.println("Dog constructor");
	}
	
	/*
	 * when overriding a method, that throws an exception you can throw the same exception
	 * or a subclass of that exception
	 */
	@Override
	void eat()throws RuntimeException{
		System.out.println("dog eat that throws runtimeException");
	}
}

class Collie extends Dog{
	
	Collie()throws Exception{
		System.out.println("collie constructor with exception called");
	}
	/*
	 when a method throws NO exception, that is  considered a subclass of RuntimeException
	 */
	@Override
	void eat(){
		
	}
}
