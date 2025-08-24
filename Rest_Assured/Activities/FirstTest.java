package Examples;
import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstTest {
	// GET https://petstore.swagger.io/v2/pet/findByStatus?status=sold
	
	@Test
	public void getRequestWithQueryParam() {
		//send request , save response 
		Response response = 
				RestAssured.given().
					baseUri("https://petstore.swagger.io/v2/pet").
					header("Content-Type","application/json").  //Request content type for Rest is always json 
					//header("Accept","*/*"). // Response contenttype by default always there but we need here json 
					queryParam("status","sold").   //
				when(). 
				    get("/findByStatus");   //continuation of path from base uri remaining
		//print response body 
		//System.out.println(response.statusCode());
		//System.out.println("=============================");
		
		//print response headers
		//System.out.println(response.getHeaders().asList());
		//System.out.println("=============================");
		//print response body
	
		//System.out.println(response.getBody().asString());
		//System.out.println(response.getBody().asPrettyString());
		//System.out.println("=============================");
		//Extract properties from response 
		String petStatus = response.then().extract().path("[0].status");  //json path 
		
		//Assertions 
		assertEquals(petStatus,"sold");    //testng asset stmt 
		
		//Rest assured Assertions 
		response.then().
		statusCode(200).
		body("[0].status", Matchers.equalTo("sold")).
		body("[0].name", Matchers.equalTo("doggie"));
			
			
		
	}// GET https://petstore.swagger.io/v2/pet/{petId}
	@Test
	public void getRequestWithPathParam() {
		//send request , save response 
		
				RestAssured.given().
					baseUri("https://petstore.swagger.io/v2/pet").
					header("Content-Type","application/json").  					
					pathParam("petId",77232).   
				when(). 
				    get("/{petId}").   // get{"/12"}
				then().
					statusCode(200).
					body("status",Matchers.equalTo("alive")).
					body("name",Matchers.equalTo("Riley"));

}
}
