package com.greenfox.vmi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubled doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new Doubled("Please provide an input!");
        }
        return new Doubled(input, input * 2);
    }

    static class Doubled {
        public int recived;
        public int result;

        public String error;

        public Doubled(int recived, int result) {
            this.recived = recived;
            this.result = result;
        }

        public Doubled(String error) {
            this.error = error;
        }
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Welcome greeter(@RequestParam (required = false) String name, @RequestParam (required = false) String title) {
        if (name== null) {
            return new Welcome ("Please provide a name!");
        }

        if (title == null) {
            return new Welcome ("Please provide a title!");
        }
        return new Welcome(name, title);
    }

   static class Welcome {
        public String welcome_message;
        public String error;

        public Welcome(String name, String title) {
            this.welcome_message =  "Oh, hi there " + name +", my dear " +  title + "!";
        }

        public Welcome(String error) {
            this.error = error;
        }
    }

    @GetMapping ("/appenda/{appendable}")
    @ResponseBody
    public AppendA append (@PathVariable(required = false) String appendable) {
        return new AppendA(appendable);
    }

    static class AppendA {
        public String appended;

        public AppendA(String appendable) {
            this.appended = appendable + "a";
        }
    }

    @PostMapping ("/dountil/{action}")
    @ResponseBody
    public Number dountil ((@PathVariable (required = false) String action), Integer until)
    if (until== null )

    {
        return "Please provide a number!";
    }
    {

        return new (action, until);

    }

    static class Number {
        public int until;
        public String error;

        public Number(int until) {
            this.until = until;
        }

        public Number(String error) {
            this.error = error;
        }
    }



}
