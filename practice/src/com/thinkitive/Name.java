package com.thinkitive;

import java.util.Comparator;

public class Name implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEname().compareTo(o2.getEname());
	}

	

}
