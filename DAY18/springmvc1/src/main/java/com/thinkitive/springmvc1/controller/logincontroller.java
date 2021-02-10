package com.thinkitive.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class logincontroller {
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public ModelAndView test(String username,String password)
	{
		//Myclass1 obj=new Myclass1();
	ModelAndView model = new ModelAndView();
	if(username.equals("admin") && password.equals("admin"))
	{
		System.out.println("sucess");
		model.setViewName("dictonary");
		return model;
	}
	
	else
	{
		return model;
	}

		
			
		
	} 

	
}
