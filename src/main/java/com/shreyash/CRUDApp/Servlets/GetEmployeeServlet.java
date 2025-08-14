package com.shreyash.CRUDApp.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.shreyash.CRUDApp.Dao.EmployeeDao;
import com.shreyash.CRUDApp.Employee.Employee;

@WebServlet("/GetEmployee")
public class GetEmployeeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("getting emp...");
			EmployeeDao dao = new EmployeeDao();
			Employee emp =dao.getById(id);
			System.out.println(emp);
			request.setAttribute("employee", emp);
			request.getRequestDispatcher("DisplayEmployee.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
