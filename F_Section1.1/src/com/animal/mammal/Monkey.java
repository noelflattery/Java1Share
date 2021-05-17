package com.animal.mammal;

import com.android.*;

public final class Monkey extends Person implements Behaviour{
	final int num=34;
	

	@Override
	public void happy() {
		System.out.println("Monkey happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Monkey Sad");
		
	}
}

class Gorilla{
	
}

class Chimp{
	
}
interface mood{
	
}

interface inter2{
	
}
