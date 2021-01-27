package day4;

import com.thikitive.Emp1;

public class object extends Emp1 {
	public static void main(String[] args) {
	Emp e1=new Emp(1,"amit");
		Emp e2=new Emp(1,"amit");
		System.out.println(e1);
		System.out.println(e2);
	System.out.println(e1.equals(e2));
		System.err.println(e1.hashCode());
		System.err.println(e2.hashCode());
	object o=new object();
	
	System.out.println(o.empid);
	System.out.println(o.salary);
		
		
	}
	

}
