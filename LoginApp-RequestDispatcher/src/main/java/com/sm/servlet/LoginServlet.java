package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// set MIME Type
		response.setContentType("text/html");
		// get PrintWriter Object
		PrintWriter out = response.getWriter();
		// get form data
		String uName = request.getParameter("userName");
		String pwd = request.getParameter("password");
		if (pwd.equals("saikat")) {
			// if password is correct then go to user welcome page
			RequestDispatcher rd = request.getRequestDispatcher("/welcome");
			rd.forward(request, response);
		}
		else {
			out.println("<b> Password Mismatch</b>");
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}

	}

}
