// program to demonstrate ASSIGNMENT OPERATOR
// = += -= *= /= %= &= ^= |= 
package org.tnsif.operator;
//class declaration
public class AssignmentOperator {
//	main method
	public static void main(String[] args) {
//		variable initialization		
		int x=25, y=15;
		System.out.println("Number1 : "+x);
		System.out.println("Number2 : "+y);
		System.out.println("The Opeations Performed Are:");
		System.out.println();
		//adding & assigning values
		x+=y; //x=x+y
		System.out.println("The Value of X : "+x); 
//		subtracting & assigning values
		x-=y; //x=x-y
		System.out.println("The Value of X : "+x); 
//		multiplying & assigning values
		x*=y; //x=x*y
		System.out.println("The Value of X : "+x);
//		bitwise AND & assigning values
		x&=y; //x=x&y
		System.out.println("The Value of X : "+x);
//		bitwise inclusive OR & assigning values
		x^=y; //x=x^y
		System.out.println("The Value of X : "+x);
//		bitwise inclusive OR & assigning values
		x|=y; //x=x|y
		System.out.println("The Value of X : "+x);
	}
}