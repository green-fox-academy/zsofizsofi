package com.greenfox.peertopeer.models;

public class Client {

    private String id;

    public Client() {
        this.id = System.getenv("CHAT_APP_UNIQUE_ID");
    }

    public Client(String id) {
       this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
