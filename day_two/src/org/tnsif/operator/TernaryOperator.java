// program to demonstrate TERNARY operator
// variable = condition ? expression1: expression2 
package org.tnsif.operator;
//import scanner class
import java.util.Scanner;
//class declaration
public class TernaryOperator {
//	main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = s.nextInt();
		// to check whether a number is even or odd
		String result = (num%2==0) ? "Even": "Odd";
		System.out.println("Result is : "+num+" is "+result+" Number");
		//closes this scanner
		s.close();
	}
}