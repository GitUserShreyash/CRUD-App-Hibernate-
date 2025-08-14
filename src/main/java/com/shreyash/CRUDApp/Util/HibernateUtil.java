package com.shreyash.CRUDApp.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreyash.CRUDApp.Employee.Employee;

public class HibernateUtil{
	
	public static SessionFactory getFactory() {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		return factory;
	}
}