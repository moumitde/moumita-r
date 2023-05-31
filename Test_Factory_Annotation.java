package com.May2023;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Test_Factory_Annotation 
{
	
	@Factory
	public Object[] factoryType()
	{
		return new Object[] {new FactoryTest(), new FactoryTest()};
	}
	

}

class FactoryTest
{
	@Test
	public void test1()
	{
		System.out.println("print test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("print test 2");
	}
}
