package com.example.demo.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="eureka-client",fallback=IReportFallBack.class)
public interface IReportService {
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String hello();
}
