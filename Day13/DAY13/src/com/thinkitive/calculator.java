package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator")
public class calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  int number1, number2;
		  String operator;
		 
		     PrintWriter out = response.getWriter();
		     number1 = Integer.parseInt(request.getParameter("number1"));
		     number2 = Integer.parseInt(request.getParameter("number2"));
		     operator = request.getParameter("operator");
		     Cal obj=new Cal(number1,number2,operator);
		     obj.calc();
		     
		     if(operator.equals("/"))
		         out.write(number1 +" "+ operator +" "+ number2 + " = " + obj.getResult2());
		        else
		         out.write(number1 +" "+ operator +" "+ number2 + " = " + obj.getResult1());
		        
	}

}
