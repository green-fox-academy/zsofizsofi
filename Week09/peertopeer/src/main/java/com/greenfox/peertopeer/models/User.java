package com.greenfox.peertopeer.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String username;

    public User() {
        this.id = 1L;
    }

    public User(String username) {
        this();
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
