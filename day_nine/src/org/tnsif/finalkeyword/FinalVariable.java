//program to demonstrate on final keyword with variable
package org.tnsif.finalkeyword;
//class declaration
public class FinalVariable {
	/* final variable must be initialize during declaration
	 * final int x; */
	final float SALARY=7000.3f;	
	void print()
	{
//		 we can't change the value of final variable
		System.out.println("Salary is: "+SALARY);
	}
}