package de.todo42.workshop.bookdemo.books;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

	private String title;
	private String author;
	private String isbn;
	
	
}
