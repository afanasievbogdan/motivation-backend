package com.example.data;

import javax.persistence.*;

@Entity
@Table
public class Quotes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String author;
    private String content;
    private String theme;
    private String createdAt;
    private String updatedAt;

    public Quotes() {
    }

    public Quotes(String id, String author, String content, String theme, String createdAt, String updatedAt) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.theme = theme;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
