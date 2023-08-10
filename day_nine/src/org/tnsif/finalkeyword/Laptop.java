//program to demonstrate on final method
package org.tnsif.finalkeyword;
//final class can't be inherit
//public final class Laptop
//parent class
public class Laptop {
	final String processor="Intel I3";
//	final method
	final void display(String processor)
	{
		System.out.println("Processor Name: "+processor);
	}
}