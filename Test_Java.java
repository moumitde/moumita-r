package com.May2023;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Java 
{
	int goal = 1;
	
	public void testChar()
	{
		//Default value for char is space
		char ch[] = new char[3];
		System.out.println(Arrays.toString(ch));
		
	}
	
	//test properties of Scanner class
	public void test_Scanner()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		
		System.out.println(scan.next());
	}
	
	public void test_tryWithResources()
	{
		try(Scanner scan = new Scanner(System.in))
		{
			System.out.println("Enter a val");
			System.out.println(scan.next());
		}
	}
	
	public void test_ReturnKeyword()
	{
		String str = "val";
		
		if(str.equals("val"))
		{
			System.out.println("values are matching");
			//the method is exited when JVM encounters the below Return statement
			return;
		}
			
		else
			System.out.println("no");
		
		//The below  statement does NOT get printed because program exits due to return statement in the "if" condition
		System.out.println("out of loop");
			
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Print values of variables: "+goal;
	}
	
	public static void main(String[] args)
	{
		Test_Java java = new Test_Java();
		//java.testChar();
		//java.test_Scanner();
		java.test_tryWithResources();
		
		Test_Java goaler1 = new Test_Java();
		Test_Java goaler2 = new Test_Java(); 
		
		System.out.println("goaler1.goal:- "+goaler1.goal);  //prints- 1
		goaler1.goal +=1;
		System.out.println("goaler1.goal +=1 :- "+goaler1.goal); //prints- 2
		
		System.out.println("goaler2.goal:- "+goaler2.goal); //prints- 1
		
		System.out.println(java);
		
		java.test_ReturnKeyword();
		
	}

}
