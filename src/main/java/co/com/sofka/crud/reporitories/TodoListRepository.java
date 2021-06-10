package co.com.sofka.crud.reporitories;

import co.com.sofka.crud.dto.TodoListDTO;

public interface TodoListRepository {

    public Iterable<TodoListDTO> getAll();
    public TodoListDTO get(Long id);
    public TodoListDTO save(TodoListDTO todoListDTO);
    public void delete(Long id);
}
