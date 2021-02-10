package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
public class empservice {
	
	public void addEmployee(Employee e)
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		session.close();
		factory.close();
	//	list.add(e);
	}
	

	  
	public  List getall() {
		Configuration cfg = new Configuration();
			SessionFactory factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession(); 
			Transaction tx = session.beginTransaction();
		
				Query q = session.createQuery("From  Employee");
				List l=q.list();
			System.out.println(l);
				tx.commit();
			session.close();
			factory.close();
			return l;
	
	}
	
}

