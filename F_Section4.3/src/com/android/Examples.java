package com.android;

public class Examples {
	
	static void ex1() {
		/*
		 * this creates an array of ints of size 4, size always
		 * goes on the right hand side
		 */
		int[]myArray=new int[4];
		//bracket be in a different position
		int myArray2[]=new int[4];
		//this is not correct
		//int myArray3[]=new[4]int;
		/*
		 * once the size of the array has been set, it cannot
		 * be changed. if you attempt to place more numbers
		 * than are allowed in the array, we get 
		 * arrayIndexOutOfBounds Exception
		 * array numbering starts at 0
		 */
		myArray[0]=4;
		myArray[1]=7;
		/*
		 * there is only 4 postions in our array, so we can't
		 * assign something to the fifth postion as we are trying
		 * to do here, as fifth position does not exist
		 */
		//myArray[4]=89;
		/*
		 * by default numeric arrays are 0 if given no value
		 * just two single quotes with nothing between for characters''
		 * false for booleans
		 * null for Strings and objects
		 */
		System.out.println(myArray2[1]);
		//array of size 2
		double dArray[]=new double[] {3.4,5.6};
		//array of size 3
		double dArray2[]= {3.4,7.8,9};
		//if we want to get lenght of array, we go .length
		System.out.println(dArray2.length);
		/*
		 * an array is an object, we can assign one array to
		 * another
		 * copyArray and dArray are now the same object
		 * with the same values
		 */
		double[]copyArray=dArray;
		System.out.println(copyArray==dArray);
		
		dArray2[0]=12.34;
		//want to change all three numbers of dArray2 at same time
		dArray2=new double[] {34.56,78.99,78.45};
		/*
		 * can't use this method to assign values all at once
		 * to a pre existing array
		 */
		//dArray2= {45.6,77.98,33}
		//print out arrays
		System.out.println(dArray2[0]);
		System.out.println(dArray2[1]);
		System.out.println(dArray2[2]);
		System.out.println("using a loop to print out array");
		//usually use a for to print out arrays
		for(int i=0;i<dArray2.length;i++) {
			System.out.println("loop "+dArray2[i]);
		}
		/*
		 * if we just want to display items in an array, we
		 * can use an enhanced for loop
		 */
		System.out.println("using enhanced for loop");
		for(double dnum:dArray2) {
			System.out.println("enhanced loop "+dnum);
		}
		
		String[]names= {"noel","patsy","nora"};
		for(String name:names) {
			System.out.println(name);
		}
		//can't assign values with an enhanced for loop
		int counter=0;
		for(double d:dArray) {
			System.out.println(d);
		//	d=d+1;
		//	dArray[counter]=d+1;
		//	counter++;
			
		}
		//still contains same values
		for(double d:dArray) {
			System.out.println(d);
		}
		
		int[]numArray=new int[7];
		//populate array using a for loop
		for(int i=0;i<numArray.length;i++) {
			numArray[i]=i+2;
		}
		for(int num:numArray)
			System.out.println(num);	
	}
	
	static void ex2() {
		/*
		 * two dimensional arrays, 4 row, 2 coloumns
		 */
		int twoDarray[][]=new int[4][2];
		int[][]twoDarray2=new int[3][3];
		double[]doubleD[]=new double[3][4];
		String [][]names= {
				/*
				 * each row needs to have it's own set of
				 * curly brackets, as each row is an array
				 * each row has to seperated by commas
				 */
				{"noel","mick","kevin"},//first row
				{"patrica","kate","mary"}//second row
		};
		
		System.out.println(names[0][0]);
		System.out.println(names[0][1]);
		
		System.out.println(names[1][0]);
		
		//to print them all out
		System.out.println("print all ");
		System.out.println(names[0][0]);//noel
		System.out.println(names[0][1]);//mick
		System.out.println(names[0][2]);//kevin
		System.out.println(names[1][0]);//patrica
		System.out.println(names[1][1]);//kate
		System.out.println(names[1][2]);//mary
		/*
		 * to display all elements of a two dimensional array we
		 * need to create a inner loop/nested loops;
		 * the outer loop takes care of the rows, and will loop
		 * 2 times. the inner loop takes care of the columns and
		 * will loop 3 times
		 */
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println("name is "+names[i][j]);
			}
		}
		//assigning a value directly into a two dimensional array
		names[0][1]="Terry";
		
		int[][]int2d=new int[4][3];
		//populates our two dimensional array
		for(int i=0;i<int2d.length;i++){
			for(int j=0;j<int2d[i].length;j++){
				int2d[i][j]=i+j;
				}
			}
		//print out our two dimensional array of ints
		for(int i=0;i<int2d.length;i++){
			System.out.println("row "+i);
			for(int j=0;j<int2d[i].length;j++){
				System.out.println("number is "+int2d[i][j]);
				}
			}
		System.out.println("only printing first of each row");
		for(int i=0;i<int2d.length;i++) {
			System.out.println(int2d[i][0]);
		}
		
		//three dimesional array
		/*
		 * this is an array of three 2 dimensional arrays,
		 * and each 2 dimensional array is an array of 
		 * two ints
		 * this is 3 two dimensional arrays of 4 one dimensional
		 * array of 2 ints
		 */
		int[][][]threeD=new int[3][4][2];
		for(int i=0;i<threeD.length;i++) {//this will loop 3 times
			for(int j=0;j<threeD[i].length;j++) {//this will loop 4 times
				for(int k=0;k<threeD[i][j].length;k++) {//this will loop 2
					threeD[i][j][k]=i+j+k;
				}
			}
		}
		
		for(int i=0;i<threeD.length;i++) {//this will loop 3 times
			for(int j=0;j<threeD[i].length;j++) {//this will loop 4 times
				for(int k=0;k<threeD[i][j].length;k++) {//this will loop 2
					System.out.println("3d num is "+threeD[i][j][k]);
				}
			}
		}
		
		
		}//end of ex2
	
	static void ex3() {
		/*
		 * this is an array of two 2 dimensional arrays,
		 * which each are arrays of one dimensional arrays
		 * which are each an array of three numbers
		 */
		int[][][]threeD= //=new int[2][3][3]
			{//first square brackets
					//our first two dimensional array
				{//second set of square brackets
					//first array
					{23,45,67},//first row
					{3,567,890},//second row
					{654,234,112}//third row
				},
				//our second two dimensional array
				{
					{12,100,8},//first row
					{55,56,1000},//second row
					{9,2345,1}//third row
				}
			};
		//ways of creating arrays
		int numArray[]= {34,56,23};
		int[][]twoD=new int[2][3];
		int[][][]threeD2=new int[3][3][3];
		/*
		 * if no values are initialised in our array a default
		 * value is given to each element in the array.
		 * defaults for numeric types are 0 or 0.0 for floats
		 * and double
		 * for booleans it's false
		 * for chars its a blank
		 * for objects it is null
		 */
		int[]numbers=new int[5];
		for(int num:numbers)
			//will print 5 zero's
			System.out.println("num is "+num);
		//have not populated this array of dogs
		//so every item in the list is given a value of null
		Dog[]dogList=new Dog[2];
		for(Dog d:dogList)
			//will print null twice
			System.out.println("dog is "+d);
		
		Dog[]dogList2= {new Dog(),new Dog()};
		System.out.println(dogList2[0]);//reference first dog
		System.out.println(dogList2[1]);//reference second dog
		//this is just an array references
		//it has no array assigned to it
		int[]intArray;//= {34,56,78};
		//so we can't do this
		//intArray= {45,67,89};
		/*
		 * if you are creating and initialising an array over two
		 * lines you have to use the new keyword as below
		 */
		intArray=new	int [] {67,89};
		/*
		 * this is assigning the array intArray to newArray
		 */
		int[]newArray=intArray;
		/*
		 * this means that newArray and intArray are the same array
		 */
		System.out.println(newArray==intArray);
		
		
		}//end of ex3
	
		static void ex4() {
			Cat[]catList=new Cat[3];
			Cat tibbles=new Cat(2,"tibbles");
			Cat tomCat=new Cat(3,"tomCat");
			Cat fluffles=new Cat(4,"fluffles");
			//adding three cats to existing array
			catList[0]=tibbles;
			catList[1]=tomCat;
			catList[2]=fluffles;
			//using our three cats to create an array of size 3
			Cat catList2[]= {tibbles,tomCat,fluffles};
			
			System.out.println("name of first cat is "+
			catList[0].name);
			
			
			catList[0].eat();//first cat in our list
			tibbles.eat();
			catList[1].eat();//second cat in our list
			tomCat.eat();
			catList[2].eat();//thirid cat in our list
			fluffles.eat();
		System.out.println("looping cats");
			for(int i=0;i<catList.length;i++) {
				System.out.println("name of cat is "+catList[i].name);
				catList[i].eat();
			}
			/*
			 * this will go through each cat in the array and
			 * call the eat method for each cat in the array
			 */
			System.out.println("enhanced for cat");
			for(Cat c:catList)
				c.eat();
			
			House h1=new House(23, 45, "galway");
			House h2=new House(66,78,"dublin");
			House h3=new House(12,55,"cork");
			/*
			 * calls the toString() method of the House class
			 */
			House[]houses= {h1,h2,h3};
			for(House h:houses) {
				System.out.println(h);
			}
		}//end of ex4
		

		static void ex5() {
			Hippo henry=new Hippo();
			Monkey monty=new Monkey();
			Bird betty=new Bird();
			
			henry.drink();//overriden in the Hippo class
			henry.eat();//directly inherited from Animal class
			henry.swim();// is the hippos own method
			
			monty.drink();//overriden in the monkey class
			monty.eat();//from animal class
			monty.climb();//own method
			
			betty.drink();//overriden in the  bird class
			betty.eat();//from animal class
			betty.fly();//own method
			/*
			 * can't create a abstract object, and animal is an 
			 * abstract class
			 */
			//Animal andy;//=new Animal();
			/*
			 * you can have a superclass reference to a sub
			 * class object
			 */
			Animal hipAnimal=new Hippo();
			Animal birdAnimal=new Bird();
			Animal monkAnimal=new Monkey();
			
			hipAnimal.drink();
			hipAnimal.eat();
			hipAnimal.sleep();
		//	hipAnimal.swim()
			
			Car myCar=new Car();
			myCar.drive();//from it's own class
			myCar.move();//from the superclass vehicle
			/*
			 * superclass reference to a subclass object
			 * Vehicle is the superclass, car is subclass object
			 * vCar ONLY HAS access to method first mentioned
			 * in the Animal class, but the Car class can 
			 * override the move method but it can choose not
			 * too
			 */
			Vehicle vCar=new Car();
			/*
			 * not overriden in the Car class so will take it's 
			 * implementation from the Vehicle class
			 */
			vCar.move();
			
			Vehicle vBoat=new Boat();
			/*
			 * move() method is overriden in the Boat class
			 */
			vBoat.move();
			
			Vehicle[]vehicleList=new Vehicle[5];
			Boat boaty=new Boat();
			Car carey=new Car();
			Bike bikey=new Bike();
			Bike myBike=new Bike();
			Vehicle myVehicle=new Vehicle();
			
			vehicleList[0]=boaty;//boat
			vehicleList[1]=carey;//car
			vehicleList[2]=bikey;//bike
			vehicleList[3]=myBike;//bike
			vehicleList[4]=myVehicle;//vehicle
			
			
			for(int i=0;i<vehicleList.length;i++) {
				vehicleList[i].move();
				
				
				//System.out.println(vehicleList[i].getClass().getSimpleName());
			}
			/*
			 * this is an array of four game characters, that
			 * each have they're own fight() method which
			 * overrides the fight() method in the GameCharacter
			 * class
			 * these objects in this array ONLY HAVE access to
			 * a fight() method, as fighting is something that
			 * is common across all game characters.
			 * not flying, not marching, not to do magic
			 */
			GameCharacter[]myGame= {new Wizard(),new Dragon(),
					new Soilder(),new Wizard()};
			System.out.println("my game");
			for(int i=0;i<myGame.length;i++) {
				myGame[i].fight();
			}
			
			GameCharacter gameWizard=new Wizard();
			GameCharacter gameDragon=new Dragon();
			System.out.println("callign outside array");
			/*
			 * this is a GameCharacter reference to a wizard
			 * object, which only has access to a fight() method
			 * and nothing
			 */
			myGame[0].fight();
			/*
			 * this is a GameCharacter reference to a wizard
			 * object, which only has access to a fight() method
			 * and nothing
			 */
			gameWizard.fight();
			//same as above
			myGame[3].fight();
			gameDragon.fight();
			
			Vehicle vBike=new Bike();
			
			vBike.move();//move() method from bike class
			//takes age from super class Vehicle
			System.out.println("age of bike is "+vBike.age);
			/*
			 * if you have a superclass reference to a sub class
			 * object and you have both overriden methods and
			 * shadowed variables (shadowed variables are variables
			 * of the same name in sub and super classes for instance
			 * age in the Vehicle class and age in the Bike class).
			 * the object takes its method implementation from the
			 * sub class (bike) and its variable value (age) from the
			 * super class (age is vehicle is 100)
			 */
			/*
			 * if you the three dogs to an array and then change
			 * one of the original dogs to a different dog, you
			 * can still access the original dog in the array.
			 * so here you have four different dogs you can access
			 * three of which you can access through the array
			 * and one new dog which we can access through the
			 * variable spot
			 */
			Dog spot=new Dog();
			Dog rex=new Dog();
			Dog lassie=new Dog();
			Dog[]dogList= {spot,rex,lassie};
			System.out.println("id of spot is "+spot.id);
			System.out.println("id of first dog in array is "+
			dogList[0].id);
			/*
			 * if you change the names of one of the Dog, the change is 
			 * also reflected in the array of dogs
			 * Dog spot=new Dog();
		Dog rex=new Dog();
		spot.name="spot";
		rex.name="rex";
		Dog[]dogList= {rex,spot};
		
		for(Dog d:dogList) {
			System.out.println(d.name);
		}
		spot.name="benji";
		
		for(Dog d:dogList) {
			System.out.println(d.name);
		}
		spot=new Dog();
		for(Dog d:dogList) {
			System.out.println(d.name);
		}
			 */
			
			spot=new Dog();
			System.out.println("after change");
			System.out.println("id of spot is "+spot.id);
			System.out.println("id of first dog in array is "+
			dogList[0].id);	
			}//end of ex5
		
		static void ex6() {
			//Animal myAnimal=new Animal();
			/*
			 * you can have a array of abstract type, you 
			 * can populate this array with CONCRETE 
			 * subclasses of the abstract super class.
			 * or in this case Animal is an abstract class and
			 * Hippo, Monkey and Bird are CONCRETE subclasses
			 * of Animal. We create a Animal object, because
			 * Animal is abstract and we can't create an abstract
			 * object
			 */
			Animal[]animalList=new Animal[4];
			Hippo henry=new Hippo();
			Monkey monty=new Monkey();
			Bird bridie=new Bird();
			Hippo harry=new Hippo();
			
			animalList[0]=henry;
			animalList[1]=monty;
			animalList[2]=bridie;
			animalList[3]=harry;
			
			for(int i=0;i<animalList.length;i++) {
				animalList[i].drink();
				animalList[i].eat();
				animalList[i].sleep();
			}
			
		}//end of ex6
		
		static void ex7() {
			/*
			 * you can't create an interface object, because
			 * an interface is a purely abstract class
			 */
		//	Behaviour behave = new Behaviour()
			Behaviour[]behaves=new Behaviour[3];
			
			Person percy=new Person();
			Employee eddie=new Employee();
			Dog spot=new Dog();
			Person pat=new Person();
			
			behaves[0]=percy;//a person
			behaves[1]=eddie;//a employee
			/*
			 * the dog class does not implement the behaviour 
			 * interface, so you can't put a dog into this array
			 * of type behaviour 
			 * this array can only have people and employees in
			 * it as these are the only two classes that
			 * implement the Behaviour interface			 */
		//	behaves[2]=spot;
			behaves[2]=pat;//a person
			
			Behaviour behavePerson=pat;
			/*
			 * only methods that are defined in the Behaviour
			 * interface are available in his array
			 * each person and employee has a happy(),mad() and
			 * sad() method
			 */
			for(int i=0;i<behaves.length;i++) {
				behaves[i].happy();
				behaves[i].mad();
				behaves[i].sad();
			}
		}//end of ex7
		
		static void ex8() {
			/*
			 * the Object class is the super class of all others
			 * classes in java. it has limited use and functionality
			 * by itself
			 */
			Object obj=new Object();
			Dog spot=new Dog();
			System.out.println(spot);//same as below
			System.out.println(spot.toString());//same as above
			/*
			 * when you have an array of objects, you can populate
			 * that array with ANY OBJECT, here we have
			 * a Hippo, a Cat, a Integer and a String
			 */
			int[]numArray= {56,78,99,100};
			Object[]objArray= {new Hippo(),new Cat(2,"tibbles"),
					new Integer(1),"hello there",new Dog(),
					numArray};
			/*
			 * however each of these objects in the array can
			 * only call methods that are common across all objects
			 * . The same rule that applies to superclass references
			 * to sub classes objects applies here
			 */
			for(int i=0;i<objArray.length;i++) {
				System.out.println(objArray[i].toString());
			
			
			}
		
		
			
		}
			
			
			
			
			
	
		}

//	


