package com.api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

//Need to do STATIC IMPORT for Matchers.equalTo and given()
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class Test_ReqresSpec 
{
   RequestSpecification reqSpec ;
   ResponseSpecification resSpec ;
   
   @BeforeClass
   public void setUp()
   {
	   reqSpec = new RequestSpecBuilder().
			   setContentType(ContentType.JSON).
			   setBaseUri("https://petstore.swagger.io/v2/pet").
			   build();
	   
	   resSpec = new ResponseSpecBuilder().
			   expectStatusCode(200).
			   expectContentType("application/json").
			   expectBody("status", equalTo("alive")).
			   build();
   }
   
   @DataProvider
   public Object[][] provideData()
   {
	   return new Object[][] {
		   {1,"bug","alive"},
		   {2,"riley","alive"}
	   } ;
   }
   
   @Test(priority=1)
   public void addPets()
   {
	   String reqBody = "{\"id\": 77232, \"name\": \"Riley\", \"status\": \"alive\"}";
	   
	   Response response = given().spec(reqSpec).body(reqBody).when().post();
	   
	   reqBody = "{\"id\": 77233, \"name\": \"Hansel\", \"status\": \"alive\"}";
	   
       response = given().spec(reqSpec) // Use requestSpec
               .body(reqBody) // Send request body
               .when().post(); // Send POST request
       
       System.out.println(response.body().asPrettyString());

       // Assertions
       response.then().spec(resSpec); // Use responseSpec
   }
}
