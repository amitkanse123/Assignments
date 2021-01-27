package day6;

public class generic {
	public static void main(String[] args) {
		mystack<Integer> s=new mystack<Integer>();
		s.push(12);
		s.push(122);
		s.print();
		s.pop();
		s.print();
		mystack<emp> stack=new mystack<emp>();
		emp e=new emp(1,"ss",344);
		
		stack.push(e);
		stack.print();
	}
	
	
	
			

}
