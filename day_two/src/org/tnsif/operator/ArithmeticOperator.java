// program to demonstrate ARITHMETIC OPERATOR
// + - * / %
package org.tnsif.operator;
//import scanner class
import java.util.Scanner;
//class declaration
public class ArithmeticOperator {
//	main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Value of Number1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter The Value of Number2 : ");
		int num2 = s.nextInt();
		System.out.println("The Opeations Performed Are:");
		System.out.println();
		//addition
		System.out.println("Addition of "+num1+ " and "+num2+" is : "+(num1+num2));
		//subtraction
		System.out.println("Subtraction of "+num1+ " and "+num2+" is : "+(num1-num2));
		//multiplication
		System.out.println("Multiplication of "+num1+ " and "+num2+" is : "+(num1*num2));
		//division
		System.out.println("Division of "+num1+ " and "+num2+" is : "+(num1/num2));
		//modulus
		System.out.println("Modulus of "+num1+ " and "+num2+" is : "+(num1%num2));	
		//closes this scanner
		s.close();
	}
}