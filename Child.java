package com.May2023;

public class Child extends Super implements Ival1
{
	//int i=20 ;
	protected void test()
	{
	   System.out.println("protected");	
	}
	
	public void test1()
	{
		str="def";
	}
	
	public void test2()
	{
		System.out.println(this.str);
		System.out.println(super.str);
	}
	
	public void testScope()
	{
		//int i=20 ;
		for(int i=40 ; i<100 ; i++)
		{
			System.out.println(i);
		}
		int i=20 ;
	}
	
	
	
	public static void main(String[] args) 
	{
		Child c = new Child();
		System.out.println(c.str);
		c.test1();  //prints def
		c.test2();  //prints def
		System.out.println(c.str);  //prints def
		
		c.str = "ertu";
		System.out.println(c.str); //prints ertu
		
		c.test5();
		
		c.test234();
		
	}

}

class Super
{
	String str= "abc";
	
	 void test()
	{
		System.out.println("default");
	}
	 
	 //final method in the parent class cannot be overridden in the child class
	 final void test5()
	 {
		 System.out.println("print test 5");
	 }
	 
	 public void test234() {
		 System.out.println("in super class");
	 }
}

interface Ival1
{
	public void test234();
}