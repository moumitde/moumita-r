package com.newTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Test_Arrays 
{
	public static boolean checkEqualityOfArrays()
	{
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,2,4,5};
		
		if(arr1.length != arr2.length)
			return false;
		else
			return Arrays.equals(arr1, arr2);
	}
	
	public static void sortArray()
	{
		
	}
	
	public static int removeDuplicatesFromArray(int a[])
	{
		//Here the ARRAY must be SORTED
		int n = a.length;
		
		int j=0 ;
		
		for(int i=0 ; i<n-1 ; i++)
		{
			if(a[i]!=a[i+1])
				{a[j++] = a[i]; }
		}
		
		a[j++]=a[n-1];
		
		//System.out.println(j);
		
		return j ;
	}
	
	public static void removeDuplicateUsingMap()
	{
		int arr[] = {1,3,5,6,5,7,8,7};
		HashMap<Integer,Boolean> map = new HashMap<>();
	
		for(int i=0 ; i<arr.length ; i++)
		{
			map.put(arr[i], true);
		}
		
		System.out.println("Remove Duplicates Using MAP object:- "+map.keySet());
		
	}
	
	public static void sort_Arrays()
	{
		Integer arr[]= {13,1,7,8,9};
		
		Arrays.sort(arr);
		
		System.out.println("Print array after sorting in ascending order:-"+Arrays.toString(arr));
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		System.out.println("Print array after sorting in descending order:-"+Arrays.toString(arr));
		
	}
	
	public static void sortBySwapping()
	{
		int [] arr = {10,7,8,2,3,1};
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				int temp = 0 ;
				
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	//13th JUNE 2023
	public static void uniqueElements()
	{
		int [] array = {1,1,2,2,3,3};
		int n= array.length;
		int temp[] = new int[n];
		int k=0;
		
		for(int i=0 ; i<n-1 ; i++)
		{
			if(array[i]!=array[i+1])
				temp[k++]=array[i];
		}
		
		temp[k++]= array[n-1];
		
		System.out.println("Print only even elements:- "+Arrays.toString(temp)+" value of k "+k);
		
		for(int i=0; i<k ; i++)
		{
			System.out.println("Print all elements from the new array:- "+temp[i]);
		}
		
		//Re-initialise original array with size of the temporary array 	
		array = new int[k];
		
		//
		for(int i=0; i<k ; i++)
		{
			array[i] = temp[i];
		}
		
		System.out.println("Print array:- "+Arrays.toString(array));
	}
	
	public static void addElementToArray1()
	{
		//Initialise a new array with 1 size greater than the original array
		
		int arr[] = {1,3,5,8};
		int n = arr.length;
		System.out.println("length of the array is:- "+n);
		
		int newArr[] = new int[n+1];
		
		for(int i=0 ; i<n ; i++)
		{
			newArr[i]= arr[i];
		}
		
		newArr[n] = 100 ;
		
		System.out.println(Arrays.toString(newArr));
		
	}
	
	
	public static void addElementToArray2()
	{
		//ADD an element to Array using ArrayList
		Integer arr[]= {1,3,5,8,9};
		
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		
		list.add(50);
		
		arr = list.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void test()
	{
		List<Integer> list = new ArrayList<Integer>() ;

		list.add(1);
		list.add(5);
		list.add(6);

		Integer num[] = new Integer[list.size()];

		num = list.toArray(num);

		System.out.println(Arrays.toString(num));
		
		for(int i=0 ; i<num.length ; i++)
		{
			System.out.println(num[i]);
		}
	}
	

	public static void main(String[] args) 
	{
		//System.out.println(checkEqualityOfArrays());
		int a[] = { 1, 2,2, 3, 3, 4, 4, 4, 5, 5,6, 6 };
		
		int n = removeDuplicatesFromArray(a);
		
		for(int i= 0 ; i<n ;i++)
		{
			System.out.println(a[i]);
		}
		
		//removeDuplicateUsingMap();
		
		//sort_Arrays();
		
		//sortBySwapping();
		
		//uniqueElements();
		
		//addElementToArray1();
		
		test();

	}

}
