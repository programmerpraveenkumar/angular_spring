package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.Service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginservice;
	@RequestMapping("login/sample")
	public String sampleMethod() {
		String response = loginservice.sampleLoginService();
		return "from rest api "+response;
	}
}
