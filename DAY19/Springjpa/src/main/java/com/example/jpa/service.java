package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepo;
import com.example.user.User;

//@Controller
@Service
public class service {
@Autowired
	UserRepo repo;
public void add(User usr)
	
{
	repo.save(usr);
}
	
	
}
