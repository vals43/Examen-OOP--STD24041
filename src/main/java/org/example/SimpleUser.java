package org.example;

public class SimpleUser extends User {

    public SimpleUser(String id, String name, String email) {
        super(id, name, email);
    }
    public Publication createPublication(String Title,String content) {
            return new Publication(Title ,this, content);
        }
    public void AddComment(Publication pub, Comment comment) {
            pub.AddComments(comment);
    }

}
