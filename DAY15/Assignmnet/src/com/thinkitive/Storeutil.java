package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

public class Storeutil<T> {

	  List <T>l1 = new ArrayList<T>(); 
	
	
	


	public void addRecord(T data) {
		l1.add(data);
	
	}
	public   List getRecords()
	{
		return l1;
	}
	public int getnoofrecords()
	{
		
	return l1.size();
	}
}
