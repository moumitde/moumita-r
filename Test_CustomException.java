package com.May2023;

//Create a Custom Exception
@SuppressWarnings("serial")
class TestCustomException extends Exception
{
	private String message= null;

	public TestCustomException(String message) {
		super();
		this.message = message;
	}
	

    @Override
    public String getMessage() {
        return message;
    }

}
 
 public class Test_CustomException
 {
	 public static void main(String[] args) 
	 {
		try {
			Test_CustomException.exceptionTest(null);
			//TestException.exceptionTest("abc");
		} catch (TestCustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 static void exceptionTest(String str) throws TestCustomException
	 {
		 if(str==null)
		 {
			 throw new TestCustomException("String value is null");
		 }
		 else
			 System.out.println(str);
	 }
	 
 }
