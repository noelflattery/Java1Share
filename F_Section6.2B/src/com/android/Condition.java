package com.android;

public interface Condition {
	void hungry();
	void heat();
	default void shelter() {
		System.out.println("shelter in condition");
	}

}

interface Condition2{
	void thirsty();
	void hungry();
}
/*
 * an interface can extend many interfaces, unlike a class
 * both Condition and Condition3 both have a abstract method heat().
 * a class can implement both interfaces and not cause any conflict
 * as heat() is an abstract method and has no implementation. so 
 * any class implementing these two interfaces Have TO PROVIDE 
 * implementation for the heat() method as it is a abstract class
 */
interface Condition3 extends Condition,Condition2{
	void sleep();
	void thirsty();
	void heat();
	default void shelter() {
		System.out.println("shelter in condition2");
	}
}
