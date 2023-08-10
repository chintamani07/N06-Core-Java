//program to demonstrate on when finally block is not executed
package uncheckedexception;
//class declaration
public class FinallyBlockNotExecutedExecutor {
//	static method
	static void display(int arr[])
	{
		try
		{
			System.out.println("Array element at 3rd index: "+arr[3]);
			/*
			 *  if try and catch block 
			 */
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
			System.exit(0);
		}
		finally
		{
			/* when finally block contains an exception code,
			 * then finally block does not execute
			*/
			System.out.println(13/0);
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement out of the block is always"+" executed");
	}
//	main method
	public static void main(String[] args) {
		int arr[]= {12,6,89};
		display(arr);
	}
}