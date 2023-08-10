//program to demonstrate on abstract keyword
package org.tnsif.abstractkeyword;
//public abstract parent class
public abstract class Sandwich {
//	concrete method
	void showRecipe()
	{
		System.out.println("I don't know how to"+" prepare sandwich?");
	}
/* 	abstract method
 * 	it does not contain method body */
	abstract void prepare();
}