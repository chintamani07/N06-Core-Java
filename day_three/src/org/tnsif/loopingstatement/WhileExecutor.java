// program to demonstrate on WHILE Executor
package org.tnsif.loopingstatement;
//import scanner class
import java.util.Scanner;
//class declaration
public class WhileExecutor {
//	main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=s.nextInt();
		System.out.println();
		System.out.println("From Number " +num+ " to Number 1:");
//		printing number to 1
//		entry controlled
		while(num>=1)
		{
			System.out.println(num+" ");
			num--;
		}
		s.close();
	}
}