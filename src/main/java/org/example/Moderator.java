package org.example;

public class Moderator extends SimpleUser {
    public Moderator(String id, String username, String email) {
        super(id, username, email);
    }

    public void deletePublication(Groupe group, Publication publication) {
        group.RemovePublications(publication);
    }

    public void deleteComment(Publication publication, Comment commentIndex) {
        publication.RemoveComments(commentIndex);
    }
}

