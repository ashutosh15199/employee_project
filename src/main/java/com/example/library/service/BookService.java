package com.example.library.service;

import com.example.library.entities.Book;
import com.example.library.models.request.BookDTO;

import java.util.List;

public interface BookService {
    public Book AddBookByAdmin(BookDTO bookDTO);
    public Book updateBookDetailsByAdmin(Book book);
    public List<Book> getAllBookByAdmin();
}
