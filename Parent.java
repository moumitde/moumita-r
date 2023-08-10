package com.newTest;

public class Parent extends GrandParent
{
	//Parent class constructor
	Parent()
	{
	  System.out.println("Parent Constructor");	
	}
	
	Parent(String str)
	{
	  System.out.println("Parameterized Parent Constructor");	
	}
	
    public void test()
    {
    	System.out.println("Parent");
    }
    
    public void test2()
    {
    	System.out.println("test2");
    }
}
