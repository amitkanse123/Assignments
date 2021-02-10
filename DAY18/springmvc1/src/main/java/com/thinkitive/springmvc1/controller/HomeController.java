package com.thinkitive.springmvc1.controller;

import java.io.IOException;

import javax.security.auth.login.Configuration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thik.Employee;
import com.thik.empservice;

@Controller
public class HomeController {
	@Autowired
	empservice s;
	@RequestMapping(value = "/addemp")
public ModelAndView test(@RequestParam("eid") int eid, @RequestParam("ename") String ename,
			@RequestParam("salary") int salary, @RequestParam("choice") String choice) throws IOException {

	ModelAndView model = new ModelAndView();
		if (choice.equals("add")) {
			s.addEmployee(new Employee(eid, ename, salary));
			System.out.println("sucess");
	//model.addObject("msg", "sucsessfully added");
	//	model.setViewName("demo");
			
			model.setViewName("suc.jsp");
			return model;
		
		}
		else
		{
			return model;
		}
	
		
		
		
			
		
	} 
}
