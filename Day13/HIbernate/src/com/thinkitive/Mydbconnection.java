package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mydbconnection {
	public Mydbconnection() {
		
	}
	
	Configuration cfg = new Configuration();

	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession(); // CONNECTION OPEN

	Transaction tx = session.beginTransaction();

	public void insertEmployee() {
		Employee e = new Employee(12, "amol", 12000);

	//	Query q = session.createQuery("From   Employee ");
		session.save(e);
	/*	List l = q.list();
		System.out.println(l);  */
		tx.commit();

		session.close();
	//	factory.close();	
	}
	
	public void selectEmployee()
	{
		Query q = session.createQuery("From   Employee ");
		List l=q.list();
		System.out.println(l);
		tx.commit();
		
	}
	public void updateEmployee()
	{

		 Employee student = (Employee)session.load(Employee.class, 12);
		  
	student.setSalary(34000);
		session.update(student);
		  System.out.println("updated Successfully");
		  session.getTransaction().commit();
		     session.close();
	}
	
	public void delete()
	{
		 Employee student = (Employee)session.load(Employee.class, 12);
		  session.delete(student);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     session.close();
	
	}
	
	
}
