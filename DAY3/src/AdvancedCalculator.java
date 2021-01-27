
public class AdvancedCalculator  extends Calculator{
	
	/**
	 * reutrn a/b;
	 */
	int x=20;
	public AdvancedCalculator()
	{
		super();
		
		System.out.println("advanced");
		
	}
	public int ddd(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b)
	{
		System.out.println("advanced called");
		return a+b;
	}

public int div(int a,int b)
{
	
	System.out.println(super.div(a, b));
	return a%b;
}
}
