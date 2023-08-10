//program to demonstrate on super keyword with variable
package org.tnsif.superkeyworddemo;
//parent class
class Building
{
//	variable initialization	
	int floors=12;
	String buildingName="Rushiraj-Zenith";
}
//child class
class Flat extends Building
{
	String ownerName="Chintamani Wankhede";
	void print()
	{
		/* if parent class & child class variable name are same,
		 * and if you want to 
		 * access parent class variable name inside child class, 
		 * use super.variablename
		 */
		System.out.println("Building Name: "+super.buildingName);
		System.out.println("Owner Name: "+ownerName);
	}
}
//driver class
public class SuperKeywordWithVariable {
//	main class
	public static void main(String[] args) {
		Flat f = new Flat();
//		System.out.println(f.name);
//		System.out.println(f.floors);
		f.print();
	}
}