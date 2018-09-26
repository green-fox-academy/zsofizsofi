package com.greenfox.demo.controllers;

import com.greenfox.demo.models.ToDo;
import com.greenfox.demo.repositories.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ToDoController {

    private final ToDoRepository toDoRepository;

    public ToDoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    @RequestMapping(value = {"/todo", "/todo/list"})
    public String list(Model model) {
        model.addAttribute("todos", toDoRepository.findAll());
        return "todolist";
    }

    @RequestMapping("/todo/isActive=true")
    public String isActive(Model model) {
        List<ToDo> activeList = new ArrayList<>();
        for (ToDo element : toDoRepository.findAll()) {
            if (!element.isDone() == true) {
                activeList.add(element);
            }
        }
        model.addAttribute("activeTodos", activeList);
        return "activeTodos";
    }

    @GetMapping("/todo/add")
    public String showForm() {
        return "addTodosForm";
    }

    @PostMapping("/todo/add")
    public String addNewTodo(ToDo newTodo) {
        toDoRepository.save(newTodo);
        return "redirect:/todo";
    }

    @RequestMapping("todo/{id}/delete")
    public String delete(Model model, @PathVariable (value = "id") Long id) {
     // List<ToDo> list = new ArrayList<>();
//        for (ToDo element : toDoRepository.findAll()) {
//            if (!(element.getId() == id)) {
//                list.add(element);
//            }
//        }
        Optional<ToDo> todo = toDoRepository.findById(id);
        if(todo.isPresent()) {
            toDoRepository.delete(todo.get());
        }
        return "redirect:/todo";
    }

    @GetMapping("/todo/{id}/edit")
    public String editTasks(@PathVariable long id, Model model) {
           Optional <ToDo> todo = toDoRepository.findById(id);
           model.addAttribute("todo", todo);

        return "editTasks";
    }

    @PostMapping("/todo/{id}/edit")
    public String saveUpdatedTask(@PathVariable long id, ToDo todo, Model model) {
        toDoRepository.save(todo);

        return "redirect:/todo" + id;
    }

}

//Extend the controller class with delete() method mapping to /{id}/delete