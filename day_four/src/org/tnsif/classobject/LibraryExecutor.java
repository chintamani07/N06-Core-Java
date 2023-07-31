//driver class
//program to demonstrate on default and parameterized constructor
package org.tnsif.classobject;
//class declaration
public class LibraryExecutor {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// object creation
		Library l = new Library();
		Library l1 = new Library(10,"Swati Thombare","HarryPotter",750000);
		System.out.println();
		System.out.println();
	}
}