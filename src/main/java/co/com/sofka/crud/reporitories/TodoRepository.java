package co.com.sofka.crud.reporitories;

import co.com.sofka.crud.dto.TodoDTO;

public interface TodoRepository {

    public Iterable<TodoDTO> getAll();
    public TodoDTO get(Long id);
    public TodoDTO save(TodoDTO todoDTO);
    public void delete(Long id);
}
