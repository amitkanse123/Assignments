package day7com.thikitive;

public class Table  {
	
	public  synchronized void print(int a)
	{
		int cnt=a;
		for(int i=1;i<=10;i++)
		{
			Thread t = Thread.currentThread();
		System.out.println(t.getName() + " :" + (cnt * i));
			
			try {
				thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	

}
