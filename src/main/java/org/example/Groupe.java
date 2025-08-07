package org.example;

import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private String name;
    private List<User> Users;

    public Groupe(String name) {
        this.name = name;
        this.Users = new ArrayList<>();
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

    public void setUsers(List<User> users) {
        Users = users;
    }
}