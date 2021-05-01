package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HiddenServlet")
public class FirstHiddenServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		try {
			response.setContentType("text/html");
			out = response.getWriter();
			String n = request.getParameter("uname");
			out.print("<form action='secound'>");
			out.print("<input type='hidden' name='uname' value='" + n + "'>");
			out.print("<input type='submit' value= 'go'>");
			out.print("Please Select Go for output");
			out.print("</form>");
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			out.close();
		}
	}

}
