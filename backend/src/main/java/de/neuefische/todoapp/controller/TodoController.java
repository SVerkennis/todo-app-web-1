package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.ToDo;
import de.neuefische.todoapp.service.ToDoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/todo")

public class TodoController {

    private final ToDoservice todos;

    @Autowired
    public TodoController(ToDoservice todos) {
        this.todos = todos;
    }

    @GetMapping
    public List<ToDo> getTodos() {
        return todos.getAllTodos();
    }

    @PutMapping
    public ToDo addToDo(@RequestBody ToDo newToDo){
        todos.addToDo(newToDo);
        return newToDo;
    }


}
