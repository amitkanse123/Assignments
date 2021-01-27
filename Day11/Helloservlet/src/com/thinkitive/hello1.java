package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Helloservlet")
public class hello1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   int cnt=1;
    public hello1() {
        super();
    
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		cnt++;
		PrintWriter out=response.getWriter();
		out.println("get:ur are visitor no "+cnt);
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		String num=request.getParameter("number");
		 /*int n=Integer.parseInt(num);
		int fact = 1,i=1;
		if(n==0)
        {
        out.println("<h1>factorial of 0"+"is"+n+"</h1>");
        }
        else
        {
        while(i<=n)
        {
        fact=fact*i;
        i=i+1;
        } 
        out.println("<h1>factorial of " + n +"="+fact+ "</h1>");
        }
		out.println(user +" "+pass+"" );*/
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		cnt++;
		PrintWriter out=response.getWriter();
		out.println("get:ur are visitor no "+cnt);
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		String num=request.getParameter("number");
		int n=Integer.parseInt(num);
		out.println("username is "+ user +"  password is"+pass);
		
		int fact = 1,i=1;
		if(n==0)
        {
        out.println("<h1>factorial of 0"+"is"+n+"</h1>");
        }
        else
        {
        while(i<=n)
        {
        fact=fact*i;
        i=i+1;
        } 
        out.println("factorial of " + n +"="+fact+ "	");
        }

		
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("welcome");
	}
	public void destroy() {
		super.destroy();
		System.out.println("destroy method");
	};

}
