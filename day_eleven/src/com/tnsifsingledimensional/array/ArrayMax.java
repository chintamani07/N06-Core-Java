/* Program to demonstrate on array using run-time input
 * to find largest element in an array
 */
package com.tnsifsingledimensional.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total n of array elements: ");
		int n = s.nextInt();
		System.out.print("Enter the elements of array:");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];

			}
		}
		System.out.println();
		System.out.println("largest element is:"+max);
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Sorted elements:");
//		for-each loop
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		s.close();
	}
}
