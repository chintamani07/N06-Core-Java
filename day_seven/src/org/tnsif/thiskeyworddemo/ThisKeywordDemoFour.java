//program to demonstrate on this keyword
package org.tnsif.thiskeyworddemo;
//class declaration
class Game{
	String gameName;
	void print()
	{
		this.gameName="BGMI";
		display();
	}
	void display()
	{
		System.out.println("Game Name: "+gameName);
	}
}
//driver class
public class ThisKeywordDemoFour {
//	main method
	public static void main(String[] args) {
		Game g = new Game();
		g.print();
	}
}