import java.util.Scanner;

 class Emp {
	Scanner sc=new Scanner(System.in);
private int empid;
private String empname;
private int salary;
public static Emp e;
static int cnt=0;
private Emp()
{
	this.empid=1;
	this.empname="amit";
	this.salary=2333;
}
public void dis()
{
	System.out.println(empid);
}
public static Emp intxx()
{
	/*if(e==null)
	{
e=new Emp();
	return e;
		}
	else
	{
		System.out.println("cant create object");
		return e;
		
	}  */
	if(cnt<=1)
	{
		Emp e=new Emp();
		cnt++;
		return e;
	}
	else
		System.out.println("cannnnnnot");
	return e;
	
}
public int getEmpid() {
	System.out.println("enter empid");
	
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String string) {
	this.empname = string;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void print()
{
	System.out.println(this.getEmpname());
	System.out.println(this.getEmpid());
	System.out.println(this.getSalary());
}

}
