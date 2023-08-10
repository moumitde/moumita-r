package com.newTest;

public class Child extends Parent
{
	//Child class constructor
	/*
	 * Child() { System.out.println("Child class constructor"); }
	 */
	
	Child(String str)
	{
	  System.out.println("Child class constructor");	
	}
	
	public void test()
	{
		System.out.println("child");
	}
	
	public void check()
	{
		System.out.println("check");
	}
	
  public static void main(String[] args) 
  {
	//Parent p = new Parent();
	  Child c = new Child("abc");
	//  Parent p = new Child();
	
	//  c.test();
	  
	//  p.test2();
	  
	  
  }
}
