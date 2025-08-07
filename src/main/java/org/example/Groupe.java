package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Groupe {
    private Admin Admin;
    private String name;
    private final List<User> Users;
    private final List<Publication> Publications;

    public Groupe(String name, Admin Admin) {
        this.Admin = Admin;
        this.name = name;
        this.Users = new ArrayList<>();
        Users.add(Admin);
        this.Publications = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return Users;
    }

    public void AddUsers(User users) {
        Users.add(users);
    }
    public void RemoveUsers(User users) {
        Users.remove(users);
    }

    public List<Publication> getPublications() {
        return Publications;
    }

    public void AddPublications(Publication publications) {
        Publications.add(publications);
    }
    public void RemovePublications(Publication publications) {
        Publications.remove(publications);
    }
    public int getTotalPosts() {
        return Publications.size();
    }

    public boolean containsUser(User user) {
        return Users.contains(user);
    }
    public List<Publication> searchPosts(String keyword) {
        return Publications.stream()
                .filter(p -> p.getContent().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}

