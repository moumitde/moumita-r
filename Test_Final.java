package com.May2023;

public class Test_Final {
	
	final int i;
	
	//final variable i must be initialized in all the constructors of a class , else it will throw a compiler error
	Test_Final()
	{
	    i= 20 ;	
	}
	
	Test_Final(int i)
	{
		this.i= i;
	}

	public static void main(String[] args)
	{
         final StringBuffer buff = new StringBuffer();
         //Reassigning a final reference variable is NOT allowed but the object is allowed to be modified
         //buff = new StringBuffer(10);
         
         buff.append('s');
         System.out.println(buff);
         
	}

}
