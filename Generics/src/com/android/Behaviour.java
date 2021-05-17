package com.android;
/*
 * any class that implements this interface, needs to provide a data type
 * that k will become
 * so for instance 
 * Class Cat implements Behaviour<String>{
 * this means that
 * void happy(K myK) becomes void happy(String myK)
 * }
 */
public interface Behaviour<K> {
	/*
	 * this  method takes a string and can take nothing else
	 */
	void angry(String myString);
	/*
	 * this method has a generic data type, so it can take ANY
	 * OBJECT (does not take primitive data types)
	 */
	void happy(K myK);
	/*
	 * this method takes a Dog or a sub class of Dog and nothing
	 * else
	 */
	void sad(Dog myDog);

}
