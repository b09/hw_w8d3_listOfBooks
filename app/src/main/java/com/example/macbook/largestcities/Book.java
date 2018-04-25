package com.example.macbook.largestcities;

import java.io.Serializable;

public class Book implements Serializable {

    private String title;
    private String author;
    private Integer date;

    public Book(String title, String author, Integer date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }
}
