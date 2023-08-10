//program to demonstrate on heirarchical inheritance
//driver code
package org.tnsif.heirarchicalinheritence;
//parent class
public class Android {
//	private data members
	private String brand, slotType;
//	getters and setters method
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
//	toString() method
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slotType=" + slotType + ", toString()=" + super.toString() + "]";
	}
//	parameterized constructor
	public Android(String brand, String slotType) {
		super();
		this.brand = brand;
		this.slotType = slotType;
	}
}