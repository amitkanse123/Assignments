package com.thik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/operation")
public class dictonary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Myclass1 obj;
 @Override
public void init() throws ServletException {
	obj=new Myclass1();
	
}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	    String word="";
	    String meaning="";
	     String  operator="";
	     try
	     {
	     word=request.getParameter("word");
	     meaning=request.getParameter("meaning");
	     
	     operator = request.getParameter("operator");
	     }
	     catch(Exception e)
	     {
	    	 out.println("ready");
	     }
	     
	     
	    if(operator.equals("ADD")) {
			obj.insertword(word,meaning);
		}

	    else if(operator.equals("SHOW ALL")) {
	    	
	    	out.println(obj.Select());
			
		}
	    else if(operator.equals("SHOW WORD")) {
	    	out.println(obj.show(word));
	    
			
		}
	    
		
	}

}
