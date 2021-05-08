package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class SecoundServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// get cookie from request object
		Cookie[] ck = request.getCookies();

		/*With out decoding
		out.println("<br> Hello Mr. " + ck[0].getValue());
		out.println("<br>Your Address " + ck[1].getValue());
		out.println("<br> Your Age :: " + ck[2].getValue());*/

		// with decoding
		out.println("<br>" + ck[0].getName() + " " + URLDecoder.decode(ck[0].getValue()));
		out.println("<br>" + ck[1].getName() + " " + URLDecoder.decode(ck[1].getValue()));
		out.println("<br>" + ck[2].getName() + " " + URLDecoder.decode(ck[2].getValue()));
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
