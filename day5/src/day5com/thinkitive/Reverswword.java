package day5com.thinkitive;

public class Reverswword {
public static void main(String[] args) {
	String s="Hello world how are u";
	char ar[]=s.toCharArray();
	String res="";
	String res1="";
	for(int i=0;i<ar.length;i++)
	{
		int k=i;
		while(i<ar.length && ar[i]!=' ')
		{
			i++;
		}
		int j=i-1;
		while(j>=k)

	{
		res=res+ar[j];
		j--;
	}
		res=res+" ";
	
}
	System.out.println();
}
}
