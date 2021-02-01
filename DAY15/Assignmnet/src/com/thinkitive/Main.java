package com.thinkitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("amit");
		l.add("suraj");
		l.add("suman");
		Book book = new Book(1, "java", l, 2000);
		Book book1 = new Book(2, "c", l, 1400);
		Book book2 = new Book(3, "c++", l, 1300);
		List l1 = new ArrayList<>();
	
		l1.add(book);
		l1.add(book1);
		l1.add(book2);
		Storeutil store = new Storeutil();
	store.addRecord(l1);
		System.out.println("\nAll records");
		for (int i = 0; i < l1.size(); i++)
			System.out.println(l1.get(i));
		System.out.println("\n NO of records");
		 System.out.println(store.getnoofrecords());
		
		Printutil print1 = new Printutil();
		print1.print(l1);
		Comparebybook com = new Comparebybook();

	/* 	Collections.sort(l1, new Comparebybook());

		System.out.println("\nSorted by name");
		for (int i = 0; i < l1.size(); i++)
			System.out.println(l1.get(i));*/
		Sortutil.sortbyname(l1);

		Sortutil.sortbyprice(l1);
	//	Collections.sort(l1, new comparebyprice());

		
	
		
	}
}
