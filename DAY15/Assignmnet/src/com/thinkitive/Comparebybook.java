package com.thinkitive;

import java.util.Comparator;

public class Comparebybook implements Comparator<Book> {

	// Used for sorting in ascending order of
	// name
	public int compare(Book a, Book b) {
		return a.name.compareTo(b.name);
	}

}
