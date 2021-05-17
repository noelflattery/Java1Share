package com.android;

public class Soilder {
	static int counter=0;
	int id;
	Soilder(){
		counter++;
		id=counter;
	}
	
	void fight() {
		System.out.println("soilder "+id+" is fighting");
	}

}
