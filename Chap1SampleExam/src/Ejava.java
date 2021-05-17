import java.oca.Guru;

public class Ejava {
	/*
	 * you can import into a class that is in the default package, but you can't export this class
	 * as you can't import from the default class
	 */
	Guru myGuru;
	
	Ejava(){
		System.out.println("you cannot create an object of this class in another package");
		System.out.println("this class is not in any package so it is placed in the default package");
	}

}
