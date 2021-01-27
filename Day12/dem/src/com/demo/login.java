package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Integer counter = 0;
  
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
		String usr=request.getParameter("username");
		String pass=request.getParameter("password");
		if(usr.equals("admin") && pass.equals("admin"))
		{
		RequestDispatcher d=request.getRequestDispatcher("index.jsp");
		request.setAttribute("message", "success login");
		d.forward(request, response);
		}
		else
		{
			RequestDispatcher d=request.getRequestDispatcher("index.jsp");
			request.setAttribute("message", "invalid login");
			d.forward(request, response);
		}
		
	/////////////////////////////////////////////////////////////////////////////	
		HttpSession session = request.getSession();
		counter = (Integer) session.getAttribute("counter");
		if (counter != null) {
			counter++;
			RequestDispatcher d=request.getRequestDispatcher("index.jsp");
			
			request.setAttribute("counter", "counter");
			d.forward(request, response);
			
		} else {
			counter = 0;
			counter++;
			RequestDispatcher d=request.getRequestDispatcher("index.jsp");
		//	counter++;
			request.setAttribute("counter", "counter");
			d.forward(request, response);
		}
		
		
		
	}

}
