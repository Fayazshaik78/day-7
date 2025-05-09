package com.elc.blc;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookDetails("java Basics", "Johan ", 450.0);
		System.out.println(book.getBookDetails());
	}

}
