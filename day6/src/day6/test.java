package day6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class test {
	public static void main(String[] args) {
		 Address a=new Address(123,"as");
		 Address a1=new Address(1234,"pune");
		
        emp1 e1=new emp1(11,"abc",400,a);	
		emp1 e2=new emp1(22,"lmn",220,a1);
		emp1 e3=new emp1(3,"xyz",330);
       
        
		
		List<emp1> emp=new ArrayList<emp1>();
		List<Address> add=new ArrayList<Address>();
		
		emp.add(e1);
		emp.add(e2);
		add.add(a);
		add.add(a1);
		//emp.add(e3);		
	empsalarycomparator salarycomp=new empsalarycomparator();
	empnamecomparator empname=new empnamecomparator();
Collections.sort(add);
System.out.println(add);
System.out.println(emp);

emprepo emprepo=new emprepo();
emprepo.insertemp(e1);
emprepo.insertemp(e2);
//System.out.println(emprepo.getall());

	}

}
