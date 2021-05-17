package com.android;

public class Bird implements Manners<String>{

	@Override
	public boolean test(String t) {
		System.out.println("bird test method");
		return false;
	}

}

class Cat implements Manners<Employee>{

	@Override
	public boolean test(Employee t) {
		System.out.println("cat test method");
		return false;
	}
	
}
