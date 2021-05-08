package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// read form data
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");

		/* by default servlet cookie not support white space ... its throw
		 IlligalArgumentException
		Cookie ck1 = new Cookie("name", name);
		response.addCookie(ck1);
		
		Cookie ck2 = new Cookie("address", address);
		response.addCookie(ck2);
		
		Cookie ck3 = new Cookie("age", age);
		response.addCookie(ck3);*/

		// cookies wich encoding
		response.addCookie(new Cookie("Name", URLEncoder.encode(name)));
		response.addCookie(new Cookie("Address", URLEncoder.encode(address)));
		response.addCookie(new Cookie("Age", URLEncoder.encode(age)));

		// send request to secound servlet
		out.println("<h1>Welcome " + name + " </h1>");
		out.println("<a href='s2'>GO</a>");
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
