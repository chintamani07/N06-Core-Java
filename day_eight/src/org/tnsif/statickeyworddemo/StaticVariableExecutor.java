//program to demonstrate on super keyword with variable
//driver class
package org.tnsif.statickeyworddemo;
//driver class
public class StaticVariableExecutor {
//	static variable
	static String str = "TNS India Foundation";
//	main method
	public static void main(String[] args) {
		
		/* if any variable is outside main function and
		 * if you want to access that variable inside main function
		 * then make the variable as static 
		 * 
		StaticVariableExecutor s = new StaticVariableExecutor();
		System.out.println(s.str);*/
		
		System.out.println("String is: "+str);
	}
}