package com.kkhibernate.client;

import org.hibernate.Session;

import com.kkhibernate.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			String SQL="SELECT version();";
			String result=(String) session.createNativeQuery(SQL).getSingleResult();
			System.out.println("MYSQL version is :::: ");
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
