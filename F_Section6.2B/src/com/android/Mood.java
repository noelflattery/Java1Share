package com.android;

public interface Mood {
	void angry();
	
	default void happy() {
		System.out.println("Happy in mood i am");
	}

}

interface Mood2{
	void sad();
	
	default void happy() {
		System.out.println("Happy mood2 so i be");
	}
}
