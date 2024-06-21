package com.example.library.service;

import com.example.library.entities.Book;
import com.example.library.models.request.BookDTO;
import org.springframework.stereotype.Service;

public interface BookService {
    public Book AddBookByAdmin(BookDTO bookDTO);
}
