package org.example;

public class Comment {
    private int id;
    private User author;
    private String text;

    public Comment(int id, User author, String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }
}
