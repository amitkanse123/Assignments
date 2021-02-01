package com.thikitive;

public class Employee {
	private int eid;
	private String ename;
	private int salary;
	private Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	private Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
static void hello()
{
	System.out.println("hello");
}
}
