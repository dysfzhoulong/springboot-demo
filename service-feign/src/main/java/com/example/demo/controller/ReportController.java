package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.IReportService;

@RestController
public class ReportController {
	
	@Autowired
	private IReportService iReportService;
	
	@RequestMapping("/hello")
	public String hello() {
		return iReportService.hello();
	}

}
