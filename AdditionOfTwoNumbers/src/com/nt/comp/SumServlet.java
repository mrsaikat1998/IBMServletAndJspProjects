package com.nt.comp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get PrintWriter Object
		PrintWriter out=response.getWriter();
		//set mimeType
		response.setContentType("text/html");
		//read the form data
		int firstNo=Integer.parseInt(request.getParameter("txtFirstNo"));
		int secoundNo=Integer.parseInt(request.getParameter("txtSecoundNo"));
		int result= firstNo+secoundNo;
		out.println("<h1> Result is ::"+result+"</h1>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
