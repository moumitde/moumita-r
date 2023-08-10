package com.newTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Test_Java8 
{
	//11th JUNE 2023
	public static void java8_sortList()
	{
		//ASCENDING ORDER
		List<String> list = new ArrayList<>(Arrays.asList("unix","java","oracle","sql"));
		
		List<String> newlist = list.stream().sorted().toList();
		
		System.out.println(newlist);
		
		//DESCENDING ORDER
		List<String> reverseSort = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(reverseSort);
		
	}
	
	public static void filterList()
	{
		List<String> list = new ArrayList<>(Arrays.asList("unixTest","javaTest","oracle","sql"));
		
		List<String> newList = list.stream().filter(a->a.contains("Test")).toList();
		
		//OR
		
		newList = list.stream().filter(a->a.contains("Test")).collect(Collectors.toList());
		
		System.out.println(newList);
	}
	
	public static void removeDuplicates()
	{
		List<String> list = new ArrayList<>(Arrays.asList("unix","unix","java","cobol"));
		
		List<String> newList = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newList);
	}
	
	//SORTED FUNCTION
	public static void sortList()
	{
	   List<String> listofString = Arrays.asList("java","unix","sql","oracle");
	   List<String> sortedList = listofString.stream().sorted().collect(Collectors.toList());
	   System.out.println(sortedList); //[java, oracle, sql, unix]
	}
	
	//MAP FUNCTION
	public static void mapValues()
	{
		List<Integer> intList = new ArrayList<>(Arrays.asList(1,5,6,8));
		List<Integer> mappedList = intList.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(mappedList);  //[1, 25, 36, 64]
	}
	
	//ALL MATCH
	public static void allMatch()
	{
		
		List<String> list = new ArrayList<>(Arrays.asList("apple","mango","kiwi"));
		boolean anyMatchVal = list.stream().anyMatch(a -> (a.equals("apple")));
		System.out.println("Print AnyMatch :- "+anyMatchVal);
		
		boolean allMatchVal = list.stream().allMatch(a -> (a.equals("apple")));
		System.out.println("Print AllMatch:- "+allMatchVal);
	}
	
	//ANY MATCH
	public static void anyMatch()
	{
		
	}
	
	public static void main(String[] args) 
	{
		//java8_sortList();
		//filterList();
		//removeDuplicates();
		//sortList();
		//mapValues();
		allMatch();
	}
	

}
