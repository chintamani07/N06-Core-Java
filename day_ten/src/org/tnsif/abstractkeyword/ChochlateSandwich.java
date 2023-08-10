//program to demonstrate on abstract keyword
package org.tnsif.abstractkeyword;
//child class
public class ChochlateSandwich extends Sandwich {
//method declaration is intended
	@Override
	void prepare() {
		System.out.println();
		System.out.println("Steps to prepare chochlate sandwich:");
		System.out.println("1. Two slices of bread");
		System.out.println("2. Add hersheys or any other chochlate");
		System.out.println("3. Set up stove to high flame");
		System.out.println("4. Enjoy your chochlate sandwich!!");
	}
}