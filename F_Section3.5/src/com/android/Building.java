package com.android;
/*
public class Building {

	double price;
}

class Residental extends Building{
	Residental(double price){
		super();
		this.price=price;
	}
	
}
/*
 * this causes an error as Bungalow calls the default constructor
 * in the residential class that takes no arguments, and we
 * only have a constructor in the residental class that takes
 * a double
 */
//class Bungalow extends Residental{
/*	Bungalow(){
		super();
	}*/
//}
