package com.thik;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mydbconnection {
	private Configuration cfg;
	private SessionFactory factory;
	private Session session;
	private Transaction tx;

	public Mydbconnection() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
	
	}

	public void startSession() {
		session = factory.openSession();
		tx = session.beginTransaction();
	}

	public void closeSession() {
		session.close();
	}

	public void insertEmployee(int eid, String ename, int salary) {
		Employee e = new Employee(eid, ename, salary);

		startSession();
		session.save(e);
		tx.commit();
		closeSession();
	}
	
	public List selectEmployee()
	{
		Query q = session.createQuery("From   Employee ");
		List l=q.list();
		System.out.println(l);
		tx.commit();
		return l;
	}
	public void updateEmployee(int eid,String ename,int salary)
	{
		 /* try
		{
int id=eid;
		 Employee student = (Employee)session.load(Employee.class, eid);
		  
	student.setSalary(340000);
		session.update(student);
		  System.out.println("updated Successfully");
		  session.getTransaction().commit();
		     session.close();
	}
		catch(NumberFormatException e)
		{
			System.out.println("jdjdjd");
		}  */		
		Employee e = new Employee(eid, ename, salary);
		startSession();
		session.update(e);
		tx.commit();
		closeSession();
	}
	
/*	public void delete()
	{
		 Employee student = (Employee)session.load(Employee.class, 12);
		  session.delete(student);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     session.close();
	
	}
	*/
	

	public void deleteEmployee(int eid, String ename, int salary) {
		Employee e = new Employee(eid, ename, salary);

		startSession();
		session.delete(e);
		tx.commit();
		closeSession();
	}
	
}
