package com.android;
/*
 * the Cat class implements the Behaviour interface with the StringBuilder
 * data type. that means in the Behaviour interface, the data type K, 
 * becomes the datatype StringBuilder. wherever we see the word "K" by
 * itself in the Behaviour, it now refers to the data type "StringBuilder
 */
public class Cat implements Behaviour<StringBuilder>{

	@Override
	public void angry(String myString) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void happy(StringBuilder myK) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sad(Dog myDog) {
		// TODO Auto-generated method stub
		
	}

}
