package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		//get PrintWriter object
		PrintWriter pw=response.getWriter();
		//get Date class Object
		Date date=new Date();
		//set mime type
		response.setContentType("text/html");
		//get output from browser
		pw.println("<b> Current Date and Time is "+date.toString()+"</b>");

	}

}
