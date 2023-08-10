//program to demonstrate on instanceof 
package org.tnsif.instanceofdemo;
//parent class
class RBI
{
//	protected data member
	protected String ifscCode;
}
//child class
class SBI extends RBI
{
//	public method()
	public SBI()
	{
	super.ifscCode="RBIS0NGPA01";
	String ifscCode="SBI0NK0911";
	System.out.println(ifscCode);
	
/* If parent class & child class variable name are same.
 * Use super.var_name to access that variable of parent
 * class inside the child class. */
	
	System.out.println(super.ifscCode);
	}
}
//driver class
public class InstanceOfDemo {
//	main method
	public static void main(String[] args) {
		SBI sb = new SBI();
		System.out.println(sb instanceof SBI);
		System.out.println(sb instanceof RBI);		
	}
}