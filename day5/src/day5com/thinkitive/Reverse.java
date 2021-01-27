package day5com.thinkitive;

public class Reverse {
public static void main(String[] args) {
	String s="Hello world";

	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	//...............................
	StringBuffer s1=new StringBuffer(s);
	System.out.println(s1.reverse());
	StringBuilder s2=new StringBuilder(s);
	System.out.println(s2.append("amit"));
	
	
}
}
