/* There are N people standing in a circle waiting to be executed.
 * The counting out begins at some point in the circle and proceeds 
 * around the circle in a fixed direction.
 * In each step, a certain number of people are skipped,
 * and the next person is executed.
 * The elimination proceeds around the circle(which is becoming
 * smaller and smaller as the executed people are removed), 
 * until only the last person remains, who is given freedom.
 * given :
 * Total No of person : N
 * A number came that indicates
 * 					  : k-1 person are skipped
 * 					  : and the k person is killed in the circle
 * The task is to choose the person in the initial circle that survives. */
package org.tnsif.dayfivechallenge;
//import scanner class
import java.util.Scanner;
//class declaration
public class CircleSurviveChallenge {
//	static method(n,k)
	public static int  survive(int n,int k) {
		if(n==1) {
			return 1;
		}else {
			return(survive(n-1,k)+k-1)%n+1;
		}
	}
//	main method
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the value for N");
		int n=s.nextInt();
		System.out.println("Enter the value for K");
		int k=s.nextInt();
		System.out.println("****************************");
		System.out.println("The Person that Survivies: " +survive(n,k));
		s.close();
	}
}