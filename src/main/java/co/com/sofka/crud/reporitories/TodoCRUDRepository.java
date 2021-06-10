package co.com.sofka.crud.reporitories;

import co.com.sofka.crud.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoCRUDRepository extends CrudRepository<Todo, Long> {
}
