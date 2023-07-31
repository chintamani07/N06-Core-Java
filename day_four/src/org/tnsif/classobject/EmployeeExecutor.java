//driver class
//program to demonstrate on class and objects
package org.tnsif.classobject;
//class declaration
public class EmployeeExecutor {
//	main method
	public static void main(String[] args) {
//		object creation
		Employee e = new Employee();
		e.empId = 12345;
		e.empName = "Rushikesh Shinde";
		e.salary = 15000;
		e.department = "Sales Management";
//		method call
		e.display();
	}
}