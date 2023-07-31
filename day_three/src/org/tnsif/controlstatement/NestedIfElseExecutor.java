// program to demonstrate on NestedIfElse Executor
package org.tnsif.controlstatement;

import java.util.Scanner;
//class declaration
public class NestedIfElseExecutor {
//	main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=s.nextInt();
		System.out.println("Enter your weight:");
		int weight=s.nextInt();
		if(age>12)
		{
			if(age>=40)
				System.out.println("Congratulations You're Eligible For Bungee Jumping!!!");
		}
		if(weight>100)
		System.out.println("Extra Ropes To Be Added...");
		else
			System.out.println("Sorry You're Not Eligible For Bungee Jumping!!");
		s.close();
//		closes this scanner
	}
}