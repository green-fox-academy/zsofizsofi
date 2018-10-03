package com.greenfox.peertopeer.controllers;

import com.greenfox.peertopeer.models.Message;
import com.greenfox.peertopeer.models.User;
import com.greenfox.peertopeer.services.PeerToPeerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeerToPeerController {

    private final PeerToPeerService peerToPeerService;

    public PeerToPeerController(PeerToPeerService peerToPeerService) {
        this.peerToPeerService = peerToPeerService;
    }


    @GetMapping("/")
    public String main(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("error", error);
        Message defaultMessage = new Message("App", "Hi there! Submit your message using the send button!");
        model.addAttribute("defaultMessage", defaultMessage);
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
//
//    @PostMapping ("api/message/receive")
//    @ResponseBody
//    public Message blabla () {
//        return;
//    }

}
