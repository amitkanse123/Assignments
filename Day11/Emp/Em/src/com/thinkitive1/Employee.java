package com.thinkitive1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
		int id=Integer.parseInt(request.getParameter("id1"));
		String name=request.getParameter("name1");
		MyDatabaseOperations db=new MyDatabaseOperations();
		db.insertEmp(id, name);
	//	db.updateEmp(3,name);
		out.println(db.displayEmp());
	}
	@Override
	public void init() throws ServletException {
	
		super.init();
		System.out.println("init method called");
	}
	@Override
	public void destroy() {
		
		super.destroy();
		System.out.println("destroy callded");
	}

}
