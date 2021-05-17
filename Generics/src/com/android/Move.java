package com.android;

public interface Move<K> {
	void walk(K myK);
	default void run() {
		System.out.println("I am running");
	}

}
