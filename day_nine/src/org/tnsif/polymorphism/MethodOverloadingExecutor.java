//program to demonstrate the method overloading.
//compile time polymorphism
package org.tnsif.polymorphism;
//class declaration
class Bollywood{
	/* Method overloading in terms of 
	 * by passing the different number of arguments */
	static String showCouple(String str1,String str2)
	{
		return str1+" loves "+ str2;
	}
	static String showCouple(String str1,String str2,String str3)
	{
		return str1+" loves "+ str2 +" as well as "+ str3;
	}
}
public class MethodOverloadingExecutor {
//	main method
	public static void main(String[] args) {
		System.out.println(Bollywood.showCouple("Raj","Simran"));
		/* class_name.method_name as here we are passing parameters
		   pass the parameters in to sysout 
		   as in method we have return not sysout. */
		System.out.println(Bollywood.showCouple("Rahul","Anjali","Teena"));
	}
}