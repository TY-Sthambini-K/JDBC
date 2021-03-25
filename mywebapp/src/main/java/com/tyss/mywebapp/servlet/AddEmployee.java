//package com.tyss.mywebapp.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Date;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.tyss.design.dto.EmployeeInfo;
//
//public class AddEmployee extends HttpServlet {
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		resp.setContentType("text/html");
//		PrintWriter out = resp.getWriter();
//
//		String name = req.getParameter("name");
//		int departmentId = Integer.parseInt(req.getParameter("departmentId"));
//		String desgination = req.getParameter("desgination");
//		String joinningDate = req.getParameter("joinningDate");
//		int managerId = Integer.parseInt(req.getParameter("managerId"));
//		long mobileNo = Long.parseLong(req.getParameter("mobileNo"));
//		String officalMailId = req.getParameter("officalMailId");
//		double salary = Double.parseDouble(req.getParameter("salary"));
//
//		EmployeeInfo emp = new EmployeeInfo();
//		emp.setName(name);
//		emp.setDeptid(departmentId);
//		Date doj = Date.valueOf(doj);
//		emp.setJoinningDate(doj);
//		emp.setDesgination(desgination);
//		emp.setManagerId(managerId);
//		emp.setMobileNo(mobileNo);
//		emp.setOfficalMailId(officalMailId);
//		emp.setSalary(salary);
//
////		int count = EmpDAO.save(e);
////		if (count > 0) {
////			out.println("Record saved successfully!");
////			req.getRequestDispatcher("index.html").include(req, resp);
////
////		} else {
////			out.println("Sorry! unable to save record");
////		}
////
////		out.close();
//	
//	}
//}
