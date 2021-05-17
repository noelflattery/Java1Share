package com.android;

public class Inners {
	
	static void nested() {
		int counter=0;
		for(int i=0;i<5;i++) {
			System.out.println("i is "+i);
			for(int j=0;j<4;j++) {
				System.out.println("j is "+j);
				counter++;
			}
		}
		System.out.println("counter is "+counter);
	}
	
	static void breaking() {
		for(int i=0;i<5;i++) {
			System.out.println("i is "+i);
			for(int j=0;j<4;j++) {
				if(j>=2) {
					/*
					 * this will break out of the INNER LOOP if j is greater 
					 * than or equal to 2
					 */
					break;
				}
				System.out.println("j is "+j);
			}
		}
	}
	
	static void labels() {
		/*
		 * you can label blocks of code. in this example "outer" refers to all
		 * the outer for loop, it is everything that is enclosed in the curly
		 * brackets for the outer loop. "inner" refers to the inner loop and 
		 * everything enclosed within it's curly brackets.
		 * 
		 */
		outer:
			for(int i=0;i<4;i++) {
				System.out.println("i is "+i);
				inner:
					for(int j=0;j<8;j++) {
						if(j>4) {
							break outer;
						}
						System.out.println("j is "+j);
					}
			}
	/*
	 * you can lable any block of code, but  you can really only break or 
	 * continue out of a labeled block of code (not recommended to use goto)
	 */
	myLabel:{
				System.out.println("print me out");
				System.out.println("print me out2");
				
			}
	}


}
