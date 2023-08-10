//program to demonstrate on final keyword
package org.tnsif.finalkeyword;
//child class
public class DELL extends Laptop {
		final String processor="Intel I7";
		
		//final method
	  /* we can't override final method
		final void display()
		{
			System.out.println(processor);
		}
	  */
		
		final void display()
		{
			System.out.println("Processor Name: "+processor);
	}
}