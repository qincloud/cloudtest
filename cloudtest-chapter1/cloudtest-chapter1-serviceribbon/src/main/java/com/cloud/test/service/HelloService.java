package com.cloud.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Autowired
	private RestTemplate rest;
	
	public String hello(String name) {
		return rest.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
	}
}
