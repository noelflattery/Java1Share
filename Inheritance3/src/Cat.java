/*
 * a class can only inherit from one class, but a class can implement
 * many interfaces
 */
public class Cat implements Movement,Conditions{

	@Override
	public void hungry() {
		System.out.println("cat hungry");
		
	}

	@Override
	public void thirsty() {
		System.out.println("cat thirsty");
		
	}

	@Override
	public void tired() {
		System.out.println("cat tired");
		
	}

	@Override
	public void walk() {
		System.out.println("cat walking");
		
	}
	@Override
	public void run() {
		System.out.println("cat running");
	}

}
/*
 * this gets all the methods from the cat class
 * if a superclass implments an interface, all of the subclasses also
 * implement the interface
 */
class Persian extends Cat implements Behaviour{

	@Override
	public void sad() {
		System.out.println("Persian sad");
		
	}
	
}
