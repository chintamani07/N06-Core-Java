//program to demonstrate on this keyword
package org.tnsif.thiskeyworddemo;
//class declaration
class Team
{
//	variable initialization
	int size;
//	default constructor
	Team()
	{
		this.size=7;
		System.out.println("Default Constructor");
	}
//	parameterized constructor
	Team(int size)
	{
		System.out.println("Parameterized Constructor : "+size);
	}
}
//driver class
public class ThisKeywordDemoThree {
//	to suppress compiler warning
	@SuppressWarnings("unused")
//	main method
	public static void main(String[] args) {
		Team t = new Team();	
		Team t1 = new Team(7);
//		t.size=10;
	}
}