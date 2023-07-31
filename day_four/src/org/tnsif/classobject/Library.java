//driver class
//program to demonstrate on default and parameterized constructor
package org.tnsif.classobject;
// class declaration
public class Library {
	public long noOfBooks;
	public String authorName, bookName;
	public double price;
//	default constructor
	public Library() {	
	System.out.println("Default Constructor");
	}
//	parameterized constructor
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}
// to string method	
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}	
}