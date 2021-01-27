package day7com.thikitive;

public class Demo {
public static void main(String[] args) {
	Employee e=new Employee(1,"anit",233,"mumbai");
	Employee e1=new Employee(2,"sunit",1233,"pune");
	Employee temp= new Employee();
	Employee temp1= new Employee();
	e.doserialize();
		temp=e.dodeserialize();
	//temp1=e1.dodeserialize();
	System.out.println("succ");
	System.out.println(temp);
	
	e1.doserialize();
	temp1=e1.dodeserialize();
	System.out.println(temp1);
	

	
}
}
