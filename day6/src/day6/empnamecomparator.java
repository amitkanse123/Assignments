package day6;

import java.util.Comparator;

public class empnamecomparator implements Comparator <emp1>{

	@Override
	public int compare(emp1 e1, emp1 e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}
