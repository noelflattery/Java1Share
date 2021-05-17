import java.util.concurrent.SynchronousQueue;

public interface Movement {
	/*
	 * all variables declared in an interface are FINAL and STATIC and
	 * PUBLIC
	 */
	int moveInt=45;
	public static final int moveInt2=67;

	/*
	 * in java 8 two featurs were introduced to interfaces, first feature
	 * is setting a default method in an interface
	 * second feature is allowing static methods in an interface
	 */
	//standard abstact method in an interface
	/*
	 * all methods, by default, in an interface are abstract and public
	 * which means any class that implements an interface has to provide
	 * implementation for these methods. Also they cannot be any LESS VISIBLE
	 * .any class that implements walk(), has to make the walk method public
	 */
	void walk();
	//implicitly the walk method looks like the below
	//public abstract void walk();
	/*
	 * default implementation for a method
	 * When defining a deafault  method in an interface you have to use the 
	 * keyword default, and you have to give the method a body{}.
	 * when you define a default method in a interface, you do NOT have to
	 * override it in the implementing class, BUT YOU CAN
	 */
	default void run() {
		System.out.println("I am running");
	}
	/*
	 * static methods have to have a body and can only be called in a static
	 * way.
	 * only way to call a static method in an interface is name of the interface
	 * followed by name of method
	 */
	static void skip() {
		System.out.println("Dogs skipping");
	}

}

interface Movement2 extends Movement{
	
}
