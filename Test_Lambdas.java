package com.May2023;

public class Test_Lambdas
{
	public void Itest2_check()
	{
	    Itest2 test2 = (x,y) -> (x+y);	
	   System.out.println(test2.add(5,6));
	    
	   Itest2 test12 =  (x,y) ->{return (x+y);};
	   System.out.println(test12.add(8, 9));
	}
	
	public static void main(String[] args)
	{
		//Itest t= ()->System.out.println("done");
		//t.testing();
		
		Test_Lambdas lamb = new Test_Lambdas() ;
		lamb.Itest2_check();
		
	}

}


interface Itest
{
	public void testing();
}

interface Itest2
{
	int add(int a, int b);
}