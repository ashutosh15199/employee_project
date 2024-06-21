package com.example.library.serviceImpl;

import com.example.library.entities.Book;
import com.example.library.models.request.BookDTO;
import com.example.library.repo.BookRepo;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepo bookRepo;
    @Override
    public Book AddBookByAdmin(BookDTO bookDTO) {
        Book book = new Book();
        book.setBookId(bookDTO.getBookId());
        book.setTitle(bookDTO.getTitle());
        book.setAuthorName(bookDTO.getAuthorName());
        book.setBookPrice(bookDTO.getBookPrice());
        book.setPublisher(bookDTO.getPublisher());
        book.setBookCondition(bookDTO.getBookCondition());
        book.setEdition(bookDTO.getEdition());
        book.setDescription(bookDTO.getDescription());
        book.setLanguage(bookDTO.getLanguage());
        return bookRepo.save(book);
    }



}
