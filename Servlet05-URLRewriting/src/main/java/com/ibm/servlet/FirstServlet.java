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
			out.print("<a href='servlet2?uname="+n+"'>Visit</a>");
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			out.close();
		}
	}

}
