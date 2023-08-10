package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class API_July 
{
	
	
	  RequestSpecification reqSpec = new RequestSpecBuilder().
	  setContentType(ContentType.JSON). setBaseUri("https://reqres.in").build();
	 
	
	@Test
	public void testAPI1()
	{
		RequestSpecification rest = given().contentType(ContentType.JSON);
		
		Response rest2 = given().contentType(ContentType.JSON).when().get();
		
		ValidatableResponse rest3 = given().contentType(ContentType.JSON).when().get().then().assertThat().statusCode(200);
	}
	
	@Test
	public void testAPI2()
	{
		//RestAssured.baseURI = "https://reqres.in";
		//Response response = given().spec(reqSpec).queryParam("page",2).get("/api/users");
		Response response =given().spec(reqSpec).queryParam("page",2).get("/api/users");
		String str = response.then().extract().asString();
		
		System.out.println(response.then().extract().body().asPrettyString());
		JsonPath path = new JsonPath(str);
		System.out.println(path.getString("data[1].first_name"));
		System.out.println("Print URL:- "+path.getString("support.url"));
		System.out.println("Print total_pages:- "+path.getString("total_pages"));
	}
	
	

	

}
