package com.newTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class CustomClass implements Comparable<CustomClass>
{
	/*
	 * Comparable -> Used for sorting the objects Collections.sort(List); list can
	 * be list of Strings or list of Wrapper Classes like Integer etc . String and
	 * Wrapper classes already implement the Comparable Interface . Hence , they can
	 * be sorted easily. For custom classes , we need to explicitly implement the
	 * Comparable Interface before we can sort the objects of the Custom class
	 */
	
	String str ;
	int id ;
	
	CustomClass(int id, String str)
	{
		this.id = id;
		this.str = str ;
	}
	
	
	//IMPLEMENT COMPARETO from COMPARABLE
	@Override
	public int compareTo(CustomClass o) {
		// TODO Auto-generated method stub
		return this.str.compareTo(o.str);
	}
	
	//IMPLEMENT COMPARE from COMPARATOR
	public static final Comparator<CustomClass> IDComparator = new Comparator<CustomClass>(){

        @Override
        public int compare(CustomClass o1, CustomClass o2) {
            return o1.id - o2.id;
        }
      
    };



	public static void main(String[] args) 
	{
         CustomClass custom1 = new CustomClass(1,"doll");
         CustomClass custom2 = new CustomClass(3,"cat");
         CustomClass custom3 = new CustomClass(5,"ball");
         CustomClass custom4 = new CustomClass(2,"apple");
         
         System.out.println(custom1.equals(custom2));
         
         List<CustomClass> list = new ArrayList<>();
         list.add(custom1);
         list.add(custom2);
         list.add(custom3);
         list.add(custom4);
         System.out.println("Print list before sorting:- "+list);
         Collections.sort(list);
         System.out.println("Print list after sorting:- "+list);
         System.out.println("***Using Comparator***");
         
         Collections.sort(list, IDComparator);
         System.out.println("Print list after sorting using Comparator:- "+list);
         
         
	}


	@Override
	public String toString() {
		return "CustomClass [str=" + str + ", id=" + id + "]";
	}

	

	

	

}
