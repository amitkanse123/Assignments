package day7com.thikitive;

/*public class table2  extends Table implements Runnable {

	

	@Override
	public void run() {
		
		
		print(3);
		
		
	}

}*/



public class table2 extends Thread {

	Table t;
	table2(Table t)
	{
		this.t=t;
	}
	@Override
	public void run() {
		Table t12=new Table();
t.print(20);
}
}
