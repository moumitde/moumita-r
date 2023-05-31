package com.May2023;

public class Test_LocalVariable extends Parent2
{
	
	int var = 12 ;
	
	public void test1()
	{
		//variable is getting altered locally and it's value is limited to this method only
		var= 123 ;
		System.out.println("Print value of var(method):- "+var);
	}
	
	public void test2()
	{
		str= "def";
		System.out.println("this.str:- "+this.str);
		System.out.println("super.str:- "+super.str);
	}
	
	public static void main(String[] args) 
	{
		Test_LocalVariable local = new Test_LocalVariable();
		System.out.println("Print value of var(main method):- "+local.var);
		
		local.test1();
		System.out.println("Print value of var(main method):- "+local.var);
		
		System.out.println("******");
		
		System.out.println("Print str value:- "+local.str);
		
		local.test2();
		
		System.out.println("Print str value:- "+local.str);
		
		//local.var = 100 ;
		//System.out.println();
		
	}

}

class Parent2
{
	String str = "abcd";
}
