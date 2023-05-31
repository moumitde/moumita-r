package com.May2023;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_Exception extends P
{
	//TEST the PROPAGATION of an Exception through method calls 
	public static void method1()
	{
		
		method2();
		System.out.println("In method 1");
	}
	
	public static void method2()
	{
		
		
		try {
			String str = null;
		str.length();
		}
		catch(Exception e)
		{
			System.out.println("print exception");
		}
		System.out.println("In method 2");
	}
	
	public static void return_tryCatch()
	{
		try 
		{
			
			System.out.println(3/0);
			return;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//finally will run even if there is return keyword in the try block
			System.out.println("in finally");
		}
	}
	
	public static void static_exception_in_finally()
	{
		//If both try and finally block throw exception then the finally block exception will consume the try block exception
		try {
			System.out.println("try");
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			throw new ArithmeticException();
		}
		
	}
	
	//Try method throws EXCEPTION and finally returns a value
	//****Exception is thrown in try block which gets handled in Catch . PrintStackTrace is printed and return 1 in finally consumes the exception from try and only 1 is printed***
	public int return_finally1()
	{
		//exception is thrown here
		try
		{
			System.out.println(4/0);
		}
		//Exception is handled in catch
		catch(ArithmeticException e)
		{
			System.out.println("exception handled- "+e); // this gets printed
			e.printStackTrace(); // this gets printed
		}
		finally
		{
			return 1; //output is 1
		}
	}
	
	//Since exception does not get handled in Catch , finally return value gets printed in the console
	public int return_finally2()
	{
		//exception is thrown here
		try
		{
			System.out.println(4/0);
		}
		//Exception is NOT handled in catch
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled- "+e);
			e.printStackTrace();
		}
		finally
		{
			return 1; //output is 1
		}
	}
	
	//Return keyword in both try and finally
	//***return value in finally consumes the try block code***
	public int return_finally_try()
	{
		
		try
		{
			return 5;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return 1;  //output is 1
		}
	}
	
	
	//sub class can declare without exception
	public void test_Exception() throws FileNotFoundException
	{
		System.out.println("In Parent class");
	}
	
	public void test_Exception2() throws ArithmeticException
	{
		System.out.println("exception 2 in child class");
	}
	
	public int test_returnInTry()
	{
		try {
			return 1 ;
		}
		catch(Exception e)
		{
			return 2;
		}
		finally
		{
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) 
	{
		
		//method1();
		//System.out.println("In main method");
		//return_tryCatch();
		//static_exception_in_finally();
		Test_Exception ex = new Test_Exception();
		//ex.test_Exception();
		//ex.test_Exception2();
		//System.out.println(ex.return_finally_try());
		//ex.return_finally_try();
		//System.out.println(ex.test_returnInTry());
		System.out.println(ex.return_finally());
		//Test_Exception.static_exception_in_finally();
	}
}

//******TO TEST - METHOD OVERRIDING WITH EXCEPTION*******
class P
{
	//parent class throws CHECKED EXCEPTION
	public void test_Exception() throws IOException
	{
		System.out.println("In Parent class");
	}
	
	//parent class DOES NOT throw any exception
	public void test_Exception2()
	{
		System.out.println("exception 2");
	}
	
	//parent class throws 
}
