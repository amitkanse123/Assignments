package com.thik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class practice {
public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Address a = new Address(1, "jalgao");

		Employee e = new Employee(5, "vishal", 45, a);
		
		session.save(e);
		t.commit();
		session.close();
		factory.close();
	}
	
}

