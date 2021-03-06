package co.com.sofka.crud.mappers;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entities.Todo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TodoMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "completed", target = "completed"),
            @Mapping(source = "groupListId", target = "groupListId")
    })
    TodoDTO toTodoDTO(Todo todo);
    Iterable<TodoDTO> toTodoDTOS(Iterable<Todo> todos);

    @InheritInverseConfiguration
    Todo toTodo(TodoDTO todoDTO);
}
