package com.greenfox.peertopeer.services;

import com.greenfox.peertopeer.models.Message;
import com.greenfox.peertopeer.models.User;

import java.util.Optional;

public interface PeerToPeerService  {
    void save(User user);

    void save(Message message);

    Optional <User> findById(Long id);

    Iterable<Message> findAll();

    void createJSON();
}
