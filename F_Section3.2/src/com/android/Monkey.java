package com.android;

public class Monkey {
	/*
	 * using a static counter to count the amount of monkey's created
	 */
	static int counter=1;
	//id is a unique identfying number for each monkey
	int id;
	Monkey(){
		/*
		 * each monkey has it's own id, which will be set to whatever
		 * teh counter is when the monkey is created
		 */
		id=counter;
		counter++;
	}

}
