package com.thik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class employee
 */
@WebServlet("/dothis")
public class employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Mydbconnection db;
   
    public employee() {
        super();
        // TODO Auto-generated constructor stub
    }
   
    public void init() throws ServletException {
    	super.init();
    	db = new Mydbconnection();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	     PrintWriter out = response.getWriter();
	     int eid=0;
	     String ename="";
	     int salary=0;
	     String  operator="";
	     try
	     {
	     eid=Integer.parseInt(request.getParameter("eid"));
	     ename=request.getParameter("ename");
	      salary=Integer.parseInt(request.getParameter("salary"));
	     operator = request.getParameter("operator");
	     }
	     catch(Exception e)
	     {
	    	 out.println("ready");
	     }
	
	    if(operator.equals("ADD")) {
			db.insertEmployee(eid, ename, salary);
			out.println("inserted suceesfully");
		}

	    else if(operator.equals("UPDATE")) {
			db.updateEmployee(eid,ename,salary);
			out.println("upadted suceesfully");
		}
	    else if(operator.equals("DELETE")) {
			db.deleteEmployee(eid,ename,salary);
			out.println("deleted suceesfully");
		}
	    else if(operator.equals("SHOW")) {
			
			out.println(db.selectEmployee());
		}
	    
	      /* else if(operation.equals("Update")) {
			db.updateEmployee(eid, ename, salary);
			response.sendRedirect("showservlet");
		}else if(operation.equals("Delete")) {
			db.deleteEmployee(eid, ename, salary);
			response.sendRedirect("showservlet");
		}  */
    
	    
	   
	     
	  
	     
	     
		

}
}
