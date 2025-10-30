package com.backend.chapterVerse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.chapterVerse.entity.Book;
import com.backend.chapterVerse.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> getAllBooks()
	{
		return bookRepository.findAll();
	}
	
	public Book getBookById(Long id)
	{
		return bookRepository.findById(id).orElse(null);
	}
}
