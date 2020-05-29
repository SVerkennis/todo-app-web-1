package de.neuefische.todoapp.service;

import de.neuefische.todoapp.db.ToDoDb;
import de.neuefische.todoapp.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoservice {

    private final ToDoDb todos;

    @Autowired
    public ToDoservice(ToDoDb todos) {
        this.todos = todos;
    }

    public void addToDo(ToDo newToDo){
    todos.addToDo(newToDo);
    }

    public List<ToDo> getAllTodos() {
        return todos.getAllTodos();
    }
}
