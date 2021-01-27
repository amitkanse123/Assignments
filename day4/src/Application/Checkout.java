package Application;

import java.util.Arrays;

public class Checkout {
	
	public Dessertitem items[];
	
	int noi;
	public Checkout()
	{
		items=new Dessertitem[100];
		noi=0;
	}
	public void clear()
	{
		items=null;
	}
	public void addnewitem(Dessertitem item)
	{
		
	}
	public void additem( Dessertitem item[])
	{
		this.items=item;
		
	}
	public int noitems()
	{
		return items.length;
	}
	
	
	public double totalcost()
	{
		double  sum=0;
		for(Dessertitem d:items)
		{
			sum=sum+d.Costofitem();
		}
		return sum;
		
	}
	public String toString() {
		{
			String s="";
			if(items!=null)
			{
			
			for(Dessertitem d:items)
			{
				s=s+"Name  "+d.GetName() +"\n";
				s=s+" cost of item  "+d.Costofitem()+"\n";
				//System.out.println();
			}
			s=s+"total"+"============"+">>>>>>>>>>>>>>>>>>>";
			s=s+"No of items"+this.noitems()+"Total cost"+this.totalcost();
			return s;
			}
			else
			{
				System.err.println("cart empry");
				return s;
			}
		}
	}
	
	
	


}