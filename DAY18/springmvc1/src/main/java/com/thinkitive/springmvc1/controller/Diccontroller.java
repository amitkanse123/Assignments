package com.thinkitive.springmvc1.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dictonary.Myclass1;
import com.thik.Employee;

@Controller
public class Diccontroller {
	@RequestMapping(value = "/operation")
	public ModelAndView test(String word,String meaning,String operator)
	{
		Myclass1 obj=new Myclass1();
	ModelAndView model = new ModelAndView();
	if(operator.equals("ADD"))
	{
		obj.insertword(word, meaning);
		model.setViewName("suc");
		return model;
	}
	else if(operator.equals("SHOW ALL"))
	{
	System.out.println(obj.Select());
	model.setViewName("suc");
	return model;
	}
	else
	{
		return model;
	}

		
			
		
	} 

}
