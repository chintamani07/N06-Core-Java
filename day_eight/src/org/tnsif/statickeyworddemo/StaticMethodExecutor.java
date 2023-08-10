//program to demonstrate on super keyword with method
//driver code
package org.tnsif.statickeyworddemo;
//class declaration
public class StaticMethodExecutor {
//	static variable
	static float percent=9.8f;

	/*  if any method outside the main function and 
	 * if you want to access the method inside the main function
	 *  make it as static*/
	
	// static method 
	static void displayScore(int score) {
		System.out.println("Score is: " +score);
		
		//we cannot print non static variables inside static method.
		System.out.println("Percent is: "+percent);
	}
//	main method
	public static void main(String[] args) {
		displayScore(56);
	}
}