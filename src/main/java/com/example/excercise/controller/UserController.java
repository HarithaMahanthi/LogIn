package com.example.excercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.excercise.entity.User;
import com.example.excercise.service.IUserService;
import com.example.excercise.service.UserService;

@RestController
@RequestMapping("execise/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
@PostMapping("/registerUserDetails")
	ResponseEntity<String> register(@RequestBody User user) {
	return ResponseEntity.ok(userService.register(user));
	
}

@PostMapping("/login")
ResponseEntity<String> login(@RequestBody User user){
	
	return ResponseEntity.ok(userService.authenticate(user.getName(),user.getSfsUserpassword()));
	
}
}
