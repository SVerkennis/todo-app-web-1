package de.neuefische.todoapp.db;

import de.neuefische.todoapp.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ToDoDb {


    private final List<ToDo> todos = new ArrayList<>(List.of(
            new ToDo("12345", "Wait what", "OPEN"),
            new ToDo("54321", "Help me", "DONE"),
            new ToDo("12121", "No clue", "IN_PROGRESS"),
            new ToDo("21212", "I need some Mate", "OPEN")
    ));



    public ToDo addToDo(ToDo newToDo) {
        String newtoDoId = UUID.randomUUID().toString();
        newToDo.setId(newtoDoId);
        newToDo.setStatus("OPEN");
        todos.add(newToDo);
        return newToDo;
    }

    public Optional<ToDo> getToDoById(String id) {
        for (ToDo toDo : todos) {
            if(toDo.getId().equals(id)) {
                Optional.of(toDo);
            }
        }
        return Optional.empty();
    }

    public void deleteToDo(String id) {
        todos.remove(getToDoById(id));
    }

    public List<ToDo> getAllTodos() {
        return todos;
    }
}