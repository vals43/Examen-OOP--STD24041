package org.example;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private int id;
    private String title;
    private User author;
    private String Content;
    private List<Comment> Comments;

    public Publication(int id, String title, User author, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.Content = content;
        this.Comments = new ArrayList<Comment>();
    }
}
