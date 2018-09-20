package com.greenfoxacademy.simba.controllers;

import com.greenfoxacademy.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller

public class BankAccountController {

    @RequestMapping("/show")
    public String show(Model model) {
        BankAccount lion = new BankAccount("King", true, "Simba", 2000, "lion");
        BankAccount zebra = new BankAccount("Queen", false, "Marty", 2000, "zebra");
        model.addAttribute("object", lion);
        model.addAttribute("object1", zebra);
        return "index";
    }

    @RequestMapping("/enjoy")
    public String enjoy(Model model) {
        model.addAttribute("enjoyString", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "enjoy";
    }

    @RequestMapping("/animals")
    public String fill(Model model) {
        List<BankAccount> animals = new ArrayList<>();
        BankAccount lion = new BankAccount("King", true, "Simba", 2000, "lion");
        BankAccount warthog = new BankAccount("King", true, "Pumbaa", 3000, "warthog");
        BankAccount meerkat = new BankAccount("King", false, "Timon", 5000, "meerkat");
        BankAccount lion2 = new BankAccount("Queen", false, "Nala", 4000, "lion");
        animals.add(lion);
        animals.add(lion2);
        animals.add(warthog);
        animals.add(meerkat);

        model.addAttribute("animal", animals);
        return "fillingMultiAcc";
    }

    @GetMapping("/formBankAcc")
    public String raiseBalance(Model model) {
        BankAccount lion = new BankAccount("King", true, "Simba", 2000, "lion");
        model.addAttribute("animalAnimal", lion);
        return "bankAccForm";
    }

    @PostMapping("/formBankAcc")
    public String createGreeting(BankAccount animal,Model model){
        model.addAttribute("g",animal);
        return "fillingMultiAcc";
    }
}

