package com.May2023;

public class Test_Interfaces_Java8 implements ITest1 , ITest28
{
	/*public void test()
	{
		System.out.println("in a default method");
	}*/
	
	public static void main(String[] args) 
	{
		Test_Interfaces_Java8 j8 = new Test_Interfaces_Java8();
		j8.test();
		
		ITest1.staticTest();
	}

	//The compiler will force to override atleast one of the default methods in the 2 interfaces being implemented
	@Override
	public void test() {
		// TODO Auto-generated method stub
		ITest1.super.test();
	}

	/*@Override
	public void test() {
		// TODO Auto-generated method stub
		ITest1.super.test();
	}*/

}

interface ITest1
{
	//default keyword was introduced in java 8 for default methods introduced in Interfaces
	default void test()
	{
		System.out.println("in a default method: 'ITEST1'");
	}
	
	static void staticTest()
	{
		System.out.println("In a static method: 'ITEST1'");
	}
	
	
}

interface ITest28
{
	default void test()
	{
		System.out.println("in a default method: 'ITEST2'");
	}
	
	
}
