package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ServletContextTestServlet")
public class ServletContextTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// get servlet context object by using servlet interface method
		ServletContext application = getServletContext();
		//get context-param value according to param-name
		out.println("<br>Context Param Value : <b>" + application.getInitParameter("author") + "</b>");
		out.println("<br>Context Param Value : <b>" + application.getInitParameter("email") + "</b>");
		out.println("<br>Context Param Value : <b>" + application.getInitParameter("mobileNo") + "</b>");
		out.println("<br>Context Param Value : <b>" + application.getInitParameter("address") + "</b>");
		//get context-param name
		Enumeration<String> enu=application.getInitParameterNames();
		while(enu.hasMoreElements()) {
			String paramName=(String)enu.nextElement();
			out.println("<br>Context Param name : <b>" + paramName+ "</b>");
		}
		//set context attributes 
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
