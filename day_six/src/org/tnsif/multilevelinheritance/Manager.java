package org.tnsif.multilevelinheritance;
//parent class(A)
public class Manager {
//	private data members
	private String deptName, name;
	private int empID;
//	getters and setters method
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
//	toString() method
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empID=" + empID + "]";
	}
	//parameterized constructor
	public Manager(String deptName, String name, int empID) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empID = empID;
	}
}