package com.example.demo.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Book {


    private long authorId;
    @Id
    private String name;





    public Book(long authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    public Book() {

    }

    public long getAuthorId() {
        return authorId;
    }

    public String getName() {
        return name;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return authorId == book.authorId && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                '}';
    }
}



