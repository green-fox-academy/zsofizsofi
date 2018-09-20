package com.greenfoxacademy.helloworld.Controller;

import com.greenfoxacademy.helloworld.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    @RequestMapping("/greetin")
    public Greeting greeting() {
        Greeting greet = new Greeting(3, "hello");
        return greet;
        //Create and pass a com.greenfoxacademy.helloworld.Greeting object when it is called.
    }

    @RequestMapping("/greeting")
    public Greeting greeting2(
            @RequestParam(value = "name", required = true) String name) {
        Greeting greet = new Greeting(2, "Hello, " + name);
        return greet;
    }

    AtomicLong atomicLong = new AtomicLong(0);
    AtomicLong atomicLong2 = new AtomicLong(0);

    @RequestMapping("/abc")
    public Greeting greeting3(
            @RequestParam(value = "name", required = true) String name) {
        Greeting greet = new Greeting(atomicLong.incrementAndGet(), "Hello, " + name + "! This site was loaded " + atomicLong2.incrementAndGet() + " times since last server start.");
        return greet;
    }
}
