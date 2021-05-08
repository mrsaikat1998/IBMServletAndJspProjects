package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HiddenServlet")
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		try {
			response.setContentType("text/html");
			out = response.getWriter();
			String n = request.getParameter("uname");
			out.println("<form action='"+response.encodeUrl(n)+"' method='post'");
			out.println("<input type='submit' value='Submit'>");
			out.println("</form>");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			out.close();
		}
	}

}
