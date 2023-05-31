package com.May2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test_Generics 
{
	public void test_Extends(List<? extends Number> list)
	{
		list.forEach(a->System.out.println(a));
	}
	
	public void test_Generic()
	{
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		Collections.unmodifiableSet(set);
		
		//Collections.ch
	}
	
	
	
	public static void main(String[] args) 
	{
		Test_Generics generic = new Test_Generics();
		List<Double> lius = new ArrayList<Double>() ;
		lius.add(1d);
		lius.add(2d);
		lius.add(3d);
		
		//String d = "1" ;
		generic.test_Extends(lius);
		
	}

}
