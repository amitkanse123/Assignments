package day6;

public class emp <E>{
  int empid;      //instance member
  String name;    
  int salary;
 
  public emp(int empid, String name, int salary)
  {
	 this.empid=empid;
	 this.name=name;
	 this.salary=salary;
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

public void printdata()
  {
	  System.out.println("ID:"+empid);
	  System.out.println("name :"+ name);
	  System.out.println("salary:" +salary);
  }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + salary;
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
	emp other = (emp) obj;
	if (empid != other.empid)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (salary != other.salary)
		return false;
	return true;
}

@Override
public String toString() {
	return "[empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}


}
