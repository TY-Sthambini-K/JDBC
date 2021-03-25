package com.tyss.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.design.dao.EmployeeJPAImpl;
import com.tyss.design.dto.EmployeeInfo;
import com.tyss.design.service.EmployeeService;

@WebServlet("/users")  
	public class SaveServlet extends HttpServlet {  
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        String id = request.getParameter("eid");
	        String name=request.getParameter("name");  
	        String email =request.getParameter("email");  
	       
	        int status;  

	          
	        EmployeeInfo e=new EmployeeInfo();  
	        e.setName(name);    
	        e.setEmail(email);  
	         EmployeeService ser = new EmployeeService();
	          status.createEmployeeDetail(e);
	        if(status>0){  
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("index.html").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	    }  
}
