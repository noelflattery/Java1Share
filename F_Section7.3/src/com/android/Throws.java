package com.android;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {
	
	void readFile(String file)throws FileNotFoundException{
		boolean found=findFile(file);
		if(!found)
			throw new FileNotFoundException("you are missing the file "+file);
		else
			System.out.println("File found");
	}
	
	boolean findFile(String file) {
		
		//return true;
		return false;
	}
	/*
	 * I do not need to put in a "throws" clause in the method signature, as
	 * you do not HAVE TO DEAL with a runtimeException
	 */
	void throwRuntime() {
	
		throw new NullPointerException();
	//	System.out.println("unreachable code");
	}
	/*
	 * an error is a runtimeException, which means we do not have to deal it
	 * you can "throws" more than one exception
	 * you can have more than multiple errors or exception in the "throws" clause
	 * order exception are written does not matter
	 * 
	 */
	void throwMore()throws Exception,NullPointerException,Error{
		throw new Error();
		/*
		 * as soon as an error or exception, of any type, is generated inside
		 * a method, and if it's not in a try catch block, our method will exit
		 * at this point. so at the line "throw new Error()" our method will
		 * exit. So any code after "throw new Error" is unreachable, and
		 * if  code is unreachable in java, the code will not compile
		 */
		//System.out.println("print me");
		//throw new Exception();
		//throw new NullPointerException();
	}
	/*
	 * an Error is a runTimeException, so calling this method does not need to
	 * be in a try/catch block
	 */
	void method1()throws Error{
		System.out.println("method1 called");
	}
	/*
	 * a Exception is a Checked exception
	 */
	void method2()throws Exception{
		System.out.println("Method 2 called Exception");
	}
	/*
	 * Throwable is a superclass of all exceptions and errors and is in itself
	 * a checked exception
	 */
	void method3()throws Throwable{
		System.out.println("method 3 called throwable");
	}
	/*
	 * this class and all of the subclasses of it are RuntimeExceptions
	 */
	void method4()throws RuntimeException{
		System.out.println("method 4 called RuntimeException");
	}
	/*
	 * this is a sub class of Exception, so is a checked exception and is basically
	 * a superclass for all classes that deal with file handling. So all subclasses
	 * of this are also checked exceptions
	 */
	void method5()throws IOException{
		System.out.println("method 5 called IOException");
	}
	/*
	 * this is a sub class of IOException, which means it is a checked exception
	 */
	void method6()throws FileNotFoundException{
		System.out.println("method 6 called FileNOtFoundException");
	}
	
	void method7()throws Exception{
		throw new Exception("message in exception");
	}

}
