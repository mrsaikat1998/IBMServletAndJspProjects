package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class PercentageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int n3 = Integer.parseInt(request.getParameter("n3"));
		int n4 = Integer.parseInt(request.getParameter("n4"));
		int n5 = Integer.parseInt(request.getParameter("n5"));
		int sum = n1 + n2 + n3 + n4 + n5;
		float average = sum / 5f;
		float percent = (sum / 500f) * 100f;
		out.println("<br> <h1>Total No :" + sum + " </h1>");
		out.println("<br> <h1>Average :" + average + " </h1>");
		out.println("<br> <h1> Percentage :" + percent + " %</h1>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
