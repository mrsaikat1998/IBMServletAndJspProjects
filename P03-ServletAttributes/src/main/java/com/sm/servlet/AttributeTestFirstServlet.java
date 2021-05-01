package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttributeTestFirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>WELCOME </h1>");
		// set attributes
		// 1st step get ServletContext Object
		ServletContext application = getServletContext();
		//set the attributes
		application.setAttribute("name", "Saikat");
		application.setAttribute("email", "mr.saikat1998@gmail.com");
		application.setAttribute("mobileNo", "8159082082");
		application.setAttribute("address", "WB");
		application.setAttribute("company", "IBM");
		out.println("Click Here : <a href='s2'>Click</a>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
