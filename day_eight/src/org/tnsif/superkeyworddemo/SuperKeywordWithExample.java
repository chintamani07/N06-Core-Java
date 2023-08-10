//program to demonstrate on super keyword with constructor
package org.tnsif.superkeyworddemo;
//parent class
class Google
{
	String ceoName;
//	parameterized constructor
	public Google(String ceoName) {
		System.out.println("Parameterized Constructor"+ceoName);
	}
}
//child class
class Gmail extends Google
{
	String userId;
//	parameterized constructor
	public Gmail(String ceoName, String userId) {
		super(ceoName);
		this.userId = userId;
		System.out.println(userId);
	}
}