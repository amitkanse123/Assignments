package day6;

import java.util.ArrayList;
import java.util.List;

public class emp1 implements Comparable<emp1>{
	int empid;      //instance member
	  String name;    
	  int salary;
	 private Address address;
	public emp1(int empid, String name, int salary) {
	
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public emp1(int empid, String name, int salary,Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address=address;
	}
	@Override
	public String toString() {
		return " [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(emp1 e) {
		
		if(this.empid>e.empid)
		{
			return 1;
		}
		else if(this.empid<e.empid)
			return -1;
		else 
			return 0;
	}
	
	  
	  
	  
}
