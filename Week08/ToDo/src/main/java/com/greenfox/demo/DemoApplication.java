package com.greenfox.demo;

import com.greenfox.demo.models.ToDo;
import com.greenfox.demo.repositories.ToDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private ToDoRepository toDoRepository;

    public DemoApplication(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ToDo todo1 = new ToDo();
        todo1.setTitle("Drink");

        ToDo todo2 = new ToDo();
        todo2.setTitle("Eat");

        ToDo todo3 = new ToDo();
        todo3.setTitle("Sleep");
        todo3.setUrgent(true);

        ToDo todo4 = new ToDo();
        todo4.setTitle("Learn");
        todo4.setUrgent(true);

        ToDo todo5 = new ToDo();
        todo5.setTitle("Read");
        todo5.setDone(true);


        toDoRepository.save(todo1);
        toDoRepository.save(todo2);
        toDoRepository.save(todo3);
        toDoRepository.save(todo4);
        toDoRepository.save(todo5);

        System.out.println(toDoRepository.findAll());
    }
}
