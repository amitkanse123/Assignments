package day4;

public class Emp {
public int empid;;
public String ename;
public Emp() {
	// TODO Auto-generated constructor stub
}
Emp(int empid,String ename)
{
	this.empid=empid;
	this.ename=ename;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	result = prime * result + ((ename == null) ? 0 : ename.hashCode());
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
	Emp other = (Emp) obj;
	if (empid != other.empid)
		return false;
	if (ename == null) {
		if (other.ename != null)
			return false;
	} else if (!ename.equals(other.ename))
		return false;
	return true;
}
@Override
public String toString() {
	return "Emp [empid=" + empid + ", ename=" + ename + "]";
}

		
	
}
