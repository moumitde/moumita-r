package com.May2023;

import java.util.Arrays;

public class Test_Arrays2 
{
	public void test()
	{
		int arr[] = {1,2,3,4};
		
		int arr2[] = arr;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr[0]+" "+arr2[0]);
		
		/*arr2= new int[2];
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
		*/
		/*arr2[0] = arr2[0]+10;
		System.out.println(arr2[0]);
		System.out.println(arr[0]);
		*/
		
		arr = new int[3];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
	
	//RE-ASSIGNMENT of an Array variable
	public void test_Array()
	{
		int arr1[] = {1,2,3,4};
		int arr2[] = arr1 ;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//Change one value from one array and print both array objects
		arr1[0] = 51 ;
		//Both arrays are updated with the same value
		System.out.println("update arr1[0]"+Arrays.toString(arr1));
		System.out.println("update arr1[0]"+Arrays.toString(arr2));
		
		arr1[1] = arr1[0];
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1 = null;
		System.out.println("Assign arr1 to null:- "+Arrays.toString(arr1));
		System.out.println("print arr1[0]:- "+arr1[0]);
		System.out.println(Arrays.toString(arr2));
		
		
	}

	public void reAssign_Array()
	{
	    int arr1[] = {1,2,3,4};
	    int arr2[] = arr1;
	    //Both the array references are pointing to the same object
	    System.out.println(Arrays.toString(arr1));
	    System.out.println(Arrays.toString(arr2));
	  
	    //changing value in one array will reflect the same changes in another array
	    arr1[0] = 891 ;
	    System.out.println(Arrays.toString(arr1));
	    System.out.println(Arrays.toString(arr2));
	    
	    //Re-initialise arr1 will not impact arr2
	    arr1 = new int[2];
	    System.out.println(Arrays.toString(arr1));
	    System.out.println(Arrays.toString(arr2));
	    
	}
	
	public void two_D_Array()
	{
		Object obj[][] = {{2,3},{6,7}};
		
		for(int i= 0 ; i<obj.length ; i++)
		{
			for(int j=0 ; j<obj[i].length ; j++)
			{
				System.out.println(obj[i][j]);
			}
		}
		
		System.out.println("Print 1st row of the 2-D array:- "+Arrays.toString(obj[0]));
		System.out.println("Print 2nd row of the 2-D array:- "+Arrays.toString(obj[1]));
	}
	
	
	public static void main(String[] args) 
	{
		Test_Arrays2 array = new Test_Arrays2();
		//array.test();
		//array.test_Array();
		
		//array.reAssign_Array();
		array.two_D_Array();
		
		System.out.println("print getClass:- "+array.getClass());
	}

}
