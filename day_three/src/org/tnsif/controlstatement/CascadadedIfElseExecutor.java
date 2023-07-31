// program to demonstrate on Enhanced CasasdedIfElse Executor
package org.tnsif.controlstatement;
//import scanner class
import java.util.Scanner;
//class declaration
public class CascadadedIfElseExecutor {
//	main method
	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the Value of A:");
				int num1=s.nextInt();
				System.out.println("Enter the Value of B:");				
				int num2=s.nextInt();
				System.out.println("Enter the Value of C:");
				int num3=s.nextInt();
				System.out.println();
				System.out.println("The Values Are:");
				System.out.println("A: "+" is "+num1);
				System.out.println("B: "+" is "+num2);
				System.out.println("C: "+" is "+num3);
				System.out.println();
				if(num1>num2 && num1>num3)
					System.out.println("The Value: "+num1+" of A is greater!!!");
				else if(num2>num3)
					System.out.println("The Value: "+num2+" of B is greater!!!");				
				else
					System.out.println("The Value: "+num3+" of C is greater!!!");				
				s.close();
				// closes this scanner object
	}
}