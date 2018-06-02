package com.cloud.test.service;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignServiceHystric implements HelloFeignService{

	@Override
	public String getMessage(String name) {
		return "sorry"+name;
	}

}
