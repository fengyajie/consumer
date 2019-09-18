package com.springboot.consumer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.service.DemoService;

@Controller
public class TestController {
	@Reference
	private  DemoService demoService;
	
	@RequestMapping("/test")
	public void method() {
		demoService.sayHello("wwww");
	}

}
