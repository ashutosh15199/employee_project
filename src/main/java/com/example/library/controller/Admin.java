package com.example.library.controller;

import com.example.library.entities.Book;
import com.example.library.models.request.BookDTO;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class Admin {
@Autowired
BookService bookService;
    @PostMapping("/add-books")
    public Book AddBookByAdmin(@RequestBody BookDTO bookDTO){
      return bookService.AddBookByAdmin(bookDTO);
    }
    @PostMapping("/update")
    public Book updateBookDetailsByAdmin(@RequestBody Book book){
        return bookService.updateBookDetailsByAdmin(book);
    }
    @GetMapping("/all")
    public List<Book> getAllBookByAdmin(){
        return bookService.getAllBookByAdmin();
    }

}
