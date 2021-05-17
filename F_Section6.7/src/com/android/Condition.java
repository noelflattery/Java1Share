package com.android;

public interface Condition<T> {
	
	void eat(T t,T t2);
	default void drink(T t) {
		System.out.println(t);
	}
	void sleep(int num,T t);

}
