import java.util.concurrent.SynchronousQueue;

public class Examples {
	static void ex1() {
		/*
		 * the only  way to call a static method in an interface is
		 * the interface name followed by the static  method. the static
		 * method can only be called in a static way.
		 * the class that implements the Movement interface has NO ACCESS
		 * to the static methods contained in the interface
		 */
		Movement.skip();
		Dog spot=new Dog();
		spot.walk();
		spot.run();
		/*
		 * the Dog class has no access to the static method skip() defined
		 * in the Movement interface, even though the Dog class implements 
		 * the movement interface
		 */
	//	Dog.skip();
	//	spot.skip();
		
		System.out.println("accessing it through the movement interface");
		System.out.println(Movement.moveInt);
		
		System.out.println("accessing in a static way through a class that "
				+ "implements the Movement interface");
		//Dog implements Movement
		System.out.println(Dog.moveInt);//accessing in a static way
		System.out.println(spot.moveInt);//accessing in a non staic way
	}
	
	static void ex2() {
		Persian percy=new Persian();
		/*
		 * Cat class implemented the Movement and Conditions interface
		 * the Persian class extending the Cat class and implemented 
		 * the Behaviour. so the persian class implements ALL of the
		 * interfaces
		 */
		percy.run();//movement interface
		percy.sad();//behaviour interface
		percy.hungry();//Conidtions interface
		Cat tibbles=new Persian();
		/*
		 * this above object cannot call the sad() method, as teh sad()
		 * mehtod is not common across all cats
		 */
	}
	
	static void ex3() {
		Flamingo freddie=new Flamingo();
		System.out.println("freddie has access to static numbers");
		System.out.println(freddie.condNum);
		/*
		 * Flamingo implements the Conditions2 inteface which extends
		 * the conditions interface, which means that flamingo has to implement
		 * all the abstract methods from both interfaces and has access to 
		 * the variables of the interface, but has NO ACCESS to the static
		 * methods of the interface
		 */
		//freddie.panic
		//flamingo.panic
	}
	
	static void ex4() {
		/*
		 * this object only has access to methods defined in the Behaviour
		 * interface
		 */
		Behaviour persianBehave=new Persian();
		Behaviour firemanBehave=new Fireman();
		Behaviour birdBehave=new Bird();
		
		persianBehave.happy();
		persianBehave.sad();
		
		firemanBehave.happy();
		firemanBehave.sad();
		
		birdBehave.happy();
		birdBehave.sad();
		/*
		 * flamingo implements Conditions2, which means it has the
		 * abstract methods and variables and default methods from 
		 * conditions and also 
		 * abstract methods and variables and defulat methods from 
		 * conditions2
		 */
		Conditions2 flamConditions2=new Flamingo();
		flamConditions2.hungry();//Conditions interface
		flamConditions2.proCreate();//Conditions2 interface
		
		Behaviour[]behaveArray= {new Persian(),new Fireman(),new Bird()};
		
		behaveArray[1].happy();//happy method for the fireman
		behaveArray[2].sad();//sad method for the bird
		
		
		
	}

}
