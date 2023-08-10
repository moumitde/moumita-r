package com.Test2;

import com.newTest.Test_Protected;
import com.newTest.Java_Test;
import com.newTest.Test_DefaultClass;

public class TestDefault_Child extends Test_DefaultClass
{
	Java_Test test2 = new Java_Test();
	public void testing()
	{
		Java_Test.testString1();	
		//test2.
	}
	
 public static void main(String[] args) {
	 
	 TestDefault_Child child = new TestDefault_Child();
	// child.test();
	 
 }
}
