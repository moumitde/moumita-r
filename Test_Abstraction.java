package com.May2023;

public abstract class Test_Abstraction 
{
	static int i = 10 ;
	
	static
	{
		System.out.println("in static bloack:- "+i);
	}
	
	static void method()
	{
		System.out.println("in static method:- "+i);
	}
	
   public static void main(String[] args) 
    {
    	//Creating object for an ABSTRACT class throws compile- time error
    	//Test_Abstraction abs = new Test_Abstraction() ;
		method();
	}
}
