package com.Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.newTest.Test_Collections;

public class Test_Comparable implements Comparable<Test_Comparable>
{
    int number;
    String name ;
    
    Test_Comparable(int number , String name)
    {
    	this.number = number ;
    	this.name = name ;
    }
    
    
	/*
	 * @Override public int compareTo(Test_Comparable o) { return this.number -
	 * o.number; }
	 */
	
	@Override
	public int compareTo(Test_Comparable o)
	{
		return this.name.compareTo(o.name);
	}
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) 
	{
		ArrayList<Test_Comparable> arrList = new ArrayList<>();
		arrList.add(new Test_Comparable(1,"NMC"));
		arrList.add(new Test_Comparable(2, "TYV"));
		arrList.add(new Test_Comparable(9,"NMC2"));
		arrList.add(new Test_Comparable(5, "TYV4"));
		
		for(Test_Comparable val : arrList)
		{
			System.out.println(val.getName());
		}
		
        Collections.sort(arrList);		
        
        System.out.println("***after sorting***");
        for(Test_Comparable val : arrList)
		{
			System.out.println(val.getName());
		}
        
	}

}
