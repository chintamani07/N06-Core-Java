//program to demonstrate on single inheritance
package org.tnsif.singleinheritence;
//parent class
public class Citizen {
//	private data members
	private String city;
	private int pincode;
	private String area;
	private long adharNo;
//	getters and setters method
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
//	default constructor
	public Citizen() {
		super();
		System.out.println("Citizen-Parent Class");
	}
//	parameterized constructor
	public Citizen(String city, int pincode, String area, long adharNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharNo = adharNo;
	}	
}