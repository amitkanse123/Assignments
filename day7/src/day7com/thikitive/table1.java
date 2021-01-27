package day7com.thikitive;

/* public class table1 extends Table   implements Runnable {

	
	@Override
	public void run() {
		Table t12=new Table();
t12.print(10);
}
}*/

public class table1 extends Thread {
	

	Table t;
	table1(Table t)
	{
		this.t=t;
	}
	@Override
	public void run() {
		
t.print(10);
}
}