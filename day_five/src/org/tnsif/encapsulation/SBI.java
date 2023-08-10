//program to demonstrate on Encapsulation
/* Encapsulation achieves a data hiding 
 * using private access specifier
 */
package org.tnsif.encapsulation;
//class declaration
public class SBI {
//	private data members
	private String accType;
	private long accNo, atmCardNo;
	private int pinNo;
//	getters and setters
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	//	 using toString() method
	@Override
	public String toString() {
		return "SBI [accType=" + accType + ", accNo=" + accNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo + "]";
	}	
}