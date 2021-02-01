package com.thik;

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
		c.add(Restrictions.gt("salary",10000));
		
		l=c.list();
		System.out.println(l);
		tx.commit();
		session.close();
		factory.close();
		
		return l;
	}
	
	public void insertaddress()
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Address.class);

		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); // CONNECTION OPEN
		Transaction tx = session.beginTransaction();
		
	Address obj=new Address(21,"ladakh");
		session.save(obj);
		tx.commit();
		List l=session.createQuery("From Address").list();
		System.out.println(l);
		session.close();
		factory.close();
	}
	
}
