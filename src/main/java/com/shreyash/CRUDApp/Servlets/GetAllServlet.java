package com.shreyash.CRUDApp.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.shreyash.CRUDApp.Dao.EmployeeDao;
import com.shreyash.CRUDApp.Employee.Employee;

/**
 * Servlet implementation class GetAllServlet
 */
@WebServlet("/GetAll")
public class GetAllServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDao dao = new EmployeeDao();
		
		try {
			List<Employee> employees =dao.getAll();
			request.setAttribute("employeeList", employees);
			
			request.getRequestDispatcher("GetAll.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
