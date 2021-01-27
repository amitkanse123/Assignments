package com.thinkitive;

public class Employee implements Comparable<Employee> {
	private int eid;
private String ename;
private int esalary;
public int getEid() {
	return eid;
}
public int getEsalary() {
	return esalary;
}
public void setEsalary(int esalary) {
	this.esalary = esalary;
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
public Employee(int eid, String ename, int esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
@Override
public String toString() {
	return " [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}
@Override
public int compareTo(Employee e1) {
	if(this.eid>e1.eid)
	{
		return 1;
	}
	else if(this.eid<e1.eid)
	{
		return -1;
	}
	else	
	return 0;
}


}
