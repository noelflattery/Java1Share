package com.android;
/**
 * Exam objective 7.5 use  abstract classes and interfaces
 * Exam objective 6.2 apply the static keyword to methods and fields
 * @author noelf
 * open classes in this order to follow program
 * Main
 * Animal
 * Behaviour
 * Ape
 * Flamingo
 *Trainee
 *Person
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog spot=new Dog();
		/*
		 * takes the happy() method from the Dog class. As the Dog 
		 * class overrides the abstract happy() method in the Animal class
		 * A concrete class HAS TO override a abstract method from it's
		 * base class
		 */
		spot.happy();
		/*
		 * takes the sad() method from the Dog class. As the Dog class overrides
		 * the concrete sad() method in the Animal class. You can choose whether
		 * you want to override a concrete method from the base.
		 */
		spot.sad();
		/*
		 * mad() is a concrete method in the abstract Animal class. It is NOT
		 * OVERRIDEN in the Dog class, so this mad() method is taken directly
		 * from the Animal class
		 */
		spot.mad();
		System.out.println("ronnie the rattleSnake");
		RattleSnake ronnie=new RattleSnake();
		//takes the happy method from the RattleSnake Class
		ronnie.happy();
		//takes the bite() method from the Abstract Snake() class
		ronnie.bite();
		//takes the mad() method from the Animal class
		ronnie.mad();
		//takes the sad() method from the Animal class
		ronnie.sad();
		
		Ape andy=new Ape();
		//takes the Jealous()from the Ape class
		andy.jealous();
		//takes the joy() method from the Ape class
		andy.joy();
		//takes the anger() method from the ape class
		andy.anger(23.2, 'a');
		//takes the euphroic() method from the Ape class
		andy.euphoria();
		/*
		 * Ape implements the Behaviour interface, the Behaviour interface
		 * has a methods called nervous() that has a default implementation.
		 * this method is NOT overriden in the Ape class (but it can be) so
		 * it takes the default implementation from the Behaviour interface
		 */
		andy.nervous();
		
		//Ape.statMethod();
		
		Flamingo freddy=new Flamingo();
		/*
		 * Flamingo implements Behaviour, as we know behaviour has a method
		 * called nervous(). in this case the flamingo class OVERRIDES
		 * the nervous()  method (but it does NOT HAVE TOO)
		 */
		freddy.nervous();
		/*
		 * only way to call a static method from an interface is 
		 */
		Behaviour.statMethod();
		/*
		 * when accessing a static variable we do not need to create an 
		 * instance of the class to access it. i.e we do not need to create
		 * a trainee to access the courseCode or courseAddress
		 */
		System.out.println("course code is "+Trainee.courseCode);
		System.out.println("course address is "+Trainee.courseAddress);
		Trainee tom=new Trainee();
		Trainee tania=new Trainee();
		/*
		 * course code for tom and then for tania is the same for both
		 * as courseCode is a static variable that is a class variable
		 * and there is only ONE courseCode for the while class
		 */
		System.out.println("tom's course code is "+tom.courseCode);
		System.out.println("Tania's course code is "+tania.courseCode);
		/*
		 * so if any person changes teh courseCode then it is changed
		 * for everyone
		 */
		tom.courseCode=22222;
		System.out.println("course code for all is now changed ");
		System.out.println("course code for tania is "+tania.courseCode);
		/*
		 * accessing the static method statMethod in the Trainee class
		 * in a static way, which is is the name of the class followed by
		 * the name of the method
		 */
		Trainee.statMethod();
		
		Person pat=new Person(2.5);
		System.out.println("age of pat is "+pat.age);
		/*
		 * can't change the age of pat, as age is final
		 */
		//pat.age=45;
		pat.name="newName";
		pat.name="great";
		
		Trainee tanya=new Trainee();//trainee that lives in roscommon
		tanya=new Trainee();//trainee that lives in Galway
		tanya=tom;
		final Trainee finalTom=new Trainee();//trainee that lives in Dublin
		
	//finalTom=new Trainee();
		finalTom.age=56;
		//null is an object that has no value
		Trainee nullTrainee=null;
		Trainee noTrainee;
		
		/*
		 * every trainee can access the instance method ordMethod()
		 */
		tom.ordMethod();
		/*
		 * can't call an instance method on a null object
		 * both generate a nullpointer exception
		 */
		//nullTrainee.ordMethod();
		//System.out.println("age of null object is "+nullTrainee.age);
		/*
		 * this is using a null object to access a static method
		 * you can use a null object to access a static method as you don't
		 * need a object of the class trainee to call a static method (in
		 * fact you should'nt really access static methods by object
		 * reference)
		 */
		nullTrainee.statMethod();
		
	}

}
