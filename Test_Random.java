package com.newTest;

import java.util.HashSet;
import java.util.Set;

public class Test_Random 
{
	//parse ; toString() ; valueOf()
	public static void random()
	{
		 String i = Integer.toString(1);
		 
		 int parse = Integer.parseInt(i);
		 
		 String v = String.valueOf(1);
		 
		 Float f = 1.5F;
		 
		 String s = Float.toString(Float.valueOf(1.9F));
		 System.out.println(s);
		 
		 
		long l = Long.parseLong("12578678");
		 Float.parseFloat("1.5F");
         Integer.parseInt("12");
         Double.parseDouble("1.55D");
      boolean b = Boolean.parseBoolean("true");
      
      Long.valueOf(115768);
      Float.valueOf(1.5F);
      Integer.valueOf(1);
      Double.valueOf(1.5D);
    Boolean bb = Boolean.valueOf(true);
    
    String LL = Long.toString(12346);
    String F = Float.toString(1.5F);
    String D = Double.toString(1.6D);
    
    Long klj= 1547658L;
    klj.floatValue();
    klj.doubleValue();
    klj.intValue();
    
    
    Integer intj = 12 ;
    float fl = intj.floatValue();
    long ln = intj.longValue();
    
    String srty = new String("abc");
    Character.toString('c');
    
    System.out.println("***check random assignment***");
    
    int ity= 'c';
    char ch = 81 ;
    
    System.out.println("Print int value:- "+ity);
    System.out.println("Print char value:- "+ch);
    
	}
	
	public static void convertString()
	{
		String s = "aab;ccd;eef";
		
		String[] strAr = s.split(";");
		
		for(String s1: strAr)
		{
			Set<Character> setT = new HashSet<>();
			char ch[] = new char[s1.length()] ;
			int k= 0;
			
			String stt = "";
			
			for(int i=0 ; i<s1.length() ;i++) 
			{
			  setT.add(s1.charAt(i));
			}
			System.out.println("set object:- "+setT);
			
			for(char chrr :setT)
			{
				stt +=chrr;
			}
			
			//String newstr = new String(ch);
			System.out.println("Print string:- "+stt);
		}
	}
	
	public static void convertString2()
	{
		String s = "aab;ccd;eef";
		
		String[] strAr = s.split(";");
		
		for(String s1: strAr)
		{
			Set<Character> setT = new HashSet<>();
			char ch[] = new char[s1.length()-1] ;
			int k= 0;
			
			String stt = "";
			
			for(int i=0 ; i<s1.length() ;i++) 
			{
			  setT.add(s1.charAt(i));
			}
			System.out.println("set object:- "+setT);
			
			for(char c:setT)
			{
				ch[k++] = c ;
			}
			
			
			//String newstr = new String(ch);
			System.out.println("Print string:- "+new String(ch));
		}
	}
	
	public static void test2()
	{
		Integer i = 20 ;
		int j= i;
		
		System.out.println(j);
	}
	
	public static void test123()
	{
		if("string".toUpperCase() == "STRING") 
		{
			System.out.println("str");
		}
		else
			System.out.println("none");
	}
	
	public static void test_increment_decrement()
	{
		int i= 0 ;
		
		for(; i<5 ; i++)
		{
			System.out.println(i);
		}
		
		int j=0;
		while(j<6)
		{
			j+=2; //increments by 2
			System.out.println("print j:- "+j);
		}
	}

	public static void main(String[] args) 
	{
		//random();
		//convertString2();
		//test2();
		//test123();
		test_increment_decrement();
	}

}
