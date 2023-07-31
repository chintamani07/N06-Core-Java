// program to demonstrate on FOR-LOOP Executor
package org.tnsif.loopingstatement;
// import scanner class 
import java.util.Scanner;
// class declaration
public class ForLoopExecutor {
	//main method
	public static void main(String[] args) {
		Scanner	s = new Scanner(System.in);
		int rowNo = 0;
		int i, j;
		System.out.println("Enter The Number of ROWS:");
		rowNo=s.nextInt();
		for(i=1;i<=rowNo;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(j+ " ");
			}
			System.out.println();
		}
		//closes this scanner
		s.close();
	}
}