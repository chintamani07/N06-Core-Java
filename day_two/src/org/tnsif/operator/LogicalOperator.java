// program to demonstrate LOGICAL OPERATOR
// && || !
package org.tnsif.operator;
//class declaration
public class LogicalOperator {
//	main method
	public static void main(String[] args) {
		System.out.println((51!=8) && (7<9)); // logical AND
		System.out.println((51<8) || (8<3) || (2<1)); // logical OR
		System.out.println(!(51!=8) || (7<9)); // logical OR
	}
}
