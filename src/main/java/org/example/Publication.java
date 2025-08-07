package org.example;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String title;
    private User author;
    private String Content;
    private List<Comment> Comments;

    public Publication(String title, User author, String content) {
        this.title = title;
        this.author = author;
        this.Content = content;
        this.Comments = new ArrayList<Comment>();
    }

    public String getTitle() {
        return title;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return Content;
    }

    public List<Comment> getComments() {
        return Comments;
    }

    public void AddComments(Comment Commentaire) {
        Comments.add(Commentaire);
    }
    public void RemoveComments(Comment Commentaire) {
        Comments.remove(Commentaire);
    }
}
