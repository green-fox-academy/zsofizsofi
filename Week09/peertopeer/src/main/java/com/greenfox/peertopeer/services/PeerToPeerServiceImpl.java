package com.greenfox.peertopeer.services;

import com.greenfox.peertopeer.DTO.RecievedMessageDto;
import com.greenfox.peertopeer.DTO.ResponseMessageDto;
import com.greenfox.peertopeer.models.Client;
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
    public void sendJSON(RecievedMessageDto recievedMessageDto) {

            final String url = System.getenv("CHAT_APP_PEER_ADDRESS") + ":8080/api/message/receive";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForObject("http://" + url, recievedMessageDto, ResponseMessageDto.class);

    }

    @Override
    public Iterable <Message> findAllByOrderByTimestampDesc() {

        return messageRepository.findAllByOrderByTimestampDesc();
    }
}
