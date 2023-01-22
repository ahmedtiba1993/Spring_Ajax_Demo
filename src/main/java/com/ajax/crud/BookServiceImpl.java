package com.ajax.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		Optional<Book>  b = this.bookRepository.findByBookName(book.getBookName());
		if(!b.isEmpty()) {
			throw new RuntimeException("Erreur 123"); 
		}
		
		this.bookRepository.save(book);
	}
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		
		 return bookRepository.findAll();
	}
	

}
