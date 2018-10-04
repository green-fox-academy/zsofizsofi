package com.greenfox.peertopeer.controllers;

import com.greenfox.peertopeer.DTO.RecievedMessageDto;
import com.greenfox.peertopeer.DTO.ResponseMessageDto;
import com.greenfox.peertopeer.models.Client;
import com.greenfox.peertopeer.models.Message;
import com.greenfox.peertopeer.models.User;
import com.greenfox.peertopeer.services.PeerToPeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@Controller
public class PeerToPeerController {

    private final PeerToPeerService peerToPeerService;

    public PeerToPeerController(PeerToPeerService peerToPeerService) {
        this.peerToPeerService = peerToPeerService;
    }


    @GetMapping("/")
    public String main(@RequestParam(required = false) String error, Model model) {

        if (!peerToPeerService.findById(1L).isPresent()) {
            return "enter";
        }
        Optional<User> user = peerToPeerService.findById(1L);
        model.addAttribute("error", error);
        model.addAttribute("usernameInput", user.get().getUsername());
        Message defaultMessage = new Message("App", "Hi there! Submit your message using the send button!");
        model.addAttribute("defaultMessage", defaultMessage);
        model.addAttribute("message", peerToPeerService.findAllByOrderByTimestampDesc());
        return "index";
    }

    @GetMapping("/register")
    public String register(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("error", error);
        return "enter";
    }

    @PostMapping("/register")
    public String registerUser(User user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            return "redirect:/register/?error=The username field is empty";
        }
        peerToPeerService.save(user);
        return "redirect:/";
    }

    @PostMapping("/update-username")
    public String updateUser(User user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            return "redirect:/?error=The username field is empty";
        }
        peerToPeerService.save(user);
        return "redirect:/";
    }

    @PostMapping("/send")
    public String send(Message message, Model model) {
        Optional<User> user = peerToPeerService.findById(1L);
        message.setUsername(user.get().getUsername());
        peerToPeerService.save(message);
        //Message newMessage = new Message(user.get().getUsername(),message.getText());
        RecievedMessageDto recievedMessageDto = new RecievedMessageDto (message, new Client());
        peerToPeerService.sendJSON(recievedMessageDto);

        return "redirect:/";
    }


    @PostMapping("/api/message/receive")
    //@CrossOrigin("*")
    @ResponseBody
    public ResponseEntity <ResponseMessageDto> reciveAndSend(@RequestBody(required = false) RecievedMessageDto recievedMessageDto, Model model) {
//        if (recievedMessage.getMessage().getId() == null) {
//            String a = "message.id";
//        }
//        if (recievedMessage.getMessage().getText() == null) {
//            String b = "message.text";
//        }
//        if (recievedMessage.getMessage().getUsername() == null) {
//            String c = "message.username";
//        }
//        if (recievedMessage.getMessage().getTimestamp() == null) {
//            String d = "message.timestamp";
//        }
//        if (recievedMessage.getClient().getId() == null) {
//            String e = "message.username";
//        }

        //return new ResponseMessage("error", "Missing field(s): " + " ");
        peerToPeerService.save(recievedMessageDto.getMessage());
        if (!recievedMessageDto.getClient().getId().equals(System.getenv("CHAT_APP_UNIQUE_ID")))
        peerToPeerService.sendJSON(recievedMessageDto);

        return new ResponseEntity <> (new ResponseMessageDto("ok"), HttpStatus.OK);
    }


}
