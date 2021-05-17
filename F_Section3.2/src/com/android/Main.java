package com.android;
/**
 * Exam Objective 2.4 Explain an objects lifecycle (creation,
 * dereference by reassignment and garbage collection)
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * declares a variable reference of type person. IT
		 * DOES NOT CREATE A PERSON
		 */
		Person paul;
		/*
		 * an object is only created when the new keyword is used
		 * this is Person X
		 */
		Person pauline=new Person();//Person X
		//paul and pauline are the same person
		paul=pauline;
		Person patsy;
		/*
		 * patsy and paul are the same, which means pauline, paul
		 * and patsy are the same person which is person x
		 */
		patsy=paul;
		//all three now refer to three new different people
		pauline=new Person();//Person y in Dublin
		patsy=new Person();
		paul=new Person();//Person T in Cork
		/*
		 * pauline, patsy or paul now no longer refer to person x
		 * so person x is liable for garbage collection.
		 */
		//derefencing by re assignment

		/*
		 * paul is the Person T in cork, Pauline is now the
		 * same person 
		 * Person Y in Dublin no longer has a name (reference)
		 * so you can't get at it, so it is liable for garbage
		 * collection
		 */
		pauline=paul;
		//paul is just a name, it does not refer to a person
		paul=null;
		
		/*
		 * create four animals for our Zoo
		 */
		Monkey monty = new Monkey();
		Elephant nellie=new Elephant();
		Lion leo = new Lion();
		Zebra zed = new Zebra();
		System.out.println("id of monty the monkey is "+monty.id);
		/*
		 * creating a zoo object that takes our four previously 
		 * creating animals
		 */
		Zoo myZoo=new Zoo(monty,leo,nellie,zed);
		/*
		 * you now have two references to the one monkey, or two ways
		 * to get at the same monkey, monty and myZoo.monty, they
		 * both have the same id as they are the same monkey
		 */
		System.out.println("id of monkey in zoo is "+myZoo.monty.id);
		/*
		 * monty now refers to a new monkey and a different monkey
		 * to the monkey in the zoo
		 */
		monty = new Monkey();
		nellie=new Elephant();
		leo = new Lion();
		zed = new Zebra();
		/*
		 * The monkey at the zoo is the same monkey, the monkey
		 * Monty is a different monkey as we can see as they
		 * have different id's
		 */
		System.out.println("id of monkey in zoo is still "+myZoo.monty.id);
		System.out.println("id of new monkey is "+monty.id);
		/*
		 * the monkey at the zoo now refers to the new monkey, which
		 * means the original monkey now cannot be referred too and
		 * is liable for garbage collection. both monty and the monkey
		 * in the zoo are the same new monkey
		 */
		myZoo=new Zoo(monty,leo,nellie,zed);
		System.out.println("id of monkey in zoo is "+myZoo.monty.id);
		System.out.println("id of new monkey is "+monty.id);
	}

}
