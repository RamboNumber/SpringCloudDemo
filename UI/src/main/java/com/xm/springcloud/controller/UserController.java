package com.xm.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xm.springcloud.pojo.User;

@RestController
public class UserController {
	
	private static final String url = "http://127.0.0.1:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user/{id}")
	public User getById(@PathVariable("id")Long id) {
		
		return restTemplate.getForObject(url+"/user/"+id, User.class);
	}

}
