
public class demo {
	int empid;
	 static  int cnt=0;
	
public demo() {
	empid=cnt;
	cnt++;
	
}

public static void main(String[] args) {
	demo d=new demo();
	demo d1=new demo();
	demo d2=new demo();
	demo d3=new demo();
	System.out.println(cnt);
	
	
}

}
class demo1 extends demo
{
	
}
