package day5com.thinkitive;

public class exception {
public static void main(String[] args) {
	try{
	String s=null;
	int a[]= {1,2};

	System.out.println(a[5]);
	
	System.out.println(s.length());	
	
}
	catch (NullPointerException e) {
		System.out.println("string empty");
	}
	catch (Exception e) {
		System.out.println("shshh");
	}
	
	try {
		connection();
	} catch (ClassNotFoundException e) {
		System.out.println("class issue");
		
	}

}
public  static void connection() throws ClassNotFoundException
{
	Class.forName("");
}
}

