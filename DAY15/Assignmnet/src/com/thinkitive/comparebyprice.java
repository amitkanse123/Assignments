package com.thinkitive;

import java.util.Comparator;

public class comparebyprice implements Comparator<Book> {

	public int compare(Book a, Book b) {
		return a.price - b.price;
	}

}
