package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.ToDo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/todo")

public class TodoController {

    private final List<ToDo> todos = new ArrayList<>(List.of(
            new ToDo("12345", "Wait what", "OPEN")
    ));

    @GetMapping
    public List<ToDo> getTodos() {
        return todos;
    }


}
