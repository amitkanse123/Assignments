package com.thinkitive;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MyClass extends TagSupport {
	 String message;
	 public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public int doStartTag() throws JspException {
		 JspWriter out = pageContext.getOut();
		int ans=1;
		 
		try
		{
			for(int i=Integer.parseInt(message);i>=1;i--)
			{
				ans=ans*i;
			}
			
			out.println("factoroial"+ans);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return super.doStartTag();
		
	}

	
	
}

