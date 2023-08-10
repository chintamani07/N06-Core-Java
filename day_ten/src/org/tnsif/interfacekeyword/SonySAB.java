//program to demonstrate on interface
package org.tnsif.interfacekeyword;
//implementable child or child class
public class SonySAB implements Sony {
	/*	
	 * provide an implementation to all the 
	 * abstract method of an interface
	 */
	@Override
	public void display() {
		System.out.println("Tarak Mehta Ka Oolta Chashma");
		System.out.println("Total Channels Under SONY: "+noOfChannels);
	}
}