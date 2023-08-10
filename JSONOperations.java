package com.testSel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONOperations 
{
	public void reverseString(String input)
	{

	    String splitArr[] = input.split(" ");
	   String revString ="" ;

	   for(String str:splitArr)
	  {
	     String revChar = "";
	     int len = str.length();

	     for(int i=len-1 ; i>=0 ; i--)
	    {
	        revChar =revChar+str.charAt(i);

	    }

	     revString = revString + revChar +" " ;
	  }

	  System.out.println("print reverse string:- "+revString);

	}
	
	public static void main(String[] args) throws IOException 
	{
		File file = new File("jsonfile.json");
		
		//Read the JSON file and convert it into a String object
		String trgrt = new String(Files.readAllBytes(file.toPath()));
		
		//parse the string and convert it into a set object
		@SuppressWarnings("deprecation")
		JsonObject parser = (JsonObject) new JsonParser().parse(trgrt);
		Set<Entry<String, JsonElement>> set = parser.entrySet();
		
		System.out.println(set);
		
	}

}
