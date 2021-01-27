package day5com.thinkitive;

public class Test {
public static void main(String[] args) {
	try {
		hello();
	} catch (ex e) {
		// TODO Auto-generated catch block
		System.out.println("insuffcient fund");
	}
}

private static void hello() throws ex {
	int  fund=1000;
	if(fund>=20000)
	{
		System.out.println("succefull ");
	}
	else
	{
		ex i=new ex();
		throw i;
	}
}
}
