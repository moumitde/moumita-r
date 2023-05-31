package com.May2023;

public class Test_Loops 
{
	public static void test(String str)
	{
		for(int i=0 ; i<str.length() ; i++)
		{
			//System.out.print(str.charAt(i));
			for(int j=0 ; j<str.length()-i ; j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		test("globant");
	}

}
