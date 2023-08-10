//program to demonstrate on custom exception
/*to the custom exceptions an Exception class(parent) */
package org.tnsif.customecxeption;
//class declaration
@SuppressWarnings("serial")
public class LoginCredential extends Exception {
//	private variable initialization	
	private String str;
//	getter method
	public String getStr() {
		return str;
	}
//	setter method
	public void setStr(String str) {
		this.str = str;
	}
//	parameterized constructor
	public LoginCredential(String str) {
		super();
		this.str = str;
	}
//	toString() method
	@Override
	public String toString() {
		return "LoginCredential [str=" + str + ", toString()=" + super.toString() + "]";
	}
}