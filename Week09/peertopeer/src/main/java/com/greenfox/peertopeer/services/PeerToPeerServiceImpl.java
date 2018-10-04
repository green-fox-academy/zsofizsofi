package com.greenfox.peertopeer.services;

import com.greenfox.peertopeer.DTO.RecievedMessageDto;
import com.greenfox.peertopeer.models.Message;
import com.greenfox.peertopeer.models.User;
import com.greenfox.peertopeer.repositories.MessageRepository;
import com.greenfox.peertopeer.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

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

    @Override
    public void save(Message message) {
        messageRepository.save(message);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Iterable <Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public void createJSON()
    {
        final String url = "http://localhost:8080/api/message/receive";

        RecievedMessageDto recievedMessageDto = new RecievedMessageDto();

        RestTemplate restTemplate = new RestTemplate();
        RecievedMessageDto result = restTemplate.postForObject( url, recievedMessageDto, RecievedMessageDto.class);
    }
}
