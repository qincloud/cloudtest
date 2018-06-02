package com.cloud.test.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi",fallback=HelloFeignServiceHystric.class)
public interface HelloFeignService {
	
	@RequestMapping(value="/hi",method = RequestMethod.GET)
	public String getMessage(@RequestParam(value = "name") String name);
}
