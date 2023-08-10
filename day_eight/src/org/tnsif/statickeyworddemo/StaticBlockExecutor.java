//program to demonstrate on static block
package org.tnsif.statickeyworddemo;
//class declaration
public class StaticBlockExecutor {
//	static variable
	static String str;
	int salary;

/* 	static block is used to initialize static variable 
 * 	and we cannot initialize any non 
 * 	static variables inside the static block */
	
//	static block
	static {
//		Salary=76;
		str="MET";
	}
//	main method
	public static void main(String args[]) {	
		System.out.println("String is: " +str);
	}
}