//program to demonstrate on this keyword
package org.tnsif.thiskeyworddemo;
//class declaration
class Bank
{
	long accountNo;
//	parameterized constructor
	Bank(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
//driver class
public class ThisKeywordDemoTwo {
//	main method
	public static void main(String[] args) {
		Bank b = new Bank(123456787651L);
		b.display();
	}
}