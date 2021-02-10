package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Empservice {

	List <Employee> list=new ArrayList<>();
	
	public List add(Employee e)
	{	
		Configuration conf=new Configuration();
		SessionFactory factory=conf.configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e);
		tx.commit();
		session.close();
		factory.close();
		list.add(e);
		return list;	
	}
	public List getall()
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
	
		//	Query q = session.createQuery("From  Employee");
		//	List l=q.list();
		Query q=session.createQuery("From Employee");
		list=q.list();
			tx.commit();
		session.close();
		factory.close();
		return list;
	}
	
}
