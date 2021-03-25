package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	Date dateref = new Date();
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1> current date and time is:-"+dateref+"<h1>");
	out.println("</body>");
	out.println("</html>");
	
	resp.setContentType("text/html");
	resp.setHeader("refresh", "1");
//	super.doGet(req, resp);
	
}
}
