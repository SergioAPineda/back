package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoListDTO;
import co.com.sofka.crud.entities.TodoList;
import co.com.sofka.crud.mappers.TodoListMapper;
import co.com.sofka.crud.reporitories.TodoListCRUDRepository;
import co.com.sofka.crud.reporitories.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListService implements TodoListRepository {

    @Autowired
    private TodoListCRUDRepository repository;

    @Autowired
    private TodoListMapper mapper;

    @Override
    public Iterable<TodoListDTO> getAll(){
        Iterable<TodoList> todoLists = repository.findAll();
        return mapper.toTodoListDTOS(todoLists);
    }

    @Override
    public TodoListDTO save(TodoListDTO todoListDTO){
        TodoList todoList = mapper.toTodoList(todoListDTO);
        return mapper.toTodoListDTO(repository.save(todoList));
    }

    @Override
    public void delete(Long id) {
        repository.delete(mapper.toTodoList(get(id)));
    }

    @Override
    public TodoListDTO get(Long id){

        return mapper.toTodoListDTO(repository.findById(id).orElseThrow());
    }
}
