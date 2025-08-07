package org.example;

public class Admin extends Moderator{
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }
    public void removeUser(Groupe group, User user) {
        if (group.containsUser(user)) {
            group.RemoveUsers(user);
        }
    }
}
