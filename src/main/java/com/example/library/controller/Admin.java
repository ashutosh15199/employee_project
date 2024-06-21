package com.example.library.controller;

import com.example.library.entities.Book;
import com.example.library.models.request.BookDTO;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class Admin {
@Autowired
    BookService bookService;
    @PostMapping("/add-books")
    public Book AddBookByAdmin(@RequestBody BookDTO bookDTO){
      return bookService.AddBookByAdmin(bookDTO);
    }

}
