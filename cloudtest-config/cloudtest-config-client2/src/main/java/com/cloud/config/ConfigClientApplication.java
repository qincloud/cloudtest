package com.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@Value("${foo}")
	String foo;
	
	@Value("${democonfigclient.message}")
	String message;
	
	@RequestMapping(value="/foo",method=RequestMethod.GET)
	public String foo() {
		return foo;
	}
	
	@RequestMapping(value="/message",method=RequestMethod.GET)
	public String message() {
		return message;
	}
}
