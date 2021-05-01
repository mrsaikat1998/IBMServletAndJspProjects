package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/SecoundHiddenServlet")
public class SecoundHiddenServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		try {
			response.setContentType("text/html");
			out = response.getWriter();
			String n = request.getParameter("uname");
			out.println("Hello " + n);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			out.close();
		}

	}

}
