package day6;

import java.util.ArrayList;
import java.util.List;

public class emprepo <E> {
	
	List<E> list=new ArrayList<E>();
	
	void insertemp(E e)
	{
		list.add(e);
	}
	void removemp(E e)
	{
		list.remove(e);
		
	}
	void update(E old,E newemp)
	{
		list.set(list.indexOf(old), newemp);
	}
	List<E> getall()
	{
		return list;
	}
	
	
	}
	
	
	
	
	
	




