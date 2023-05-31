package com.May2023;

public class Test_WrapperClasses 
{
	public void test_Integer()
	{
		//Integer Caching does NOT happen since values are NOT within Integer range
		Integer i1 = 128;
		Integer i2 = 128 ;
		
		System.out.println(i1==i2); //false
		
		//Integer Caching happens since values are within Integer range
		Integer j1 = 90;
		Integer j2 = 90 ;
		
		System.out.println(j1==j2); //true
		
		
	}
	
	public static void main(String[] args)
	{
		Test_WrapperClasses wrap = new Test_WrapperClasses() ;
		wrap.test_Integer();
	}

}
