package com.thik;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Myclass1 {
	
	
	public Myclass1() {
		
	}
	public Myclass1(String word) {
	
	}
	public void insertword(String word, String meaning)
	{
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Dic.class);

		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); // CONNECTION OPEN
		Transaction tx = session.beginTransaction();
		
     Dic obj=new Dic(word,meaning);
		session.save(obj);
		tx.commit();
		session.close();
		factory.close();
	}
	
	public List Select()
	{
	//	Myclass1 obj=new Myclass1();
		Configuration cfg = new Configuration();
	cfg.addAnnotatedClass(Dic.class);

		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); // CONNECTION OPEN
		Transaction tx = session.beginTransaction();
	
			Query q = session.createQuery("From  Dic");
			List l=q.list();
		//	System.out.println(l);
			tx.commit();
		return l;
	}
	public List show(String word)
	{
		List l=null;
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
		Criteria c=session.createCriteria(Dic.class);
	
		c.add(Restrictions.eq("word1", word));
		l=c.list();
		System.out.println(l);
		tx.commit();
		session.close();
		factory.close();
		
		return l;
	}
}
