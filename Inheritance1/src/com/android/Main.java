package com.android;

public class Main {

	public static void main(String[] args) {
		Setter sammy=new Setter();
		/*
		 * sammy gets variables and methods from the Animal, Dog and Setter
		 * class
		 */
		Dog spot=new Dog();
		/*
		 * a Dog will have access to the variables and methods of the Animal
		 * and Dog class
		 */
		Animal andy=new Animal();
		/*
		 * a animl will have access to to only the variables and methods of
		 * the Animal class
		 */
		//age from animal class
		System.out.println("sammy's age "+sammy.age);
		//colour from Dog class
		System.out.println("sammy's colour is "+sammy.colour);
		//prize is from the setter class
		System.out.println("sammy's prize "+sammy.prize);
		//calls run method from the Animal class
		sammy.run();
		//calsl breed method from the Dog class
		sammy.breed();
		/*
		 * setter overrides the drink() method from the Animal class, so it
		 * takes the drink() method from the setter class
		 */
		sammy.drink();
		
		Employee eddie=new Employee();
		Person percy=new Person();
		/*
		 * eat() in the employee class is an overriden method from the eat()
		 * method in the Person class
		 */
		eddie.eat();
		/*
		 * taking it's drink() method from the Person class
		 */
		eddie.drink();
		/*
		 * an employee is the only object that takeBreaks() or calcTax(). as they
		 * are only defined in the Employee class
		 */
		eddie.takeBreaks();
		eddie.calcTax();
		/*
		 * this is a super class reference to a sub class object, which is allowed
		 * the opposite is NOT ALLOWED.
		 * can't have a sub class reference to a super class object
		 * an employee is a person
		 * a person is not an employee
		 */
		Person perEmployee=new Employee();
		//Employee empPerson=new Person();
		perEmployee.eat();
		perEmployee.drink();
		/*
		 * does not have acces to these two methods, becuase these methods are
		 * not common across all people
		 */
		//perEmployee.takeBreaks();
		//perEmployee.calcTax();
		
		
	}

}
