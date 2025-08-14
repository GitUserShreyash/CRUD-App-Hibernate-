package com.shreyash.CRUDApp.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;

import com.shreyash.CRUDApp.Dao.EmployeeDao;
import com.shreyash.CRUDApp.Employee.Employee;
import com.shreyash.CRUDApp.Util.HibernateUtil;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int idcheck = Integer.parseInt(request.getParameter("id"));
		Session s = HibernateUtil.getFactory().openSession();
		Employee c = s.get(Employee.class, idcheck);	
		if (c!=null) {
			EmployeeDao dao = new EmployeeDao();
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			String email = request.getParameter("email");
			String designation = request.getParameter("designation");
			String department = request.getParameter("department");
			double salary = Double.parseDouble(request.getParameter("salary"));
			dao.update(id, name, phone, designation, department, salary, email);
			request.getRequestDispatcher("Success.html").forward(request, response);
		} else {
			request.getRequestDispatcher("Error.html").forward(request, response);
		}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
