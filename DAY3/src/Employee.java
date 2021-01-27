
public class Employee {
public   int empid;
 static int cnt=1;
public String ename;
public double basicSalary,HRA,PF,PT,grossSalary,netSalary;
public double medical;
//private int empid23;

public  Employee()
{
	this.empid=cnt;
	cnt++;
}


public Employee(String ename,double basicSalary,double medical)
{
	this();
	this.ename=ename;
	this.basicSalary=basicSalary;
	this.medical=medical;
	this.PT=200;
	this.HRA=0.5*basicSalary;
	this.PF=0.12*basicSalary;
	
	
	
}


public double grossSalary()
{
	this.grossSalary=this.basicSalary+this.HRA+this.medical;
	return this.grossSalary;
}
/**
 * 
 * @return
 */
public double  netsalary()
{
	this.netSalary=this.grossSalary()-this.PF-this.PT;
	return netSalary;
	
}
public void print()
{
	System.out.println("Empid"+empid);
	System.out.println("eNAME"+this.ename);
	System.out.println("gross"+this.grossSalary());
	System.out.println("net"+this.netsalary());
}




}
