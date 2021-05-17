package com.android;

public class Cat {
	String name;
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	int age;
	//constructor that takes a String and an int
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//blank Cat constructor
	Cat(){
		
	}
	/*
	 * we are overriding the equals() method from the object class
	 * which means we have to create a method that
	 * returns a boolean
	 * has to be public (has to be public becuase in the base object
	 * class it is public and you can't make a overriden method
	 * any less visible)
	 * has to be called equals
	 * and has to take an object
	 */
	public boolean equals(Object obj) {
		/*]
		 * if they are the same object, return true
		 * "this" refers to the Cat calling the equals method
		 * "obj" refers to the cat being sent to the method
		 */
		if(this==obj) {
			/*
			 * if same object, the method will exit at this point
			 * and return true
			 */
			return true;
		}
		/*
		 * if its not a cat, it can't be equal, this is only 
		 * checking that the object sent to this method is a cat
		 * if its not, then we will return false
		 */
		if(obj instanceof Cat) {
			/*
			 * obj is a object reference to a Cat object so it
			 * does not have access to the name, age or any methods
			 * of the Cat class. so we have to cast obj to be of
			 * type Cat and assign it to a new cat object, which
			 * will then have access to the age and name of the
			 * cat
			 */
		//	obj.eat();//no access
		//	obj.name;//no access
			/*
			 * we create a new cat object by casting our object
			 * refrence to cat object (obj) to be of type Cat.
			 * obj does not have access to the name and age of 
			 * the cat
			 */
			Cat newCat=(Cat)obj;
			System.out.println("newcat age is "+newCat.age);
			System.out.println("newCat name is "+newCat.name);
			/*
			 * name and age refers to age and name of cat that 
			 * called the equals method
			 */
			System.out.println("this cat "+name+" age "+age);
		//	System.out.println("cat sent "+obj.);
			/*
			 * if the two cats have the same age and name
			 * then return true
			 * otherwise return false
			 */
			boolean check= name==newCat.name &&
					age==newCat.age;
			/*
			 * check can be true or false
			 */
			return check;	
		}
		/*
		 * if none of the above returns true, then your answer
		 * will be false
		 */
		return false;
	}
	
	void eat() {
		System.out.println("cat eating");
	}

}
