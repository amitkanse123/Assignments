package day7com.thikitive;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class newjdbc {
public static void main(String[] args) {
	
	try {
		Class c=Class.forName("day7com.thikitive.Employee");
		
		Method m[]=c.getDeclaredMethods();
		
		for(Method x:m)
		{
			System.out.println(x.getName());
		}
		Field f[]=c.getDeclaredFields();
		for(Field x:f)
		{
			System.out.println(x.getName());
		}
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
