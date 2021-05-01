package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/config")
public class ConfigTestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// create ServletConfig object
		ServletConfig config = getServletConfig();
		// getting particular init param value
		out.println("<br><b>Particular Param Value  : " + config.getInitParameter("url") + "</b>");
		out.println("<br><b>Particular Param Value  : " + config.getInitParameter("userName") + "</b>");
		out.println("<br><b>Particular Param Value  : " + config.getInitParameter("password") + "</b>");
		// getting all param name and accoeding values
		Enumeration<String> enu = config.getInitParameterNames();
		while (enu.hasMoreElements()) {
			String paramName = (String) enu.nextElement();
			out.println("<br>Param-Name : <b>" + paramName + "</b> Param-Value <b>" + config.getInitParameter(paramName)
					+ "</b>");
		}
		// get servlet class name
		out.println("<br>Servlet Name : <b>" + config.getServletName() + "</b>");
		// get context object of config interface
		ServletContext context = config.getServletContext();
		out.println("Contex Param Value : " + context.getInitParameter("owner"));
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
