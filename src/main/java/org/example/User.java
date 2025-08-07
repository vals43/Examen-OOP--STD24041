package org.example;

import java.time.LocalDate;

public class User {
    private final int id;
    private final String name;
    private final String email;
    private final LocalDate dateCreation;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateCreation = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }
}
