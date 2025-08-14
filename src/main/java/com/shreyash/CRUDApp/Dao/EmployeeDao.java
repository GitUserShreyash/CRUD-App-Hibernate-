package com.shreyash.CRUDApp.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shreyash.CRUDApp.Employee.Employee;
import com.shreyash.CRUDApp.Util.HibernateUtil;

import jakarta.persistence.Query;

public class EmployeeDao{
	
	public void save(Employee emp) {
		Session s = HibernateUtil.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.merge(emp);
		tx.commit();
		s.close();
	}
	
	public List<Employee> getAll(){
		Session s = HibernateUtil.getFactory().openSession();
		return s.createQuery("from Employee").list();
	}
	
	public Employee getById(int id) {
		Session s = HibernateUtil.getFactory().openSession();
		return s.get(Employee.class, id);		
	}
	
	public void update(int id, String name, String phone, String designation, String department, double salary, String email) {
		Session s = HibernateUtil.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		Employee emp = s.get(Employee.class, id);
		if(emp != null) {
			emp.setName(name);
			emp.setPhone(phone);
			emp.setDepartment(department);
			emp.setDesignation(designation);
			emp.setSalary(salary);
			emp.setEmail(email);
		}
		
		tx.commit();
		s.close();
	}
	
	public void delete(int id) {
		Session s = HibernateUtil.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		Query q =s.createQuery("delete from Employee where id=:id");
		q.setParameter("id",id );
		int count=q.executeUpdate();
		tx.commit();
		s.close();
	}
}