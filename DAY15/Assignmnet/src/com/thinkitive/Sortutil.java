package com.thinkitive;

import java.util.Collections;
import java.util.List;

public class Sortutil {

	
	public  static void sortbyname(List list)
	{
		Collections.sort(list, new Comparebybook());
		System.out.println("\nSorted by name :::::");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
	public  static void sortbyprice(List list)
	{
		Collections.sort(list, new comparebyprice());
		System.out.println("\nSorted by price :::::");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
