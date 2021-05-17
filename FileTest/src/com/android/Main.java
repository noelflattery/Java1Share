package com.android;

import java.io.File;

public class Main {

	public static void main(String[] args) {
			File myFile=new File("myFile.txt");
		//File myFile=new File("C:/great/mighty/entirely/myFile.txt");
		
		try {
			System.out.println(myFile.createNewFile());
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}

	}

}
