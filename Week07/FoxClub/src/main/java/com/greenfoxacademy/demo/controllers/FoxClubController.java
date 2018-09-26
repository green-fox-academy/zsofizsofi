package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller

public class FoxClubController {
    @RequestMapping ("/")
    public String foxClubOpeningPage() {
        return "index";
    }


    @GetMapping("/useful/email")
    public String login (Model model) {
        Fox fox = new Fox("Fox");
        model.addAttribute("foxName", fox);
        return "login";
    }

    @PostMapping ("/login")
    public String(){
        return "login";
    }

    @PostMapping("/formBankAcc")
    public String createGreeting(BankAccount animal,Model model){
        model.addAttribute("g",animal);
        return "fillingMultiAcc";
    }
}
