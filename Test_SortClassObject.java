package com.May2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_SortClassObject 
{
	int a = 10 ;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test_SortClassObject other = (Test_SortClassObject) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	public void sort_ClassObjects()
	{
		List<Test_SortClassObject> listOfObjects = new ArrayList<>();
		listOfObjects.add(new Test_SortClassObject());
		listOfObjects.add(new Test_SortClassObject());
		
		System.out.println("Print size of the list of Class objects:- "+listOfObjects.size()); //size of the list of objects
		
	//	Collections.sort(listOfObjects);
		/*Collections.sort(listOfObjects, new Comparator<Integer>() {
			public int compare (Integer i1, Integer i2)
			{
				return Integer.compare(i1.intValue(), i2.intValue());
			}
		});*/
		
	}

	public static void main(String[] args) 
	{
		Test_SortClassObject obj1 = new Test_SortClassObject();
		Test_SortClassObject obj2 = new Test_SortClassObject();
		
		System.out.println(obj1.equals(obj2)); //print False
		
		obj1.sort_ClassObjects();
		
	}

}
