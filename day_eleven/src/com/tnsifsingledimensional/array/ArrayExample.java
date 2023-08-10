//program to demonstrate on 1D array using compile time input
package com.tnsifsingledimensional.array;
//class declaration
public class ArrayExample {
//	main method
	public static void main(String[] args) {
		int arr[] = {12,40,33,4,1};
		System.out.println("The Element At 3rd index is: "+arr[2]);
		System.out.println();
		System.out.println("Array Elements are:");
//		for-each loop
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}