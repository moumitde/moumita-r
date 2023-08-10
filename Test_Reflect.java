package com.newTest;

import java.lang.reflect.Method;

public class Test_Reflect 
{
    int i, j= 90;
    boolean v = true ;
    
    public static void test_12345(boolean t)
    {
    	System.out.println(t);
    }
    
	public static void main(String[] args) 
	{
		Class<Test_Reflect> cll = Class.forName("com.newTest.Test_Reflect");
		Class cl = Test_Reflect.class;
		System.out.println(cl.getCanonicalName());
		System.out.println(cl.getMethods());
		
		Method[] m = cl.getMethods();
		for(Method met: m)
		{
			System.out.println("Print all the method name:- "+met.getName());
		}
		
	}

}
