//program to demonstrate on abstract keyword
package org.tnsif.abstractkeyword;
//driver class
public class AbstractClassExecutor {
	public static void main(String[] args) {
	/* we can't create the object class
	 * Sandwich s = new Sandwich() */
			ChochlateSandwich c = new ChochlateSandwich();
			c.showRecipe();
			c.prepare();
	}
}