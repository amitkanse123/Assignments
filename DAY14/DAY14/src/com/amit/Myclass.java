package com.amit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Myclass {

	
	public List  getEmployees()
	{
		List l=null;
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
		Criteria c=session.createCriteria(Employee.class);
		c.add(Restrictions.gt("salary",1000));
		l=c.list();
		System.out.println(l);
		tx.commit();
		session.close();
		factory.close();
		
		return l;
	}
}
