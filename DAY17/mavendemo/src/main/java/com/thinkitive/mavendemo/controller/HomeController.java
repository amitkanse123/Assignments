package com.thinkitive.mavendemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thik.Employee;
import com.thik.empservice;
import com.thik.service;

@Controller
public class HomeController {
	
	

	@RequestMapping(value = "/addemp")
public ModelAndView test(@RequestParam("eid") int eid, @RequestParam("ename") String ename,
			@RequestParam("salary") int salary, @RequestParam("choice") String choice) throws IOException {

	ModelAndView model = new ModelAndView();

		if (choice.equals("add")) {
		//	s.addEmployee(new Employee(eid, "ename", salary));
			model.addObject("msg", "sucsessfully added");
			model.setViewName("home.jsp");
			return model;

		}
		if (choice.equals("getall")) {

		}   
		System.out.println(eid);
		return model;
			
		
	} 
}
