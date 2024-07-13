package com.example.library.serviceImpl;

import com.example.library.models.request.BookDTO;
import com.example.library.entities.Book;
import com.example.library.repo.BookRepo;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Book updateBookDetailsByAdmin(Book book){
        Optional<Book> existingBook=bookRepo.findById(book.getBookId());
        Book book1=new Book();
        if(existingBook.isPresent()){
          book1.setBookCondition(book.getBookCondition());
          book1.setBookPrice(book.getBookPrice());
          book1.setLanguage(book.getLanguage());
          book1.setEdition(book.getEdition());
          book1.setPublisher(book.getPublisher());
        }
        return bookRepo.save(book1);
    }

    public List<Book> getAllBookByAdmin(){
        Iterable<Book> bookIterable= bookRepo.findAll();
        List<Book> bookList=new ArrayList<>();
        for (Book book:bookIterable){
         bookList.add(book);
        }
        return bookList;
     }

}
