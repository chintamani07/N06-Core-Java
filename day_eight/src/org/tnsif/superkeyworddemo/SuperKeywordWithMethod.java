//program to demonstrate on super keyword with method
package org.tnsif.superkeyworddemo;
//parent class
class MET{
	String ownerName="Chagan Bhujbal";
	void display()
	{
		System.out.println("Owner Name : "+ownerName);
	}
}
//child class
class BKC extends MET
{
	String ownerName="Shefali Bhujbal";
	/* if parent class name and child class method name are same,
	 * and if you want to access that method inside 
	 * child class, then use
	 * super.methodName(); */
	void displayName()
	{
		System.out.println("Owner Name : "+ownerName);
	}
}
//driver class
public class SuperKeywordWithMethod {
//	main method
	public static void main(String[] args) {
		BKC b = new BKC();
		b.displayName();
	}
}