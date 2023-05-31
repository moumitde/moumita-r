package com.May2023;

public class Test_Static 
{
	int i = 10 ;
	static void method()
	{
		Test_Static st = new Test_Static() ;
		System.out.println(st.i);
		
	}
	
	public static void m2()
	{
		//A LOCAL variable can be declared/initialised inside a STATIC method
		int x = 10 ;
		System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		//method();
		m2();
		
	}

}
