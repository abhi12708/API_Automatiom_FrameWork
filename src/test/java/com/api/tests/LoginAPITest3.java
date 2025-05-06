package com.api.tests;

import org.testng.annotations.Test;
import com.api.base.AuthService;

import io.restassured.response.Response;

public class LoginAPITest3 {
	
	@Test (description = "Verify if Login API is working.....")
	public void loginTest() {
		 //create object of Authservice
		AuthService authService = new AuthService();
		Response response = authService.login("{\"username\": \"Abhi0515\", \"password\": \"Abhi0515@\"}");
		System.out.println(response.asPrettyString());
				
	}

}
