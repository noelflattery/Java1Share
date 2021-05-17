import java.util.concurrent.SynchronousQueue;

public interface Conditions {
	int condNum=56;
	
	void hungry();
	void thirsty();
	void tired();
	
	static void panic() {
		System.out.println("static panic");
	}
}
/*
 * an interface can inherit from an inteface
 */
interface Conditions2 extends Conditions{
	/*
	 * it inherits all of the abstract methods
	 * all variables
	 * it DOES NOT inherit the static methods
	 */
	void proCreate();
}
