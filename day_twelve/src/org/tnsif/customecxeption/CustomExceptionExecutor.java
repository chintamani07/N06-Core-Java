package org.tnsif.customecxeption;

import java.util.Scanner;

public class CustomExceptionExecutor {
//	main method
	public static void main(String[] args)  {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter USERID: ");
		String userId=s.nextLine();
		System.out.println("Enter PASSWORD: ");
		String password=s.nextLine();
		try
		{
			if(userId.equals("chinta13@gmail.com") &&
			password.equals("Pass@13"))
			{
			System.out.println("Credentials are matched!!");
			}
			else
			{
			throw new LoginCredential("Invalid Credentials!!");
			}
		}	
		catch(LoginCredential e)
		{
			System.out.println("Exception Handled: "+e);
		}
	}
}