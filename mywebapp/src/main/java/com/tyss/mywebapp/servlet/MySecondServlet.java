package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/login")
public class MySecondServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String user = req.getParameter("user");
	String password = req.getParameter("password");
	PrintWriter out = resp.getWriter();
	System.out.println(user);
	System.out.println(password);
//	System.out.println(req.getParameter(user));
//	System.out.println(req.getParameter(password));
	out.print(user);
	out.print(password);
}
}
