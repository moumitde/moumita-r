package com.Test2;

public class Test_Methods 
{
	public void test()
	{
		String n = "abc";
		String m = "Abc";
		String o = "ghi" ;
		
		System.out.println(n.compareToIgnoreCase(m));
	}
	
	public Test_Methods methodCh1()
	{
		return this ;
	}
	
	public Test_Methods methodCh2()
	{
		return this ;
	}
	
	public Test_Methods methodCh3()
	{
		Test_Methods met = methodCh1().methodCh1();
		return this ;
	}
	
	public static void main(String[] args) 
	{
		Test_Methods method = new Test_Methods();
		method.test();
		
		
	}

}
