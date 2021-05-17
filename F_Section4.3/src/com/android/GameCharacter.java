package com.android;

public class GameCharacter {
	
	void fight() {
		System.out.println("general fighting");
	}

}

class Wizard extends GameCharacter{
	//overriden method of the GameCharacter class
	void fight() {
		System.out.println("I fight by magic");
		//wizard accesses the doMagic() method through the
		//fight method
		doMagic();
	}
	
	void doMagic() {
		System.out.println("i love magic");
	}
	
}

class Soilder extends GameCharacter{
	//overriden method of the GameCharacter class
	void fight() {
		System.out.println("I fight by shooting");
	}
	void march() {
		System.out.println("soilder marching");
	}
	
}

class Dragon extends GameCharacter{
	//overriden method of the game character class
	void fight() {
		System.out.println("i fight by breathing fire");
	}
	
	void fly() {
		System.out.println("dragon flying");
	}
}
