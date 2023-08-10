//program to demonstrate on throw and throws keyword
package uncheckedexception;
//class declaration
public class ThrowandThrowsKeywordExecutor {
//	static method
	static void isEligible(int age, int weight)
	{       
		if(age>18 && weight>50)
		{
			System.out.println("Person is eligible to donate the blood");
		}
		else
		{
//			throw keyword is used to throw an exception explicitly
			throw new ArithmeticException("Criteria is not satisfied");
		}
	}
//	main method
	public static void main(String[] args)  {
		/* while using throws exception
		 * unhandled exception type Exception as
		 * 1.add throws declaration to 
		 * 2.either surround with try-catch block
		 * - the exception will occur red in color
		 * - else using try-catch it will occur black in color without exception */
		isEligible(13, 40);
	}
}