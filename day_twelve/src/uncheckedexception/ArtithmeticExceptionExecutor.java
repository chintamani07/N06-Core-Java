//program to demonstrate on ArtithmeticException Exception
package uncheckedexception;
//importing scanner class
import java.util.Scanner;
//class declaration
public class ArtithmeticExceptionExecutor {
//	main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		try
		{
			System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Expection handled: "+e);
		}
		s.close();
//		closes this scanner
	}
}