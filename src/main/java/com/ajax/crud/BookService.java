package com.ajax.crud;

import java.util.List;


public interface BookService {

	void saveBook(Book book);
	
	List<Book> getAllBook();

}
