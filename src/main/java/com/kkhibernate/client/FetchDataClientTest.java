package com.kkhibernate.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.kkhibernate.entities.Address;
import com.kkhibernate.entities.Employee;
import com.kkhibernate.util.HibernateUtil;

public class FetchDataClientTest {

	public static void main(String[] args) {
		Employee employee = null;
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	    	employee = session.get(Employee.class, 1);
	    	System.out.println(employee);
	    	Address address = employee.getAddress();
	    	System.out.println(address);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	    
	  }
}
