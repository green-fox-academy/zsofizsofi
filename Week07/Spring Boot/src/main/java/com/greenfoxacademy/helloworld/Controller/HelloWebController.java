package com.greenfoxacademy.helloworld.Controller;

import com.greenfoxacademy.helloworld.Greeting;
import com.greenfoxacademy.helloworld.Hellos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller

public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " Zsófi");
        return "greeting";
    }

    AtomicLong atomicLong = new AtomicLong(0);

    @RequestMapping("/web/grtng")
    public String greeting4(Model model, @RequestParam(value = "name") String userName) {
        model.addAttribute("number", atomicLong.incrementAndGet());
        model.addAttribute("name", userName);
        return "greetingCount";
    }

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/web/hello")
    public String greeting5(Model model) {
        List <Hellos> hello = new ArrayList<>();
        // hello.add(new Hellos("Miredita", "red", 3));
        // hello.add(new Hellos("Ahalan", "green", 4));

        for (String h : hellos) {
            double fontSize = Math.random() * 49 +1;
            double [] color = {Math.random()* 254 + 1, Math.random()* 254 + 1, Math.random()* 254 +1 };
            Hellos hi = new Hellos(h, color, fontSize);
            hello.add(hi);
        }

        model.addAttribute("hellos", hello);
        return "greetingDifferentLanguage";
    }




}
