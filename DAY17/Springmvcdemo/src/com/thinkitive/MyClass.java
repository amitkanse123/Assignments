package com.thinkitive;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyClass {

	@Autowired
	Calculator calculator;
	@RequestMapping(value="/hi",method=RequestMethod.POST)
	public ModelAndView bye(@RequestParam("username")String usr,@RequestParam("password")String pass)
	{
		 System.out.println("by post");
		System.out.println(usr);
		System.out.println(pass);

	
		String usr1=usr;
		ModelAndView model=new ModelAndView();	
		if(usr.equals("admin") && pass.equals("admin"))
		{
			model.addObject("msg","login success");
			model.setViewName("welcome.jsp");
			return model;
		}
		else
		{
			System.out.println(usr1);
			System.out.println(pass);
			System.out.println("sjskk");
		model.addObject("msg","login failed");
		model.setViewName("index.jsp");
		return model;
		}
		
	}
	@RequestMapping(value="/add")
public ModelAndView add(Integer a,Integer b)
{
		ModelAndView model=new ModelAndView();	
		model.addObject("add" ,"ans is: "+calculator.add(a, b));
		model.setViewName("welcome.jsp");
		return model;
		
}
		
}
	

