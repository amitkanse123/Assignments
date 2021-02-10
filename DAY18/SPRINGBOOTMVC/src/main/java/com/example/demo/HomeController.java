package com.example.demo;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController 
public class HomeController {
	
	@Autowired
	empservice s;
	@RequestMapping(value = "/addemp")
public ModelAndView test(int eid,String ename,int salary,String choice) throws IOException {
List l=null;
	ModelAndView model = new ModelAndView();
	
	
		if (choice.equals("add")) {
			s.addEmployee(new Employee(eid, ename, salary));
			System.out.println("sucess adding");		
			model.setViewName("hello.jsp");
			model.addObject("msg","succsessfuuly inserted");
			return model;
		
		}
		else if (choice.equals("addagain")) {
			s.addEmployee(new Employee(eid, ename, salary));
			System.out.println("sucess adding again");		
			model.setViewName("hello.jsp");
			model.addObject("msg","succsessfuuly inserted");
			return model;
		
		}
		else if(choice.equals("getall"))
		{
			System.out.println(s.getall());
		
//		/	System.out.println(l);	
			model.setViewName("hello.jsp");
			model.addObject("msg","showing");
			return model;
		}
		else
		{
			return model;
		}
	

}
}
