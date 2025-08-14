package com.shreyash.CRUDApp.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;

import com.shreyash.CRUDApp.Employee.Employee;
import com.shreyash.CRUDApp.Util.HibernateUtil;
import com.shreyash.CRUDApp.Dao.EmployeeDao;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			Session s = HibernateUtil.getFactory().openSession();
			Employee c = s.get(Employee.class, id);	
			
			if (c==null) {
				Employee emp = new Employee();
				  emp.setId(Integer.parseInt(request.getParameter("id")));
				  emp.setName(request.getParameter("name"));
				  emp.setPhone(request.getParameter("phone"));
				  emp.setDesignation(request.getParameter("designation"));
				  emp.setDepartment(request.getParameter("department"));
				  emp.setSalary(Double.parseDouble(request.getParameter("salary")));
				  emp.setEmail(request.getParameter("email"));
				 
				  EmployeeDao dao = new EmployeeDao();
				  System.out.println("Saving employee: " + emp);
				  dao.save(emp);
				  System.out.println("Saved!");
				  response.sendRedirect("Success.html");
			} else {
				response.getWriter().println("The User Already exist in our Database");
			}
			
			
			  
			  
		} catch (Exception e) {
			e.printStackTrace();
			 response.getWriter().println("ERROR: " + e.getMessage());
		}
	}

}
