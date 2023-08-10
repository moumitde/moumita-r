package com.api;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.json.JSONObject;

public class API_Test 
{
	String baseURI = "https://reqres.in";
	
	@Test
	public void get_API_test()
	{
		String baseURI = "https://reqres.in";
		
		Response response = given().contentType(ContentType.JSON)
		.when().get(baseURI+"/api/users?page=2");
		
	   System.out.println(response.getBody().prettyPrint());
		//System.out.println(response.getBody().asString());
		
		//System.out.println(response.then().statusCode(200));
		
		//System.out.println(response.then().body("[8].email", equalTo("abc")));
	   
	   //Fetch a list of all headers
	   System.out.println("PRINT ALL HEADERS:- "+response.getHeaders().asList());
		
	   //Using then() to extract the headers 
	   System.out.println(response.then().extract().headers());
	   
	   //Validating the presence of a particular header
	   System.out.println("PRINT VALUE OF A PARTICULAR HEADER:- "+response.then().extract().headers().hasHeaderWithName("Content-Type"));
		
	   //EXTRACT particular values from a JSON
	   
	  String strn = response.then().extract().asString();
	   
	 String emailVal = response.then().extract().path("data[0].page");
	 System.out.println("Print Email Value: "+emailVal);
	 
	 //USING JSONPATH - NOT WORKING
	 JsonPath resPath = response.jsonPath();
	String emal= resPath.get("[0].email");
	System.out.println(emal);
	
	
	JSONObject ob = new JSONObject(strn);
		
	}
	
	@Test
	public void post_API_test()
	{
		/*String reqBody="{
				     \"name\": \"morpheus\",
				     \"job\": \"leader\" }" ;*/
		
		/*
		 * String reqBody = \"{ \"id\": 77232, \"name\": \"Hansel\",
		 * \"status\": \"alive\" }\";
		 */		
		/*
		 * Response response = given().contentType(ContentType.JSON).body(reqBody)
		 * .when().post(baseURI+"/api/users");
		 */
		//System.out.println(response.asPrettyString());
		
		
	}
	
	@Test
	public void get_API_test2()
	{
		String baseURI = "https://reqres.in";
		
		Response response = given().contentType(ContentType.JSON)
		.when().get(baseURI+"/api/users?page=2");
		
	   System.out.println(response.getBody().prettyPrint());
		//System.out.println(response.getBody().asString());
		
		//System.out.println(response.then().statusCode(200));
		
		//System.out.println(response.then().body("[8].email", equalTo("abc")));
	   
	   //Fetch a list of all headers
	   System.out.println("PRINT ALL HEADERS:- "+response.getHeaders().asList());
		
	   //Using then() to extract the headers 
	   System.out.println(response.then().extract().headers());
	   
	   //Validating the presence of a particular header
	   System.out.println("PRINT VALUE OF A PARTICULAR HEADER:- "+response.then().extract().headers().hasHeaderWithName("Content-Type"));
		
	   //EXTRACT particular values from a JSON
	 String emailVal = response.then().extract().asString();
	 System.out.println("Print RESPONSE of the GET request in JSON format:-  "+emailVal);
	 
	 //USING JSONPATH - ***Must download the dependency for JSON PATH in order for this to work***
	 JsonPath resPath = new JsonPath(emailVal);
	 String page= resPath.getString("page");
	 System.out.println("Print output from the JsonPath validation:- "+page);
	 
	 int id = resPath.getInt("data[1].id");
	 System.out.println("Print the id from the JsonPath validation:- "+id);
	
	
		
	}
	
	@Test
	public void testFilterSession()
	{
		given().contentType(ContentType.JSON).when().
	}

}
