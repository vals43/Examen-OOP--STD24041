package org.example;

public class SimpleUser extends User {

    public SimpleUser(int id, String name, String email) {
        super(id, name, email);
    }

    public Publication createPost(String Title,String content) {
            return new Publication(Title ,this, content);
        }
    public void comment(Publication pub, Comment comment) {
            pub.AddComments(comment);
    }

}
