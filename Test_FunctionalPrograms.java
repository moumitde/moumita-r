package com.May2023;

import java.util.ArrayList;
import java.util.List;

public class Test_FunctionalPrograms 
{
	public static void test1()
	{
	   List<String> list = new ArrayList<>();
	   list.add("Ford");
	   list.add("BMW");
	   list.add("Mahindra");
	   
	   list.stream().filter(a-> a.startsWith("F")).forEach(a->System.out.println(a));
	  // list.stream().
	}
	
	public static void main(String[] args) 
	{
		test1();
	}

}
