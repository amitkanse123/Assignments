package com.thik;

import org.springframework.stereotype.Service;


public class Employee {
private int eid;
private String ename;
private int salary;
public Employee() {
	super();
}
public Employee(int eid, String ename, int salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + eid;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (eid != other.eid)
		return false;
	return true;
}


}
