////program to demonstrate on super keyword with variable
package org.tnsif.statickeyworddemo;
//class declaration
class Employee {
//	private data members
	private int empId;
	private String name;
//	static variable
	static String companyName="TNSIF";
//	getters and setters method
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
//display method to show data 
void display(){
	System.out.println("Employee ID: "+this.empId+", "+"Name: "+name+", "+"Comapny Name: "+Employee.companyName);
	}
}
//driver class
public class StaticVariable {
//	main method
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(13);
		e.setName("Suchita");
		e.display();
		Employee e1 = new Employee();
		e1.setEmpId(25);
		e1.setName("Swati");
		e1.display();
	}
}