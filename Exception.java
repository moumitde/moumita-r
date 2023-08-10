package com.newTest;

import java.io.IOException;

public class Exception 
{
	//Compile-time exception thrown by a method - need to handle in the main method using throws/try-catch/throw
	public void throwCheckedException()throws IOException
	{
		System.out.println("excpetion");
	}
	
	public void throwUncheckedException()
	{
		System.out.println("unchecked exception");
	}
   
	public static void main(String[] args) throws IOException {
		
		Exception exception = new Exception();
		exception.throwCheckedException();
	
    }
}
