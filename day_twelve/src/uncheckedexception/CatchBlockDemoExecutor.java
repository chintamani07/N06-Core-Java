//program to demonstrate on catch block with multiple exception
package uncheckedexception;
//class declaration
public class CatchBlockDemoExecutor {
//	static method
	static void print(int arr[])
	{
	try
	{
		System.out.println("Array element at 3rd index: "+arr[3]);
	}
/*	we can use multiple catch block in program
 *  using pipe | operator
 */	
	catch(ArithmeticException  | NullPointerException e)
	{
		System.out.println(e);
	}
	/*catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	*/
	}
//	main method
	public static void main(String[] args) {
		int arr[]= {12,3,14};
		print(arr);
	}
}