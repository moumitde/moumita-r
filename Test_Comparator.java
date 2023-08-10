package com.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Test_Comparator 
{
	String str ;
	int num ;
	
	Test_Comparator(String str,int num)
	{
		this.str = str ;
		this.num = num ;
	}
	
	
	
	/*
	 * class CompareValues implements Comparator<CompareValues> {
	 * 
	 * @Override public int compare(CompareValues o1, CompareValues o2) { return
	 * o1.s; }
	 * 
	 * }
	 */
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(5, "c");
		map.put(8, "f");
		map.put(3, "g");
		map.put(4, "t");
		
		System.out.println("Print map : "+map);
		
		//Set Of MAP entries
		Set<Entry<Integer, String>> enter = map.entrySet();
		
		Comparator<Entry<Integer, String>> comp = new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		
		//Convert set of entries to list of entries
		List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(enter);
		
		LinkedHashMap<Integer, String> link = new LinkedHashMap<Integer, String>(list.size());
		
		for(Entry<Integer, String> ent : list)
		{
			link.put(ent.getKey(), ent.getValue());
		}
		
		Collections.sort(list, comp);
		
		System.out.println("After Sorting: "+link);
		
		
		
		
		
		
	}

}
