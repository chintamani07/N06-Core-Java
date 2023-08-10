//program to demonstrate on ArrayIndexOutOfBounds Exception
package uncheckedexception;
//class declaration
public class ArrayIndexOutOfBoundsExceptionExecutor {
//	static method
	static void display(int arr[])
	{
		try
		{
			System.out.println("Array element at 3rd index: "+arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
		}
		finally
		{
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