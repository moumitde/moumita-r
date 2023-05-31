package com.May2023;

public class Test_PassByValue 
{
	
	int j = 100;
	
	public void t(int j)
	{
		j= 700;
		System.out.println("print j:- "+j);
	}
	
	private static void add(Integer[] array) {
	    array = new Integer[2];
	    array[0] = 10;
	    array[1] = 3;
	    System.out.println("*********Result from method: " + (array[0] + array[1])); //should print 13
	  }

	public static void main(String[] args) 
	{
		Test_PassByValue pass = new Test_PassByValue();
		pass.t(pass.j);
		
		System.out.println(pass.j);
		
		 Integer[] array = new Integer[2];
		    array[0] = 2;
		    array[1] = 3;
		    add(array);
		    System.out.println("***********Result from main: " + (array[0] + array[1])); //should print 5
	}
}


