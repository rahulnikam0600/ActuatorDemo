package com.example.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="custom")
@Component
public class CustomEndpoint {

	@ReadOperation
	public String customInfo() {
		return "This is cusom endpoint";
	}
	
}
