package com.newTest;

public class Java_Test {
	
	public static void testString1()
	{
		String text="abc";
		System.out.println(text.hashCode());
	}
	
	public static void testSwitch(char ch)
	{
		switch(ch)
		{
		  case 'a': System.out.println("a");
		  break;
		  
		  case 'b':System.out.println("b");
		  break;
		  
		  case 'c': System.out.println("c");
		  
		  default:
			  System.out.println("none");
		
		}
	}
	public static void reverseString(String input)
	{

	    String splitArr[] = input.split(" ");
	   String revString ="" ;

	   for(String str:splitArr)
	  {
	     String revChar = "";
	     int len = str.length();

	     for(int i=len-1 ; i>=0 ; i--)
	    {
	        revChar =revChar+str.charAt(i);

	    }

	     revString = revString + revChar +" " ;
	  }

	  System.out.println("print reverse string:- "+revString);

	}
	
	public static void testArray1()
	{
		int arr[]= new int[2];
		arr[0] = 2;
		arr[1] = 3;
	}
	
	//show method that has array as a return type
	public static int[] testArray2()
	{
		int newarr[]= {1,2,3,4};
		return newarr ;
	}
	
	//show method that accepts array as a parameter
	public static void testArray3(int arr[])
	{
		int charr []=arr;
		for(int i=0 ; i<charr.length ;i++)
		{
			System.out.println(charr[i]);
		}
		
		System.out.println("print the first character: "+charr[0]);
		System.out.println("print the last character: "+charr[charr.length-1]);
		
	}
	
	public static void test(int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			for(int j=n-1 ; j>=i ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void fib()
	{
		int i = 2;
		String val = Integer.toString(i);
		System.out.println(String.valueOf(val));
		
		boolean bool = val instanceof String;
		System.out.println(bool);
	}
	
	public static void fibonacci(int len)
	{
		int f1 = 0;
		int f2 = 1; 
		int f3 = 0 ;
		
		System.out.print(f1+" "+f2);
		
		for(int i=0 ; i<len ; i++)
		{
			f3 = f1+f2 ;
			System.out.print(" "+f3+" ");
			//int temp = 
			f1=f2;
			f2=f3;
			
		}
		
		
	}

	public static void main(String[] args)
	{
		//testSwitch('b');
		//testArray3(testArray2());
		//test(5);
		//fib();
		//fibonacci(8);
		reverseString("moumita dey");
	}

}
