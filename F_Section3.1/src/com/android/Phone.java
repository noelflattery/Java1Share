package com.android;

public class Phone {
	/*
	 * can't have two variables of the same name, even if one
	 * is static and one is an ordinary instance variable
	 */
	String name="apple";
	/*every phone is going to have this modelId
	 * 
	 */
	static int modelId=122;
	//static String name="Samsung";
	/*
	 * this means that every phone is going to be black
	 */
	static String colour="Black";
	/*
	 * can't have two variables in the same scope with same name even#
	 * if they have different types, as in here one is an int
	 * the other is a double
	 */
//	int weight;
	double weight=2.3;
	/*
	 * you can't have a local variable the same name as a method
	 * parameter
	 */
/*	void dialUp(int number) {
		double number=0;
	}*/
	
	void dialup() {
		System.out.println("name of phone is "+name);
		System.out.println("weight of phone is "+weight);
		/*local variables with the same name as the instance or
		 * class variables it allowed. this is called 
		 * SHADOWING. remember that the variable name and weight
		 * are LOCAL variables, meaning they only apply to inside
		 * these curly brackets, and you can't get at they're 
		 * value outside of these curly brackets
		 * if we choose to omit "String" from the name, we will
		 * then be referring to the "name" of the phone, and we
		 * will be changing the name of the phone that called
		 * this method (do that and see phone name is changed
		 * to samsung back in main). 
		 */
		String name="samsung";
		double weight=20.0;
		
		System.out.println("new name is "+name);
		System.out.println("new weight is "+weight);
		/*
		 * from this point onwards IN THIS METHOD, if we want
		 * to refer to the name of the phone, we have to go
		 * this.name
		 * if we want to refer to the weight of the phone we have to go
		 * this.weight
		 */
		System.out.println(this.name);
		System.out.println(this.weight);
		
		{/*
		can't create a static variable inside a method. colour
		is shadowing the static String colour
		this colour is local to just these curly brackets. as 
		soon as we are outside the curly brackets, we are talking
		about the colour of the phone, which is "Black"
		*/
			String colour="blue";
			System.out.println(colour);
		}
		//this is the colour of the phone
		System.out.println(colour);
	}//end of method
	
	void call() {
		System.out.println(weight);//weight of one particular phone
		System.out.println(colour);//colour of all phones
		System.out.println(modelId);//modelId of all phones
		System.out.println(name);//name of one particular phone
	}

}
