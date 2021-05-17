package com.android;

public class Trace {
	
	void method1() {
		System.out.println("method 1 called");
		method2();
	}
	
	void method2() {
		System.out.println("Method 2 called");
		method3();
		
	}
	
	void method3() {
		System.out.println("method 3 called");
		int[]numList= {45,67,99};
		System.out.println(numList[4]);
	}

}
