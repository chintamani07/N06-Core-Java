// program to demonstrate on SWITCH Executor
package org.tnsif.controlstatement;
//import scanner class
import java.util.Scanner;
//class declaration
public class SwitchExecutor {
//main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("******** MENU ********");
		System.out.println("1. English");	
		System.out.println("Arcade");
		System.out.println("Cradles");		
		System.out.println("Heat Waves");
		System.out.println("Ignite");		
		System.out.println("Love Me Like You Do");
		System.out.println("Perfect");
		System.out.println("2. Hindi");
		System.out.println("Ajab Si");
		System.out.println("Chand Baaliyan");
		System.out.println("Hosanna");
		System.out.println("Namo Namo");
		System.out.println("Wo Din");
		System.out.println("Zara Sa");
		System.out.println("3. Marathi");
		System.out.println("Chimb Bhijalele");
		System.out.println("Dil Ko Diya");
		System.out.println("Hum Aaye Hain");
		System.out.println("Hrudayat Vaje Something");
		System.out.println("Kadhi Tu");
		System.out.println("Ye Go Ye Maina");
		System.out.println("***********************");
		System.out.println("Enter The Prefered Language For Song: ");
		String songType=s.next();
		System.out.println();
		switch(songType)
		{
			case "English":
			case "english":
				System.out.println("Enjoy The Music");
				System.out.println("Arcade");
				System.out.println("Cradles");		
				System.out.println("Heat Waves");
				System.out.println("Ignite");		
				System.out.println("Love Me Like You Do");
				System.out.println("Perfect");
				break;
			case "Hindi":
			case "hindi":			
				System.out.println("Ajab Si");
				System.out.println("Chand Baaliyan");
				System.out.println("Hosanna");
				System.out.println("Namo Namo");
				System.out.println("Wo Din");
				System.out.println("Zara Sa");
				break;
			case "Marathi":
			case "marathi":				
				System.out.println("Chimb Bhijalele");
				System.out.println("Dil Ko Diya");
				System.out.println("Hum Aaye Hain");
				System.out.println("Hrudayat Vaje Something");
				System.out.println("Kadhi Tu");
				System.out.println("Ye Go Ye Maina");
				break;
			default:
				System.out.println("Sorry...Invalid Choice");
	}
		s.close();
//		closes this scanner
  }
}