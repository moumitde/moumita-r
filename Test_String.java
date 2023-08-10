package com.newTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test_String 
{
	public static void testString()
	{
	  String str="asd";
	  int num = str.indexOf('a');
	  System.out.println(num);
	  
	 
	}
	
	public static void accessOddChars()
	{
		String s = "strfgio";
		for(int i= 0 ; i<s.length() ; i++)
		{
			if(i%2 != 0)
				System.out.println("Chars at odd positions:- "+s.charAt(i));
		}
	}
	
	public static void test_printUnique()
	{
		//Print aab;ccd;eef to ab cd ef
		
		String str = "aab;ccd;eef";
		String splitStr[] = str.split(";");
		
		Set<Character> setChar = new LinkedHashSet<>();
		
		char ch[] = null ;
		//int k = 0;
		
		String newString ="";
		
		for(int i=0 ; i<splitStr.length ; i++)
		{
			String s= splitStr[i];
			char chArr[] =s.toCharArray();
			
			for(char c:chArr)
			{
				setChar.add(c);
			}
		}
			
			for(char x:setChar)
			{
				newString += x;
				System.out.println("Print String values:- "+newString);
				
			}
			
			
		
		
	//	System.out.println(new String(ch));
		
	}
	
	public static void test_String()
	{
		String str ="aab;ccd;eef";
		String splitStr[]= str.split(";");
		
		for(String s: splitStr)
		{
			String strn = ""; //LOCAL VARIABLE
			Set<Character> set = new LinkedHashSet<>(); //LOCAL VARIABLE
			
			System.out.println(s);
			for(int i=0 ; i<s.length() ; i++)
			{
				char c = s.charAt(i);
				set.add(Character.valueOf(c));
			}
			
			Iterator<Character> iter = set.iterator();
			
			while(iter.hasNext())
			{
				
				strn+=iter.next();
			}
			
			System.out.println("print string:- "+strn);
			
			//set.clear();
			System.out.println(set);
		}
		
		
	}
	
	public static void test_s()
	{
		Character c = 'c';
		String str = ""+c;
		System.out.println(str);
	}
	
	//4th JUNE 2023
	public static void repeatString()
	{
		String str = new String(new char[3]);
		String repl = str.replace("\0", "great");
		//Printing the below statement will print null since String object cannot be modified
		//System.out.println(str);
		System.out.println(str.replace("\0", "great"));
	}
	 
	//check varargs operation
	public static void check_varargs(int ...arr)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	//8th JUNE 2023
	public static void concatString()
	{
		String str = "abc";
		System.out.println(str.concat("d"));
		System.out.println(str);
	}
	
	public static void main(String[] args) 
	{
		//testString();
		//accessOddChars();
		//test_printUnique();
		//test_s();
		test_String();
	}

}
