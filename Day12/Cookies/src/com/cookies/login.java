package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/new")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
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
			/* Cookie ck=new Cookie("seesionid","123456");
			response.addCookie(ck);
			  RequestDispatcher rd=request.getRequestDispatcher("profile");  
		        rd.forward(request,response);  */
			response.sendRedirect("profile?sessionid=098765");
		}
		else
		{
			out.println("invalid usr nd password");
		}
		
		
	}

}
