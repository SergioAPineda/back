package co.com.sofka.crud.reporitories;

import co.com.sofka.crud.entities.TodoList;
import org.springframework.data.repository.CrudRepository;

public interface TodoListCRUDRepository extends CrudRepository<TodoList, Long> {
}
