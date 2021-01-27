package day7com.thikitive;

public class demo1 {
public static void main(String[] args) {
	/* thread t1=new thread();
	thread1 t2=new thread1();
	t1.start();
	t2.start();*/
	Mythread m=new Mythread();
	
	Thread t=new Thread(m);
	Thread th=new Thread(m);
	
 //t.start();
 //th.start();
	
	Table t11=new Table();
 //table1 t1=new table1();
 //table2 t2=new table2();
 Thread t3=new Thread();

 
 table1 t1=new table1(t11);
 table2 t2=new table2(t11);
 t1.setName("table1");
 t2.setName("table2");
 //t1.setPriority(4);
 t2.setPriority(10);
 
 t1.start();
 t2.start();
}
}	