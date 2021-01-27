package day6;

import java.util.Comparator;

public class empsalarycomparator implements Comparator<emp1>{

	@Override
	public int compare(emp1 e1, emp1 e2) {
		if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
			else if(e1.getSalary()<e2.getSalary())
			{
				return -1;
			}
			else
				return 0;
		}
	}


