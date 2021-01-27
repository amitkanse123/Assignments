
public class MarketingExecutive extends  Employee {
	double  tourallowance,phoneallowance;
	int kms_travelled;
	
	public MarketingExecutive (String ename,double basicSalary,double medical,int kms_travelled)
	{
		super( ename, basicSalary, medical);
		this.phoneallowance=1500;
		this.tourallowance=5*kms_travelled;
	}
	public double grossSalary()
	{
		this.grossSalary=super.grossSalary()+this.HRA+this.medical+this.phoneallowance+this.tourallowance;
		return this.grossSalary;
	}
	

}
