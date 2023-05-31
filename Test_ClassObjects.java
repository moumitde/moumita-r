package com.May2023;

public class Test_ClassObjects extends Parent13
{
	/*Test_ClassObjects() 
	{
       System.out.println("child class constructor");
	}*/
	
	Test_ClassObjects(String str) 
	{
		super(str);
	}

	String car = "Ford" ;
	
	public void testObj()
	{
		System.out.println("Print car name:- "+car);
	}
	
	
	
	//Re-assignment of object reference variables
	public static void main(String[] args) 
	{
		Test_ClassObjects object1 = new Test_ClassObjects("ty");
		Test_ClassObjects object2 = object1 ;
		Test_ClassObjects object3 = new Test_ClassObjects("yu");
		
		//Both references - object1 and object2 are pointing to the same object. 
		object1.testObj();
		object2.testObj();
		
		//Change variable for object1 to "BMW"
		object1.car = "BMW";
		System.out.println("object1.car: "+object1.car);
		System.out.println("object2.car: "+object2.car);
		System.out.println("object3.car: "+object3.car);
		
		//object1 ref is pointing to null , hence any operations performed on this object will throw a NullPointerException
		object1 = null ;
		System.out.println("object1.car: "+object1.car);
		System.out.println("object2.car: "+object2.car);
		System.out.println("object3.car: "+object3.car);
		
		
		
		
	}

}

class Parent13
{
	Parent13(String str)
	{
		System.out.println("Parent");
	}
}