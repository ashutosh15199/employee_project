package com.example.library.models.request;

import lombok.Data;

@Data
public class BookDTO {
    int bookId;
    String title;
    String authorName;
    int bookPrice;
    String publisher;
    int edition;
    String description;
    String language;
    String bookCondition;
}
