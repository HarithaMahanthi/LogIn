package com.example.excercise.service;
import com.example.excercise.entity.*;

public interface IUserService {
	String register(User user);
	String authenticate(String uname,String pwd);
	

}
