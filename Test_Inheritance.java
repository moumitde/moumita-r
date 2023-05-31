package com.May2023;

public class Test_Inheritance extends Parent
{
	Test_Inheritance()
	{
		super(20);
		System.out.println("IN child constructor");
		
	}
	
	public void test()
	{
		//cannot use super keyword to access a private method from the parent class
		super.i = 10 ;
	}
	
  public static void main(String[] args) 
  {
	// Parent par = new Parent();
	 Test_Inheritance child = new Test_Inheritance();
	 
	// par = child ;
	 
  }
}

class Parent
{
	//can we call the private variable from child class
	private int i = 10;
	
	Parent()
	{ }
	
	Parent(int i)
	{
		System.out.println("Updated value:- "+i);
	}
}
