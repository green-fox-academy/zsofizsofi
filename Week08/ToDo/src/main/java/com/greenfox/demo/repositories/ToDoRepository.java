package com.greenfox.demo.repositories;

import com.greenfox.demo.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
