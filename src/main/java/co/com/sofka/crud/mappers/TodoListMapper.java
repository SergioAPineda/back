package co.com.sofka.crud.mappers;

import co.com.sofka.crud.dto.TodoListDTO;
import co.com.sofka.crud.entities.TodoList;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {TodoMapper.class})
public interface TodoListMapper {

    @Mappings({
            @Mapping(source = "id", target = "idDTO"),
            @Mapping(source = "name", target = "nameDTO"),
            @Mapping(source = "todos", target = "todosDTO")
    })
    TodoListDTO toTodoListDTO(TodoList todoList);
    Iterable<TodoListDTO> toTodoListDTOS(Iterable<TodoList> todoLists);

    @InheritInverseConfiguration
    TodoList toTodoList(TodoListDTO todoListDTO);
}
