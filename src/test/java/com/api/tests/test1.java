package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;  //whenever we use the RestAsured make sure the static import for improve readability and without class name(RestAssured) we use the method
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test1 {

	public class LoginAPITest {
		
		@Test (description = "Verify if Login API is working.....")
		public void loginTest() {
			//baseURI="http://64.227.160.186:8080";
			Response response = given().baseUri("http://64.227.160.186:8080").header("Content-type","application/json").body("{\"username\": \"Abhi0515\", \"password\": \"Abhi0515@\"}").post("/api/auth/login"); //end point
			System.out.println(response.asPrettyString());
			Assert.assertEquals(response.getStatusCode(), 200);
			
			
		}
}
}
