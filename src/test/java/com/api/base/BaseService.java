package com.api.base;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {// wrapper for Rest Assured !
	
	//this class is responsible for Base URI, Creating the request, Handling the Response
	
	private static final  String BASE_URL = "http://64.227.160.186:8080";   //Constant variable always in upper case and when we use final its come with static only for the variables not for the methods
	// create instance variable 
	private RequestSpecification requestSpecification;
	
	public BaseService() {  // a default constructor to initialize the instance variable 
		requestSpecification = given().baseUri(BASE_URL);	
	}
	
	//create method (payload means body) for header we use inbuilt functionlity "contentType"
	protected Response postRequest(String payload,String endpoint) {  //we use response instead of void 
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

}
