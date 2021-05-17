package com.android;

import java.util.concurrent.SynchronousQueue;

public class Examples {
	
	static void assignmentOperators() {
		/*
		 * =, that is not called "equals", that symbol is the assignment 
		 * operator. this is used for assigning values to a variable.
		 * you can assign both literal and non literal values to a variable
		 * of any type.
		 */
		/*
		 * you can declare as many variables as you like on the one line
		 * of the same type
		 */
		int a=3,b=3;
		/*
		 * can't declare two different variable types on the one line
		 */
	//	double dnum=4,int num=5;
		/*
		 * can't give new values to many existing variables on the same
		 * line, you have to give values on seperates lines
		 */
	//	a=5,b=12;
		a=5;
		b=12;
		
		int c=100;
		/*
		 * read from right to left
		 * c is assigned to b
		 * b is assigned to a
		 * means that a,b and c all have the same value of 100
		 */
		a=b=c;
	//	int a=17;
		boolean bool=false;
		/*
		 * never use the single "=" for comparing values, as this will assign
		 * "true" to the boolean bool. the assignment operator is for giving
		 * variables a value, NOT FOR comparing values
		 */
		if(bool=true) {
			System.out.println("a is 18");
		}
		else
			System.out.println("a is not 18");
		a=100;
		b=10;
		a-=b;//same as a=a-b;
		System.out.println("a is now "+a);
		a*=b;//same as a=a*b;
		System.out.println("a multiple is "+a);
		a+=b;//same as a=a+b;
		System.out.println("a plus is "+a);
					
	}
	
	static void arithmeticOperators() {
		/*
		 * the arithmetic operators consist of some operators we are
		 * familiar with such as =,-,+,/,* and some we might not be
		 * familiar, such as modulus
		 * i++ post increment operator
		 * i-- post decrement operator
		 * ++i pre increment operator
		 * --i pre decrement operator
		 */
		/*
		 * modulus is the remainder when we divide a number by anohter
		 * number. modulus deals with integer division, not division with
		 * doubles which will always give you a decimal place	
		 */
		int num=10;
		int num2=3;
		System.out.println("10 modulus 3 is "+num%num2);
		
		for(int i=0;i<=12;i++) {
			if(i%2<1)
				System.out.println("number is "+i);		
		}
		
		System.out.println("num is "+num);
		System.out.println("num2 is "+num2);
		/*
		 * this first increments or decrments our number and then prints
		 * out the new number
		 */
		System.out.println(++num);
		System.out.println(--num2);
		
		num=10;
		num2=3;
		/*
		 * this first prints out num and num2, so it will print out the 
		 * original values, which werfe 10 and 3. THEN it will increment
		 * num by one and decrement num2 by one
		 */
		System.out.println("post increment "+ num++);
		System.out.println("post decrement "+num2--);
		
		System.out.println("after increment "+num+" num2 is "+num2);
		
		num=10;
		num2=100;
		/*
		 * it adds num and num2 first, to give us sum, then it increments
		 * num2 by one
		 * so sum is 110,
		 * num is 10 and
		 * num2 is 101
		 */
		int sum=num + num2++;
		System.out.println("sum is "+sum);
		System.out.println("num2 is "+num2);
		
		num=10;
		num2=100;
		sum=num + ++num2;
		System.out.println("sum*** is "+sum);
		
		System.out.println("sum 1");
		num=10;
		num2=100;
		sum=++num + ++num2;
		System.out.println("num is "+num+" num 2 is "+num2+" sum is "+sum);
		
		System.out.println("sum 2");
		num=10;
		num2=100;
		sum=++num -num2++;
		System.out.println("sum is "+sum);
		System.out.println("num is "+num+" num 2 is "+num2+" sum is "+sum);
		
		System.out.println("sum 3");
		num=10;
		num2=100;
		sum=++num + num2++ + --num + --num2;
		System.out.println("sum is "+sum);
		System.out.println("num is "+num+" num 2 is "+num2+" sum is "+sum);
		
		System.out.println("sum 4");
		num=10;
		num2=100;
		sum=++num + --num + num++ +num - ++num2 + num2 +num2 -num2;
		System.out.println("sum is "+sum);
		System.out.println("num is "+num);
		System.out.println("num2 is "+num2);
		
		System.out.println("sum 5");
		num=10;
		num2=100;
		sum=num-- + num2++ -num + num2 + ++num - num--;
		System.out.println("sum is "+sum);
		System.out.println("num is "+num);
		System.out.println("num2 is "+num2);
		
		
		int i=0;
		System.out.println("loop sum");
		for(i=0;i<10;i++) {
			int total=++i +i + i++;
			System.out.println("total "+total);
			System.out.println("i is "+i);
			
		}
		System.out.println("final value for i is "+i);
		char char1='a';
		//'a' is the ascii key value 97
		System.out.println("char1 is "+char1);
		//we add one to 97
		char1++;
		//which becomes 98 which is 'b'
		System.out.println("char1 is now "+char1);
		//you can use increment and decrement operators with characters
		char char2=98;
		System.out.println("char2 is "+char2);
		
		System.out.println("char2 +char1 is "+(char1+char2));
		/*
		 * the numeric ascii values of 'a' is 97 and 'b' is 98, so when
		 * we add the two numbers we get 196. 
		 * As soon as we combine a character with a aritmetic operator
		 * (+,-,etc) the product of the calculation are then cast to be of type
		 * int
		 * you can use all arithmetic operators with char
		 */
		//char newChar=char1+char2;
		int charNum=char1+char2;
		System.out.println("charNum is "+charNum);
		
	//	long longNum=120000000000000L;
	//	int newNum=longNum;	
	}
	
	static void Widening() {
		byte b1=2;
		byte b2=4;
		/*
		 * when you use bytes or shorts in a calculations the result is
		 * always an int
		 * when you are doing any calculation that only has bytes, shorts
		 * or ints in it, the answer will always be an int
		 * 
		 */
	//	byte newB=b1+b2;
	//	short newS=b1+b2;
		int num=b1+b2;
		
		short snum=12;
		
		//short newS=b1*snum;
		int product=b1*snum+num;
		
		
		long lnum=34l;
		
		long lnum2=lnum+b1;
	//	int newInt=num+lnum+b1+b2;
		/*
		 * if there is a larger data type than an int in your calculation
		 * then the answer always has to WIDEN to the largest primitive
		 * data type in the calculation
		 * in this example we have a int, a long, a byte and a byte
		 * so that means that our answer has to be a long
		 */
		long newLong=num+lnum+b1+b2;
		
		double dnum=23.4;
		double newInt=num+dnum+lnum;
		/*.
		 * we want to add up two bytes and we want the answer to be
		 * a byte
		 * by inserting final, you can ensure that if you do a calculation
		 * with just these variables, and answer will always be a byte
		 */
		final byte finalByte=3;
		final byte finalByte2=4;
		
		byte sumByte=finalByte+finalByte2;	
	}
	
	static void realtionalOperators() {
		/*
		 * >,<,>=,<=,!(not operator),==(equalivance operator)
		 */
		int a=10,b=10,c=100;
		System.out.println(a>b);//prints false
		System.out.println(a>=b);//prints true
		System.out.println(a==b);//prints true
		System.out.println(a==c);//prints false
		System.out.println(a!=c);//prints true
		//this will print out 4 times, 0,1,2,3
		for(int i=0;i<4;i++) {
			System.out.println("print me "+i);
		}
		//this will print out 5 times, 0,1,2,3,4
		for(int i=0;i<=4;i++) {
			System.out.println("print me again "+i);
		}
		
		a=10;b=10;c=100;
		System.out.println(a!=b);//false
		System.out.println(a!=c);//true
		
		boolean b1=false;
		
		System.out.println(b1==true);//false
		System.out.println(b1==false);//true
		System.out.println(b1!=true);//true
		System.out.println(b1!=false);//false
		//assigning the value true to b1 and then prints it out
		System.out.println(b1=true);
		/*
		 * with relational operators you can't use imcompatible data types
		 * with each other
		 * for instance can't compare a boolean to an int
		 */
	//	System.out.println(b1>a);
		
		int num=45;
		int num2=90;
		System.out.println(num==num2);//comparing the values
		//num=num2;
		/*
		 * assigning the value of num2, which is 90, to num and then 
		 * printing out num which is 90
		 */
		System.out.println(num=num2);
		num=2;
		num2=4;
		a=3;
		b=6;
		System.out.println(num+num2*a+b);
		System.out.println((num+num2)*a+b);
		/*
		 * brackets() has the highest precedence, which
		 * means its done first in the below equation.
		 * So num is given the value of 1000 , then it's compared against
		 * num2, and num2 is only 4, which is NOT greater than 1000
		 * so this will print false
		 */
		System.out.println(num2>(num=1000));
		
		num=4;
		num2=4;
		System.out.println((num=num2*2)>num*4);
		System.out.println(num2>(num));
		System.out.println(num);
		System.out.println(num2);	
	}
	
	static void logicalOperators() {
		/*
		 * AND which are &&, both conditions we are checking for, have 
		 * to be true
		 * OR which are || (sometimes called pipes), either condition can
		 * be true
		 * ! is NOT
		 */
		int a=10,b=15;
		//&& bothe have to be true
		System.out.println(a>20 && b>5);//false
		System.out.println(a<20 && b<20);//true
		//or either can be true ||
		System.out.println(a>20 || b>5);//true
		System.out.println(a>20 || b>15);//false
		//NOT true !
		System.out.println(!(a>10));//true#
		System.out.println(!(b>10));//false
		System.out.println(!(a==b));//true
		
		int c=50;
		a=10;b=15;
		System.out.println(a<=c && b>=a);
		//it is false for a>b, so the rest of the equation is not evaluated
		System.out.println(a>b && b<=c && a<=c );//false
		/*
		 * a>b is false but b<=c is true, and this in an or, so if either
		 * are true, then this statemetn evaluates to true
		 * AND &&
		 * a<=c is true, so both sides evaluate to true, so teh whole 
		 * statemetn eavaluates to true
		 */
		System.out.println(a>b || b<=c && a<=c);//true
		
		System.out.println(a>b && b<=c || a<=c);
		/*
		 * && are called short circuti operators, if the first one evaluates
		 * to false, it does not bother to evaluate second or subsequent
		 * statements
		 * so the second part of ++a<100 is never evaluated
		 */
		c=50;
		a=10;b=15;
		System.out.println(a>20 && ++a<100);
		System.out.println("int a is NOT changed "+a);
		/*
		 * & ensures that both sides of the and are implemented, even if
		 * the first statement is false. So here a>20 is false, but ++a
		 * is implemented, so a becomes 10+1, which is 11.
		 * use this & if we want CODE TO BE IMPLELMENTED ON BOTH SIDES OF
		 * THE AND (&)
		 */
		System.out.println(a>20 & ++a<100);
		
		String str="Hello";
		System.out.println(str);
		/*
		 * if the string exists and the string length is greater than 0,
		 * convert to uppercase
		 */
		if(str!=null && str.length()>0) {
			System.out.println(str.toUpperCase());
		}
		str="";	
	}
	
	static void precedence() {
		int num=9,num2=3,num3=5,sum;
		/*
		 * order is 
		 * increment and decrement opearators
		 * (brackets)
		 * multipication, division modulus
		 * addition and subraction
		 */
		sum=num2+num3*num2/num3+num2;
		System.out.println("sum is "+sum);//answer is 9
		
		sum=num3-num2*(num2+num3)/num2;
		System.out.println("sum is "+sum);//answer is -3
		sum=num2+(num2+num3)*num2+ ++num3;
		System.out.println("sum is "+sum);//answer is 33
		
		num2=3;num3=5;
		sum+=num2 + ++num2 + num3++;
		
		System.out.println("sum is "+sum);
		System.out.println("num2 is "+num2);
		System.out.println("num3 is "+num3);
		num2=3;num3=5;
		sum=33;
		sum+=num2 + (++num2 + num3++);
		System.out.println("sum is "+sum);
		
		int noNum;
	//	noNum+=num;
		
		System.out.println("more examples");
		num=10;
		num2=100;
	}
static void general() {
	int a=10,b=5,c=2;
	/*
	 * when you use the && or the || operator we are comparing
	 * just two conditions, so in our first example we first check
	 * if a<b, which is false, so b>c is not even evaluated.
	 * so the left hand side of the total equation is false.
	 * the right hand side is c<a, which is true, so we an 
	 * OR || between a false and a true, and if one of the 
	 * conditions is true then the whole conidtion is true
	 */
	System.out.println(a<b && b>c || c<a);//true	
	System.out.println(a<b || b>c || c<a);//true
	System.out.println(a<b && (b>c || c<a));//false brackets first
	int num=4,num2=10,num3=5;
	
	System.out.println(num++ + num);//9
	num=4;num2=10;num3=5;
	System.out.println(num++ + ++num);//10
	//do all the post and pre increment and decrement first,
	//so this becomes
	num=4;num2=10;num3=5;
	System.out.println(num++ + ++num * num);//answer is 40
	num=4;num2=10;num3=5;
	System.out.println("modulus");//modulus has same precedence as multipication and division
	System.out.println(num*3%num3);//answer is 2, 
	num=4;num2=10;num3=5;
	/*
	 * there a method of the Math class, called pow() this
	 * takes a number and a power we want to raise it too
	 * for example here we have our num, which is 4, raised
	 * to the power of 2
	 */
	System.out.println(num + Math.pow(num, 2)+ ++num /num);//21.0
	
	
	num=4;num2=10;num3=5;
	System.out.println("problem 1");
	System.out.println(num+num2*++num/num);
	//4+10*5/5
	//answer is 14
	num=4;num2=10;num3=5;
	System.out.println("problem 2");
	System.out.println(num++*++num+(num2- --num));
	//4*6+(10-5)
	num=4;num2=10;num3=5;
	System.out.println("problem 3");
	System.out.println(++num + --num *(num++ + --num2)+(num3++ - 
			num3));
	//5+4*(4+9)+(5-6)
	num=4;num2=10;num3=5;
	System.out.println("problem 4");
	System.out.println(num + num2 *(++num%2)+(--num2 + num2--)+ 
			num2);
	//4+10*(5%2)+(9+9)+8
	num=4;num2=10;num3=5;
	System.out.println("Problem 5");
	
	System.out.println(num+++num2*(num3-- +num++)+(num2%num)-num++
			+(--num * num2));
	//4+10*(5+5)+(10%6)-6+(6*10)
	System.out.println(num);
	System.out.println(num2);
	System.out.println(num3);
	
}
}
