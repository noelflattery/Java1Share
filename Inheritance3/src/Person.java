/*
 * an abstract class can implment an interface, but it does not have
 * to implement the abstract methods in an interface, but it can if it
 * so chooses
 */
public abstract class Person implements Behaviour{
	@Override
	public void sad() {
		System.out.println("Person sad");
	}

}

abstract class Employee extends Person implements Movement{
	//i choose NOT TO override the walk() method in the Movement interface
}
/*
 * only a concrete class has to implement the abstract methods of an 
 * interface
 */
class Fireman extends Employee{

	@Override
	public void walk() {//Movement interface
		System.out.println("Fireman walking");
		
	}

	@Override
	public void sad() {//Behaviouir interface
		System.out.println("Fireman Sad");
		
	}
	//default method from the Behaviour interface, we do not HAVE TO override this method
	//but we can
	public void happy() {
		System.out.println("Fireman Happy");
	}
	
}

