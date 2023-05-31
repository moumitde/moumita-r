package com.May2023;

import java.util.Arrays;

import bsh.StringUtil;

public class Test_String 
{
	
	public void test_join()
	{
		String print = String.join("/", "A","B");
		System.out.println(print);
	}
	
	// IMMUTABILITY of string does not allow modification of an object after re-assigning the reference variable 
	//StringBuffer is modified after re-assignment of reference variable
	public void test_Immutability()
	{
		String s1 = "abc";
		String s2 = s1;
		s1= s1+"def";
		System.out.println("Print s1 value:- "+s1+" and print s2:- "+s2);  //abcdef , abc
		System.out.println("Print equality of String:- "+s1.equals(s2));  //false
		System.out.println("Print equality(reference) of String:- "+s1==s2); // false
		
		StringBuffer strBuff1 = new StringBuffer("abc");
		StringBuffer strBuff2 = strBuff1 ;
		strBuff2.append("d");
		System.out.println("Print strBuff1 value:- "+strBuff1+" and print strbuff2:- "+strBuff2); //abcd and abcd
		System.out.println("Print equality of StringBuffer:- "+strBuff1.equals(strBuff2)); // true
		System.out.println("Print equality of StringBuffer(reference):- "+strBuff1.toString()==strBuff2.toString()); // false
		
	}
	
	public void test_null()
	{
		//String  str = new String(null); //**** String constructor initialised with null gives ambiguous compiler error since String has overloaded constructors
		Integer intr = new Integer(null);
		//Integer intr2 = new Integer(1);
		//System.out.println(intr.equals(intr2));
		
	}
	
	//Checking equals and hashcode in String/StringBuffer class
	public void equal_hash()
	{
		//String overrides equals and hashcode , hence the values are equal when compared
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("Comparing 2 string values:- "+s1+" and "+s2+" *** "+s1.equals(s2)); //true
		
		//StringBuffer does NOT override the equals/hashcode methods from Object class hence the values don't match after being compared
		StringBuffer buff1 = new StringBuffer("abc");
		StringBuffer buff2 = new StringBuffer("abc");
		System.out.println("Comparing 2 stringBuffer values:- "+buff1+" and "+buff2+" *** "+buff1.equals(buff2)); //false
	}
	
    public void reverse_String()
    {
    	String str = "day night";
    	char[] ch = str.toCharArray();
    	
    	for(int i = ch.length-1 ; i>0 ;i--)
    	{
    		
    	}
    }
    
    public void sort_String()
    {
    	String strng = "sdethuj";
    	char[] stArr = strng.toCharArray();
    	Arrays.sort(stArr);
    	String newStr = new String(stArr);
    	System.out.println(newStr);
    }
    
    //DATED - 22nd MAY 2023
    public void repeatChars_String(String str)
    {
    	//The -> TThhee
    	
    	int len = str.length();
    	String newStr = "";
    	
    	for(int i=0 ; i<len ; i++)
    	{
    		String st = str.substring(i, i+1);
    		newStr += st+st ;
    	}
    	
    	System.out.println(newStr);
    	
    }
    
    public int countCode(String str) 
    {
      int count = 0 ;
    		  
    	    if(str.length()<4)
    	      return count ;
    	   else if(str.equals("code"))
    	     return  count= count+1 ;
    	    
    	    
    	    for(int i=0 ; i<str.length() ; i++) 
        	{
        		if(str.charAt(i) =='c' && i+4<=str.length())
        		{
        			
        		   String sub = str.substring(i, i+4);
        		   /*for(int k=0 ; k<sub.length() ;k++)
        		   {
        			   if(sub.charAt(index))
        		   }*/
        		   
        		   if(sub.charAt(0)=='c'  && sub.charAt(1)=='o' && sub.charAt(3)=='e')
        		   {
        			   count++;
        		   }
        		   
        		}
        	}
    	    
    	     
    	   return count;
      
    }
    
    //Same code but use MATCHES method to match substring with regex
    public int countCode_2(String str) 
    {
      int count = 0 ;
    		  
    	    if(str.length()<4)
    	      return count ;
    	   else if(str.equals("code"))
    	     return  count= count+1 ;

    	    for(int i=0 ; i<str.length() ;i++)
    	    {
    	    	if(str.charAt(i)=='c' && i+4<=str.length())
    	    	{
    	    		String sub = str.substring(i, i+4);
    	    		if(sub.matches("co(.)e")) //Using MATCHES to match the substring with regex
    	    			count = count+1 ;
    	    		    //i=i+3;
    	    	}
    	    } 
    	     
    	   return count;
    }

    public void return_firstHalf(String str)
    {
    	int num = str.length()/2;
    	
    	String strVal= str.substring(0,num);
    	
    	System.out.println(strVal);
    	
    	//Return the concatenation of 2 strings excluding the first character
    	String str1 = "Hello"; String str2 = "There";
    	
    	String subStr1 = str1.substring(1);
    	String subStr2 = str2.substring(1);
    	
    	System.out.println(subStr1+subStr2);
    }
    
    public String theEnd(String str1 , boolean str2)
    {
    	//CONVERT a Character to String either using String.valueOf() or by concatenating with an empty String
    	String newStr ="";
    	int num = str1.length() ;
    	
    	if(str2)
    	{
    		return newStr+str1.charAt(0);
    	}
    	else
    		return newStr+str1.charAt(num-1);
    	
    	/* if(front)
    		   return String.valueOf(str.charAt(0));
    		   
    		  else
    		    return String.valueOf(str.charAt(str.length()-1));*/
    }
    
    public String lastChars(String a, String b)
    {
    	
    	int alen = a.length() ;
    	  int blen = b.length() ;
    	  String str = "";
    	  
    	  if((alen==0) && (blen==0))
    	      return "@"+"@" ;
    	  else if(alen==0)
    	   { a="@";
    	    return a+String.valueOf(b.charAt(blen-1)); }
    	  else if(blen==0)
    	   { b ="@";
    	    return String.valueOf(a.charAt(0)) + b; }
    	  else if(alen> 0 && blen>0)
    	     return str+a.charAt(0)+b.charAt(blen-1);
    	   
    	   return str ;
    }
    
    //REPEAT any given string (without looping)
    public void repeatString()
    {
    	String str ="common";
    	String newSt = "";
    	
    	/*String newStr = new String(new char[3]).replace("\0", str);
    	
    	System.out.println(newStr);*/
    	
    	/*for(int i=0 ; i<3 ; i++)
    	{
    		newSt+=str;
    	}
    	
    	System.out.println(newSt);*/
    	
    	String strn = new String(new char[3]);
    	//System.out.println("print new string:- "+strn);
    	System.out.println(strn.replace("\0", str));
    }
    
    
    
    public String swapLastTwoChars(String str)
    {
    	int length = str.length() ;
    	String newStrn = "";
    	
    	if(length>2)
    	{
    		String subfirst = str.substring(0, length-2);
    		String sublast = str.substring(length-2);
    		newStrn = newStrn+sublast.charAt(1)+sublast.charAt(0);
    		return subfirst+newStrn ;
    	}
    	
    	return newStrn ;
    }
    
    //USE MATCHES - Match with Regex
    public void use_matches(String str)
    {
    	boolean regex = str.matches("co(.)e");
    	System.out.println(regex);
    }
    
    //REplace the character between 'z' and 'p'
    public void replaceChar(String str)
    {
    	//USE CHARACTER ARRAY
    	/*String str = "zipXzap";
    	char ch[]= str.toCharArray();
    	for(int i=0 ; i<ch.length ;i++) 
    	{
    		if(ch[i]=='z' && ch[i+2]=='p')
    		{
    			ch[i+1] = ch[i+2];
    		}
    	}
    	
    	String newStr = new String(ch);
    	System.out.println(newStr);*/
    	
    //	String str = "zipXzap";
    	/*String newST = "";
    	for(int i=0 ; i<str.length() ;i++) 
    	{
    		if(str.charAt(i)=='z' && str.charAt(i+2)=='p')
    		{
    			//newST = newST+str.charAt(i)+str.substring(i+2);
    			String st = String.valueOf(str.charAt(i+1));
    			str= str.replace(st, "");
    			
    		}
    	}*/
    	
    	for(int i=0 ; i<str.length() ;i++)
    	{
    		if(str.charAt(i)=='z' && i+2<str.length())
    		{
    			String sub= str.substring(i, i+2);
    		}
    	}
    	
    	System.out.println(str);
    	
    }
    
    public void repeatFront(String str, int n)
    {
    	String sub = str.substring(0,n);
    	for(int i=0 ; i<sub.length() ; i++)
    	{
    		for(int j=0 ; j<sub.length()-1 ; j++)
    		{
    			System.out.print(sub);
    		}
    		System.out.println();
    	}
    }
    
    public void repeat(String str, int n)
    {
    	int len = str.length();
    	String sub = str.substring(len-n);
    	String newStr ="";
    	
    	for(int i=0 ; i<n ; i++)
    	{
    		newStr += sub;
    	}
    	
    	System.out.println(newStr);
    }
    
    public void printrepeatStr(String str ,String sep, int n)
    {
    	String newVal =""; 
    	for(int i=0 ; i<n ; i++)
    	{
    		newVal = newVal+str;
    		if(i<n-1)
    		{
    			newVal = newVal+sep;
    		}
    	}
    	
    	System.out.println(newVal);
    }
    
    
    
    
	public static void main(String[] args) 
    {
    	Test_String ts = new Test_String();
    	//ts.test_join();
    	//ts.test_Immutability();
    	//ts.test_null();
    	//ts.equal_hash();
    	//ts.sort_String();
    	//ts.repeatChars_String("The");
    	//ts.countCode("codexxcode");
    	//ts.return_firstHalf("WooHoo");
    	
    	//System.out.println(ts.theEnd("code", false));
    	
    	//ts.repeatString();
    	//ts.use_matches("code");
    	//System.out.println(ts.swapLastTwoChars("coding"));
    	
    	//ts.replaceChar("zzp");
    	//ts.repeatFront("Chocolate", 4);
    	//ts.repeat("hello", 2);
    	
    	ts.printrepeatStr("word", "x", 3);
    	
    }
}
