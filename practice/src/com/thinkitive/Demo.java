package com.thinkitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(3, "amit", 2300);
		Employee emp2 = new Employee(2, "amol", 1300);
		Employee emp3 = new Employee(5, "sumit", 2000);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.err.println("comparasion on basic of salary");
		salary comparator = new salary();
		Collections.sort(list, comparator);
		System.out.println(list);
		System.err.println("comparasion on basic of name");
		Name name = new Name();
		Collections.sort(list, name);
		System.out.println(list);
		System.err.println("fetch using iterator");
		ListIterator<Employee> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.err.println("fetch using iterator reverse");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
