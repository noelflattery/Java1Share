
public class Dog implements Movement{
	/*
	 * you have to make this method public, as overriding methods CANNOT
	 * BE ANY LESS VISIBLE and the walk method in the interface is public.
	 * any abstract methods in an interface have to be public
	 */
	public void walk() {
		System.out.println("Dog walking");
	}
	
	static void pack() {
		System.out.println("static pack method");
	}

}

class collie extends Dog{
	
}
