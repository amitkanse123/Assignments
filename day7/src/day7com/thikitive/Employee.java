package day7com.thikitive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	public Employee() {
		super();
	}
	private int eid;
transient  private String ename;
 transient private int esalary;
private String eaddress;

public Employee(int eid, String ename, int esalary,String address) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
	this.eaddress=address;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress + "]";
}
public   void doserialize()
{
	try {
		FileOutputStream fos=new FileOutputStream("demo.serial");
		
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
			fos.close();
	}	 catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	
}


public Employee dodeserialize()
{
	Employee e=null;
	FileInputStream fis;
	try {
		fis = new FileInputStream("demo.serial");
		try {
			ObjectInputStream ois=new ObjectInputStream(fis);
			try {
				e=(Employee) ois.readObject();
				ois.close();
				fis.close();
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	return e;
	
}



}
