package com.May2023;

public class Test_CompareObjects 
{
	int i ;
	
	Test_CompareObjects(int i)
	{
		this.i= i ;
	}
	
	public static void main(String[] args) 
	{
		Test_CompareObjects comObj1 = new Test_CompareObjects(23);
		Test_CompareObjects comObj2 = new Test_CompareObjects(23);
		
		//Compare the 2 user-defined objects using equals()
		System.out.println(comObj1.equals(comObj2));
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test_CompareObjects other = (Test_CompareObjects) obj;
		if (i != other.i)
			return false;
		return true;
	}

}
