package com.example.excercise.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.excercise.entity.User;
import com.example.excercise.exception.AuthenticationException;
import com.example.excercise.exception.DuplicateUserException;
import com.example.excercise.exception.UserNotFoundException;
import com.example.excercise.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service("UserService")
@Slf4j
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	public String register(User user) {
		userRepository.findByName(user.getName()).ifPresent(userVar -> {
		    throw new DuplicateUserException("User already exists with name: ");
		});
		userRepository.save(user);
		userRepository.findByName(user.getName()).ifPresent(uname->log.info("uname is {}",uname));
		return "Saved Successfully"+user.toString();
		
	}
	
	public String authenticate(String uname,String pwd) {
		
		
		Optional<User> optuser=userRepository.findByName(uname);
		User user= optuser.orElseThrow(()->new UserNotFoundException("User not Found"));
		
		if(user.getSfsUserpassword().equalsIgnoreCase(pwd)) {
			return"login success";
		}
		else {
			throw new AuthenticationException("invalid credentials");
		}
		
		
		
		
	}
	
}
