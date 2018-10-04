package com.greenfox.peertopeer.DTO;

import com.greenfox.peertopeer.models.Client;
import com.greenfox.peertopeer.models.Message;

public class RecievedMessageDto {

    private Client client;
    private Message message;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public RecievedMessageDto() {
        this.client = client;
    }


}
