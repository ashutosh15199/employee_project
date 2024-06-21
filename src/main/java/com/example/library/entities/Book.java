package com.example.library.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name="Books")
public class Book {
    @Id
   int bookId;
    @Column(name = "book_title")
   String title;
    @Column(name = "author_name")
   String authorName;
    @Column(name = "book_price")
   int bookPrice;
    @Column(name = "publisher")
   String publisher;
    @Column(name = "edition")
   int edition;
    @Column(name="description")
   String description;
    @Column(name = "language")
   String language;
    @Column(name = "book_condition")
   String bookCondition;
}
