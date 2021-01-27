package day5com.thinkitive;

public class wordcount {
public static void main(String[] args) {
	String s="hello world how world hello";
	String ar[]=s.split(" ");
	for(int i=0;i<ar.length;i++)
	{
		String key=ar[i];
		int cnt=0;
		for(int j=0;j<ar.length;j++)
		{
			if(key.equals(ar[j]))
			{
				cnt++;
			}
			if(i>j && key.equals(ar[j]))
			{
				break;
			}
			if(j==ar.length-1)
			{
				System.out.println("key="+key +" count "+cnt);
			}
		}
	}
}
}
