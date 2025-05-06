package com.api.base;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	// create variable 
	private static final String BASE_PATH = "/api/auth/";
	
	// create login method
	public Response login(String payload) {
		return postRequest(payload,BASE_PATH+ "login");
		
	}

}
