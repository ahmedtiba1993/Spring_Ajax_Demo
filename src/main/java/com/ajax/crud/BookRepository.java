package com.ajax.crud;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	Optional<Book> findByBookName(String bookName);

}
