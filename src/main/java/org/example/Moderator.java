package org.example;

public class Moderator extends StandardUser {
    public Moderator(String id, String username, String email) {
        super(id, username, email);
    }

    public void deletePost(Groupe group, Publication post) {
        group.RemovePublications(post);
    }

    public void deleteComment(Publication post, Comment commentIndex) {
        post.RemoveComments(commentIndex);
    }
}

