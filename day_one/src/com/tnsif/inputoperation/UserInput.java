//program to demonstrate on user input
package com.tnsif.inputoperation;
//import scanner class
import java.util.Scanner;
// class declaration
public class UserInput {
//main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name Here : ");
		String str = s.next();
		System.out.println("The Name is : "+str);
		//closes this scanner
		s.close();
	}
}