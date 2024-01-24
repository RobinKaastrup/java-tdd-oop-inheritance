package com.booleanuk.core;

public class Article extends Literature {

    Author author;

    public Article(String title) {
        super(title);
    }

    public Article(String title, Author author) {
        this(title);
        this.author = author;
    }



}
