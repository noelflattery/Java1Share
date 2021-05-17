import java.util.concurrent.SynchronousQueue;

public interface Behaviour {
	
	public void sad();
	/*
	 * default has NOTHING TO DO with how the default level access, there is
	 * NO keyword for default level access
	 */
	public default void happy() {
		System.out.println("I am happy");
	}

}
