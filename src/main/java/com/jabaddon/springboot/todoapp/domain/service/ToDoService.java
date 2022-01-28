package com.jabaddon.springboot.todoapp.domain.service;

import com.jabaddon.springboot.todoapp.domain.ToDo;
import com.jabaddon.springboot.todoapp.domain.repository.ToDoEntityManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private final ToDoEntityManagerRepository toDoEntityManagerRepository;

    public ToDoService(ToDoEntityManagerRepository toDoEntityManagerRepository) {
        this.toDoEntityManagerRepository = toDoEntityManagerRepository;
    }

    public ToDo save(ToDo newTodo) {
        return toDoEntityManagerRepository.save(newTodo);
    }

    public List<ToDo> findAll() {
        return toDoEntityManagerRepository.findAll();
    }
}
