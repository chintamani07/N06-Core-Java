package com.tnsifsingledimensional.array;
//driver class
public class ArrayOfObjectsExecutor {
//	main method
	public static void main(String[] args) {
		Student arr[]=new Student[3];
		arr[0]=new Student(101,"Suchita",80.9f);
		arr[1]=new Student(102,"Rushikesh",70.9f);
		arr[2]=new Student(103,"Abhishek",90.9f);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getPercentage());
		}
	}
}