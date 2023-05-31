package com.May2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Test_Collections 
{
	//Testing the "REMOVE" method
	public void testRemoveMethod_List()
	{
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println("Before removing: "+arr);
		
		//below operation removes the index
		/*Integer removedVal = arr.remove(1);
		System.out.println("Removed index value: "+removedVal);
		System.out.println("After removing: "+arr);*/
		
		int index = arr.indexOf(5);
		System.out.println(index);
		
		
		
		//below operation removes the object
		//boolean val = arr.remove(Integer.valueOf(1));
		
		//System.out.println("After removing: "+arr);
		//System.out.println("return type of removing an element: "+val);
		
		//USING LAMBDAS for ITERATION
		arr.forEach((a)->System.out.println("Iteration using Lambdas:- "+a));
		
		Integer var = Integer.valueOf(1);
		int b = var.intValue();
	
	}
	
	public void testIterator_List()
	{
		//ITERATOR
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
	    list.add(3);
		
		Iterator<Integer> it = list.iterator();
		
		/*while (it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		//LISTITERATOR
		
		ListIterator<Integer> listIt = list.listIterator();
		
		while(listIt.hasPrevious())
		{
			System.out.println("Iterate through a list backwards:- "+listIt.previous());
		}
		
	}
	
	public void testListMethods()
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		//Adding an element at a specified position
		list.add(0, 53);
		System.out.println("After adding an element at 0th position: "+list);
		
		//Altering an element
        list.set(1, 93); 
        System.out.println("After altering an element at 1st position: "+list);
	}

	public void testSetMethods()
	{
	   Set<Integer> set = new HashSet<>() ;
	   set.add(1);
	   set.add(2);
	   set.add(3);
	   
	   System.out.println(set);
	   //Removing an object from any collection using "remove()" method returns a boolean value
	   System.out.println(set.remove(1));
	   System.out.println(set.remove(5));
	   
	  System.out.println(set.contains(5));
	   
	}
	
	public void testForEach_List()
	{
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		
		/*for(String str: list)
		{
			if(str.startsWith("a"))
				list.add("ghi");
		}*/
		
		ListIterator<String> iter = list.listIterator();
		
		while(iter.hasNext())
		{
			if(iter.next().startsWith("a"))
			{
				iter.add("ghi");
			}
		}
		
		System.out.println(list);
	}
	
	public void testList_String()
	{
		//Below List is Immutable and modifying this will throw UnsupportedOperationException
		List<String> listString = Arrays.asList("a","b","c","d");
		System.out.println(listString);
		
		listString.add("def");
		System.out.println(listString);
	}
	
	public void testList_String2()
	{
		List<String> listStr = new ArrayList<>();
		listStr.add("abc");
		listStr.add("def");
		
		System.out.println(listStr);
		
		System.out.println(listStr.remove(1));
	}
	
	public void testList_SortMethod()
	{
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("e");
		list.add("b");
		
		System.out.println(list);
		Collections.sort(list);
		
		
		
		System.out.println(list);
		
		
		
	}
	
	public void test()
	{
	    Integer i = new Integer("1");
	    
	   // String str = new String(null);
	    
	    System.out.println(i.intValue());
	    
	    
	}
	
	public static void main(String[] args) 
	{
		Test_Collections coll = new Test_Collections();
	//	coll.test();
	//	coll.testIterator();
	//	coll.testListMethods();
		
	//	coll.testSetMethods();
		
	//	coll.testRemoveMethod();
	//	coll.testForEach_List();
		
	//	coll.testForEach_List();
		
	//	coll.testList_SortMethod();
		
		coll.test();
		
		
	}

}
