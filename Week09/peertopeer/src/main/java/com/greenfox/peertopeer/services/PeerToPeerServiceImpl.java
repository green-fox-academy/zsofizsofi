package com.greenfox.peertopeer.services;

import com.greenfox.peertopeer.models.User;
import com.greenfox.peertopeer.repositories.MessageRepository;
import com.greenfox.peertopeer.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class PeerToPeerServiceImpl implements PeerToPeerService {
    private final UserRepository userRepository;
    private final MessageRepository messageRepository;

    public PeerToPeerServiceImpl(UserRepository userRepository, MessageRepository messageRepository) {
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
    }


    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
