package day6;

import java.util.ArrayList;
import java.util.List;

public class mystack <E>{
	
	
	List<E> e=new ArrayList<E>();
	
	
	
	void push(E data)
	{
		e.add(data);
		
	}
	E pop()
	{
		E data=e.remove(e.size()-1);
		return data;
	}
	void print()
	{
		System.out.println(e);
	}
			

}
