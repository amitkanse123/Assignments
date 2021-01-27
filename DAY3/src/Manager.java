
public class Manager extends  Employee {
	double foodallowance;
	 double managerallownace;
	 double otherallowance;
	public Manager (String ename,double basicSalary,double medical)
	{
		super( ename, basicSalary,medical);
		 foodallowance=basicSalary*0.08;
		  managerallownace=basicSalary*0.10;
		  otherallowance=basicSalary*0.03;
		
	}
	public Manager()
	{
		
	}
	
	public double  grossSalary()
	{
		
		this.grossSalary=super.grossSalary()+this.foodallowance+this.managerallownace+this.otherallowance;
	return this.grossSalary;
	}

 
}
