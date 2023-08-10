//program to demonstrate on Encapsulation
//driver code
package org.tnsif.encapsulation;
//driver class
public class EncapsulationExecutor {
//main method
	public static void main(String[] args) {
		SBI s = new SBI();
		s.setAccType("General Account");
		s.setAccNo(670389283744L);
		s.setAtmCardNo(123456783456L);
		s.setPinNo(1991);
//		System.out.println("I Have "+s.getAccType()+" Account in SBI Bank");
//		System.out.println("My Account Number:"+s.getAccNo());
		System.out.println(s);
	}
}