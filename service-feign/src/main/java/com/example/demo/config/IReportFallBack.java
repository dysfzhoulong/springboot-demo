package com.example.demo.config;

import org.springframework.stereotype.Component;
/**
 * 降级服务处理
 * @author lbx
 */
@Component
public class IReportFallBack implements IReportService {

	@Override
	public String hello() {
		return "get error";
	}

}
