package day5com.thinkitive;

public class firstletter {
	public static void main(String[] args) {
		
		String s="hellow world ";
		
	char ar[]=s.toCharArray();
	if(ar[0]>='a' && ar[0]<='z')
	{
		ar[0]=(char) (ar[0]-32);
	}
		
	System.out.println(ar);
	//=====================================================================================
	//
		String s1="hello world java  batch";
		char ar1[]=s1.toCharArray();
		String rev="";
		for(int i=0;i<ar1.length;i++)
		{
			int k=i;
			if(ar1[i]>='a' && ar1[i]<='z')
			{
				ar1[i]=(char) (ar1[i]-32);
			
			}
			while(i<ar1.length && ar1[i]!=' ')
			{
				
				i++;
			}
			int j=i-1;
			while(k<=j)
			{
				rev=rev+ar1[k];
				k++;
			}
			rev=rev+" ";
			
			
		}
		System.out.println(rev);
		
	}

}
