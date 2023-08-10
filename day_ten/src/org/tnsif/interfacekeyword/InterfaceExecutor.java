//program to demonstrate on interface
package org.tnsif.interfacekeyword;
//driver class
public class InterfaceExecutor {
//	main method
	public static void main(String[] args) {
/*		we can't instantiate an interface
		Sony s = new Sony(); */

//		for Sony class 
		SonySAB s = new SonySAB();
		s.display();
		System.out.println();
		s.show();
		Sony.accept();
		System.out.println();
		
//		for ISRO class 
		ISRO i = new ISRO();
		i.status();
		System.out.println();
		
//		for Human class
		Human h = new Human();
		h.showDrink();
	}
}