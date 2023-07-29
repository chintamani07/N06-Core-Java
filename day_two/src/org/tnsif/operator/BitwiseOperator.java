// program to demonstrate BITWISE OPERATOR
// &  ^  |  ~  <<  >>
package org.tnsif.operator;
//class declaration
public class BitwiseOperator {
//	main method
	public static void main(String[] args) {
//		variable initialization		
		int x=24, y=8;
		System.out.println(x&y); // and
		System.out.println(x^y); // exclusive or
		System.out.println(x|y); // inclusive or
		System.out.println(8<<1); // left shift 
		System.out.println(8>>1); // right shift
	}
}