package com.greenfox.peertopeer.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

@Entity
public class Message {

    @Id
    private Long id;
    private String text;
    private LocalDateTime timestamp;
    private String username;


    public Message() {
        Random rand = new Random();
        this.id = Long.valueOf((rand.nextInt(899999999) + 1000000));
        this.timestamp = LocalDateTime.now(ZoneOffset.UTC);
    }

    public Message(String username, String text) {
        this();
        this.username = username;
        this.text = text;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
