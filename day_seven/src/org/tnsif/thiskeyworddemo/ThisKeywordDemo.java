//program to demonstrate on this keyword
package org.tnsif.thiskeyworddemo;
//class declaration
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
//driver class
public class ThisKeywordDemo {
//	main method
	public static void main(String[] args) {
	Account a = new Account();
	a.setData(123456787651L);
	a.display();
	}
}