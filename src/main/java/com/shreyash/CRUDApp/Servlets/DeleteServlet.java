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


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDao();
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			Session s = HibernateUtil.getFactory().openSession();
			Employee c = s.get(Employee.class, id);	
			
			if (c!=null) {
				dao.delete(Integer.parseInt(request.getParameter("id")));
				request.getRequestDispatcher("Success.html").forward(request, response);
			} else {
				request.getRequestDispatcher("error.html").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
