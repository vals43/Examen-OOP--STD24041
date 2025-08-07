package org.example;

public class Comment {
    private int id;
    private User author;
    private String text;
    private int PublicationId;

    public Comment(int id, User author, String text, int PublicationId) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.PublicationId = PublicationId;
    }
}
