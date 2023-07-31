// program to demonstrate on IfElse Executor
package org.tnsif.controlstatement;
//import scanner class
import java.util.Scanner;
//class declaration
public class IfElseExecutor {
//	main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=s.nextInt();
		System.out.println("Enter Your Weight:");
		int weight=s.nextInt();
		System.out.println("Your Age is:"+age);
		System.out.println("Your Weight is:"+weight);
		if(age>=18 && weight>=50)
			System.out.println("Congratulations You're Eligible for Blood Donation!!!");
		else
	
			System.out.println("Sorry You're Not Eligible for Blood Donation!!");	
		s.close();
		// closes the scanner object
  }
}