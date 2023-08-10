package com.newTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test_Collections 
{
	
	
	public void arrList()
	{
		ArrayList<Integer> arr = new ArrayList<>();
		//List<Integer> arr2 = new ArrayList<>(10);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		//removing the index
		int val = arr.remove(2);
		System.out.println(arr);
		System.out.println(val);
		
		//in order to remove the integer element, we need to typecast it
		 boolean ll = arr.remove(Integer.valueOf(1));
		
		ArrayList<String> arr2 = new ArrayList<>();
		//List<Integer> arr2 = new ArrayList<>(10);
		arr2.add("a");
		arr2.add("b");
		arr2.add("c");
		
		String val2 = arr2.remove(0);
		System.out.println("arr2: -"+arr2);
		System.out.println("removed element:- "+val2);
		
		boolean val3 = arr2.remove("b");
		System.out.println("return type after removing the object:- "+val3);
		
		
		
	}

	public void linkList()
	{
		LinkedList<Integer> lin = new LinkedList<Integer>();
		lin.add(1);
		lin.add(2);
		lin.add(3);
		
		lin.removeFirst();
		lin.removeLast();
		
		System.out.println(lin);
		
		lin.remove(0);
		System.out.println(lin);
		
	}
	
	public void set()
	{
		//can add another collection like list/map to set constructor
		/*
		 * Map<Integer,String> map = new HashMap<>(); map.put(1, "a"); map.put(2, "b");
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		Collections.synchronizedList(list);
		
	}
	
	public void map()
	{
		Map<Integer,String> map= new HashMap<>();
		map.put(1, null);
		map.put(2, null);
		map.put(3, null);
		map.put(null, null);
		map.put(5, "nil");
		//string returned is the value being replaced
	String val = map.put(5, "il");
	String val2 = map.put(6, "nol");
	String val3 = map.put(7, "nole");
		
		System.out.println(map);
		System.out.println(val);
		System.out.println("Print value for entry with 6 as a key:- "+val2);
		System.out.println("Print value for entry with 6 as a key:- "+val3);
	}
	
	//10th JUNE 2023
	public static void test()
	{
		Set<Integer> set = new HashSet<>();
		 int i = 'c';
		 char ch = 26 ;
	}
	
	public static void wrapperClass()
	{
		Integer i = 1 ;
		String str = i.toString();
		
		Integer.toString(1);
	}
	
	public static void convertSetofIntegerToStrings()
	{
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		
		Set<String> set2 = new HashSet<>();
		
		for(Integer i :set)
		{
			set2.add(i.toString());
		}
		
		System.out.println(set2);
	}
	
	//11th JUNE 2023
	public static void removeDuplicatesFromList1()
	{
		//USING CONTAINS
		List<String> list = new ArrayList<>(Arrays.asList("unix","unix","cobol","sql"));
		List<String> newList = new ArrayList<>();
		for(String s:list)
		{
			if(!newList.contains(s))
				newList.add(s);
		}
		System.out.println(newList);
	}
	
	public static void removeDuplicatesFromList2()
	{
		//USING LINKEDHASHSET
		List<String> list = new ArrayList<>(Arrays.asList("unix","unix","cobol","sql"));
		//Here LinkedHashSet is used to preserve the order of elements in the list
		Set<String> set = new LinkedHashSet<>(list);
		
		list.clear();
		
		list.addAll(set);
		
		System.out.println(list);
		
		
	}
	
	public static void map_check()
	{
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		Boolean y = map.put(1, true);
		
		//GET -> Returns the value associated with the particular key
		Boolean val = map.get(1);
		
		HashMap<Integer, String> map2 = new HashMap<>();
		
		//PUT -> Returns the value associated with the same key if it exists in the map OR , returns NULL
		//if the same key is not present in the map
		String val2 = map2.put(1, "str");
		
		System.out.println(val2);
	}
	
	//13th JUNE 2023
	public static void convertListToArray()
	{
		//1st Method
		List<String> list = new ArrayList<>(Arrays.asList("apple","mango","banana"));
		int n = list.size();
		
		String str[] = new String[n];
		
		for(int i=0; i<n ;i++)
		{
			str[i]=list.get(i);
		}
		System.out.println("1st Method:- "+Arrays.toString(str));
		
		//2nd Method
		String newArr[] = list.toArray(new String[0]);
		System.out.println("2nd Method:- "+Arrays.toString(newArr));
		
		//3rd Method
		String[] slist = list.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(slist));
		
	}
	
	public static void test_finalList()
	{
		List<String> newList = new ArrayList(Arrays.asList("apple","banana","kiwi"));
		newList.add("mango");
		System.out.println(newList);
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		Test_Collections coll = new Test_Collections();
		//coll.linkList();
		//coll.arrList();
		
		//coll.map();
		//convertSetofIntegerToStrings();
		//removeDuplicatesFromList1();
		//removeDuplicatesFromList2();
		
		//map_check();
		
		//listToArray();
		//addElementToArray();
		test_finalList();
		
	}

}
