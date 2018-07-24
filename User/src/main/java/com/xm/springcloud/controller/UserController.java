package com.xm.springcloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xm.springcloud.pojo.User;
import com.xm.springcloud.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xm
 * @since 2018-07-24
 */
@RestController("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public User getById(@PathVariable("id") Long id) {
		User user = userService.selectById(id);
		return user;
	}

	@GetMapping("/haha")
	public String haha() {
		return "Hello world";
	}
	
}

