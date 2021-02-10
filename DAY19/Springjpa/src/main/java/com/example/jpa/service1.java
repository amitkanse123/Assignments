package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserRepo;
import com.example.user.User;


@RestController
public class service1 {

@Autowired
	UserRepo s1;
@GetMapping(value="/add")
public User add(User usr)
{
	s1.save(usr);
	return usr;
	
}


	
}
