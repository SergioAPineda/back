package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.mappers.TodoMapper;
import co.com.sofka.crud.reporitories.TodoCRUDRepository;
import co.com.sofka.crud.reporitories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements TodoRepository {

    @Autowired
    private TodoCRUDRepository repository;

    @Autowired
    private TodoMapper mapper;

    @Override
    public Iterable<TodoDTO> getAll(){
        Iterable<Todo> todos = repository.findAll();
        return mapper.toTodoDTOS(todos);
    }

    @Override
    public TodoDTO save(TodoDTO todoDTO){
        Todo todo = mapper.toTodo(todoDTO);
        return mapper.toTodoDTO(repository.save(todo));
    }

    @Override
    public void delete(Long id){

        repository.delete(mapper.toTodo(get(id)));
    }

    @Override
    public TodoDTO get(Long id){

        return mapper.toTodoDTO(repository.findById(id).orElseThrow());
    }

}
