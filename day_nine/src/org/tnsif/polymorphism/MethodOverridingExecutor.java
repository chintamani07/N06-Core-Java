//Program to demonstrate on Method Overriding
//run time polymorphism
package org.tnsif.polymorphism;
//parent class
class ChiefMinister 
{
//	static method
	static void corruption(String str1,float amount)
	{
		
		System.out.println(str1+"Corrupted the amount of :"+amount);
	}
}
//child class
class MLA extends ChiefMinister 
{
//	static method
	static void corruption(String str2,float amount2)
	{
		ChiefMinister.corruption("XYZ ",575758.90f);
		System.out.println(str2+" Corrupted the amount of :"+amount2);
	}	
}
//driver class
public class MethodOverridingExecutor {
//	main method
	public static void main(String[] args) {
		MLA.corruption("PQR",656567.50f);
	}
}