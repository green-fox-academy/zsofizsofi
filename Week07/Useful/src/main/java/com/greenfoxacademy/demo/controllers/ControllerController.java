package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.UtilityService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerController {

    private final UtilityService utility;

    public ControllerController(UtilityService utility) {
        this.utility = utility;
    }

    @RequestMapping("/useful")
    public String useful () {

        return "Links";
    }

    @RequestMapping("/useful/colored")
    public String usefulColored (Model model) {
        String color;
        color=utility.randomColor();
        model.addAttribute("color", color);
        return "Background";
    }


    @GetMapping("/login")
    public String login (Model model) {
        Fox fox = new Fox("Fox");
        model.addAttribute("foxName", fox);
        return "login";
    }

}
